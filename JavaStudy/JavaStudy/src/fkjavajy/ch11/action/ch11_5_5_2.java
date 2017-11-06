package fkjavajy.ch11.action;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class ch11_5_5_2 {
	Frame frame = new Frame("测试");
	TextField textField = new TextField(30);
	Button button = new Button("确定");
	
	public void Init() {
		frame.add(textField);
		frame.add(button,BorderLayout.SOUTH);
		button.addActionListener(new ch11_5_5_1(textField));
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch11_5_5_2().Init();
	}

}
