package fkjavajy.ch11.action;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ch11_5 {

	private Frame frame = new Frame("测试");
	private Button button = new Button("确定");
	private TextField textField = new TextField(30);
	private Frame frame2 = new Frame("测试2");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch11_5().Init();
	}

	/**
	 * 
	 * @author 木子网
	 * @WebSite www.lisen.me
	 * @Email lisen@lisen.me
	 */
	public void Init() {
		button.addActionListener(new OKListner());
		textField.addTextListener(new textFieldListner());
		frame.addWindowListener(new windowListner());
		frame2.addWindowListener(new windowAdapter());
		frame.setBounds(30, 30, 200, 200);
		frame2.setBounds(30, 30, 200, 200);
		frame.add(textField);
		frame.add(button, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * 内部类实现事件监听
	 * 
	 * @author 木子网
	 *
	 */
	class OKListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			textField.setText(e.getActionCommand());
			frame2.show(true);
		}

	}

	class textFieldListner implements TextListener {

		@Override
		public void textValueChanged(TextEvent e) {
			// TODO Auto-generated method stub
			System.out.println(textField.getText());
		}
	}
	
	class windowListner implements WindowListener{

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public class windowAdapter extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			frame2.setVisible(false);
		}
	}
}
