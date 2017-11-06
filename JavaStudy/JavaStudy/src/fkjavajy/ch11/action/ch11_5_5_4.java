package fkjavajy.ch11.action;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ch11_5_5_4 {

	Frame frame = new Frame("测试");
	TextArea textArea = new TextArea(6, 40);
	
	public void Init() {
		frame.setBounds(0, 0, 200, 200);
		frame.add(textArea);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch11_5_5_4().Init();
	}

}
