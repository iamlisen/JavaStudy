package AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Desktop.Action;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTest {

	Frame frame = new Frame("测试");
	Button ok = new Button("确定");
	TextField tx = new TextField(30);
	public void init() {
		ok.addActionListener(new OKListner());
		frame.add(tx);
		frame.add(ok,BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
	
	public class OKListner implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			System.out.println("点击了确定按钮");
			tx.setText("点击了确定按钮");
		}
	}
	
	public static void main(String[] args) {
		new FrameTest().init();
	}
}
