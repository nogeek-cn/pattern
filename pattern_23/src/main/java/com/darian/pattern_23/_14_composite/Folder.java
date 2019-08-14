package com.darian.pattern_23._14_composite;

import java.util.ArrayList;
import java.util.List;

/***
 * 文件夹的抽象
 */
public class Folder implements IFile{
	private String name;
	private List<IFile> children;
	
	public Folder(String name) {
		this.name = name;
		children = new ArrayList<>();
	}
	

	public void display() {
		System.out.println(name);
	}

	public List<IFile> getChild() {
		return children;
	}


	public boolean add(IFile file) {
		return children.add(file);
	}


	public boolean remove(IFile file) {
		return children.remove(file);
	}


}
