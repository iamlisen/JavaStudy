package fkjavajy.ch11.action;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class ch12_2_2 {
	JFrame frame = new JFrame("测试");
	DefaultMutableTreeNode root;
	DefaultMutableTreeNode province;
	DefaultMutableTreeNode city;
	
	public void Init() {
		root = new DefaultMutableTreeNode("中国");
		province = new DefaultMutableTreeNode("山东");
		city = new DefaultMutableTreeNode("济南");
		root.add(province);
		province.add(city);
		JTree tree = new JTree(root);
		frame.add(tree);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
