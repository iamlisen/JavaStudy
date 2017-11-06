package fkjavajy.ch11.action;

import java.awt.BorderLayout;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.security.auth.kerberos.KerberosKey;

public class ch11_5_6_1 {

	Frame frame = new Frame("测试");
	MenuBar menuBar = new MenuBar();
	Menu menuFile = new Menu("文件");
	Menu menuEdit = new Menu("编辑");
	MenuItem menuItemNew = new MenuItem("新建");
	MenuItem menuItemOpen = new MenuItem("打开", new MenuShortcut(KeyEvent.VK_O, false));
	
	/*
	 * 创建右键菜单 
	 */
	private PopupMenu popupMenu = new PopupMenu();
	CheckboxMenuItem checkboxMenuItem = new CheckboxMenuItem("选择", true);
	Menu popMenu = new Menu("格式");
	
	public void Init() {
		
		popMenu.add(checkboxMenuItem);
		popupMenu.add(popMenu);
		Panel panel =new Panel();
		frame.add(panel,BorderLayout.EAST);
		panel.add(popupMenu);
		panel.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				popupMenu.show(panel, e.getX(), e.getY());
			}
		});
		menuItemNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("点击了新建按钮");
			}
		});
		menuItemOpen.addActionListener(e -> {
			System.out.println("点击了打开按钮");
		});
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		menuFile.add(menuItemNew);
		menuFile.add(menuItemOpen);
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		frame.setBounds(0, 0, 300, 300);
		frame.setBackground(Color.GREEN);
		frame.setMenuBar(menuBar);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch11_5_6_1().Init();
	}

}
