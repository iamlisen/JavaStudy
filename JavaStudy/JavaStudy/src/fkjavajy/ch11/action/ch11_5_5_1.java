package fkjavajy.ch11.action;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ch11_5_5_1 implements ActionListener{

	public ch11_5_5_1() {
		// TODO Auto-generated constructor stub
	}
	
	private TextField textField;
	
	public ch11_5_5_1(TextField textField) {
		this.textField = textField;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		textField.setText("123");
	}

}
