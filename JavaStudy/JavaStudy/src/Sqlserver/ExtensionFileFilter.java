package Sqlserver;

import java.io.File;
import java.util.ArrayList;

import javax.swing.filechooser.FileFilter;

public class ExtensionFileFilter extends FileFilter {

	private String Description;
	private ArrayList<String> extensions = new ArrayList<String>();
	
	public void AddExtension(String extension) {
		if(!extension.startsWith(".")) {
			extension = "." + extension;
		}
		extensions.add(extension.toLowerCase());
	}
	
	public void setDescription(String desc) {
		Description = desc;
	}
	
	@Override
	public boolean accept(File f) {
		// TODO Auto-generated method stub
		if(f.isDirectory()) return true;
		String name = f.getName().toLowerCase();
		for (String extension : extensions) {
			if(name.endsWith(extension)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		
		return Description;
	}
	
}
