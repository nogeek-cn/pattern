package com.darian.pattern_23._14_composite;

import java.util.List;

/**
 * 文件的抽象
 **/
public class File implements IFile {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }

    @Deprecated
    public List<IFile> getChild() {
        return null;
    }

    @Deprecated
    public boolean add(IFile file) {
        return false;
    }

    @Deprecated
    public boolean remove(IFile file) {
        return false;
    }

}
