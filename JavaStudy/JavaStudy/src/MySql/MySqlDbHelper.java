package MySql;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlDbHelper {
	final String DriverName = "com.mysql.jdbc.Driver";
	final String ConnectionString = "jdbc:114.115.214.130:3306/JavaStudy";
	final String UserName="root";
	final String UserPwd = "19900629";
	private java.sql.Connection connection;
	
	private void OpenConn() {
		//加载驱动
		try {
			Class.forName(DriverName);
			String sql="";
			connection = DriverManager.getConnection(ConnectionString, UserName, UserPwd);
			Statement statement = connection.createStatement();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			connection=null;
		}
		
	}
}
