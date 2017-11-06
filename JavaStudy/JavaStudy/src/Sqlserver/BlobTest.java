package Sqlserver;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

import com.microsoft.sqlserver.jdbc.*;

public class BlobTest {
	
	private JFrame frame = new JFrame("图片测试程序");
	private static Connection connection;
	private static PreparedStatement insert;
	private static PreparedStatement query;
	private static PreparedStatement queryAll;
	private DefaultListModel<ImageHolder> imageModel = new DefaultListModel<ImageHolder>();
	private JList<ImageHolder> imageList = new JList<ImageHolder>();
	private JTextField filePath = new JTextField(26);
	private JButton browserBn = new JButton("上传");
	private JLabel imageLabel = new JLabel();
	JFileChooser chooser = new JFileChooser();
	ExtensionFileFilter filter = new ExtensionFileFilter();
	
	static {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("sqlserver.ini"));
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String userName = properties.getProperty("userName");
			String passWord = properties.getProperty("passWord");
			String databaseName = properties.getProperty("databaseName");
			Class.forName(driver);
			connection = DriverManager.getConnection(url+";"+databaseName, userName, passWord);
			insert = connection.prepareStatement("insert into img_table values(null,?,?)",Statement.RETURN_GENERATED_KEYS);
			query = connection.prepareStatement("select img_data from img_table where img_id = ?");
			queryAll = connection.prepareStatement("select img_id,img_name from img_table");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void Init() {
		filter.AddExtension("jpg");
		filter.AddExtension("png");
		filter.setDescription("图片文件");
		chooser.addChoosableFileFilter(filter);
		chooser.setAcceptAllFileFilterUsed(false);
		
	}
	
	public void fillListModel() {
		try {
			ResultSet resultSet = queryAll.executeQuery();
			imageModel.clear();
			while(resultSet.next()) {
				imageModel.addElement(new ImageHolder(resultSet.getInt("img_id"),resultSet.getString("img_name")));
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
