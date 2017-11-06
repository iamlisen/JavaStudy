package fkjavajy.ch11.action;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.naming.InitialContext;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class ch12_2_1 {

	private JFrame frame = new JFrame("测试");
	private JCheckBox checkBoxSure = new JCheckBox("确定");
	private JCheckBox checkBoxUnSure = new JCheckBox("不确定");
	
	private void Init() {
		frame.setBounds(0, 0, 600, 600);
		JProgressBar progressBar = new JProgressBar(0, 100);
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(checkBoxSure);
		box.add(checkBoxUnSure);
		frame.setLayout(new FlowLayout());
		frame.add(box);
		frame.add(progressBar);
		progressBar.setIndeterminate(false);
		for(int i=0;i<100;i++) {
			progressBar.setValue(i);
			try {
			Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch12_2_1().Init();
	}

}
