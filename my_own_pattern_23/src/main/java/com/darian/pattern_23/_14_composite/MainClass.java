package com.darian.pattern_23._14_composite;

import java.util.List;


public class MainClass {
    public static void main(String[] args) {
        //C盘
        Folder rootFolder = new Folder("C:");
        // darianOne 目录
        Folder darianOneFolder = new Folder("darianOne");
        // darianOne.txt文件
        File darianOneFile = new File("darianOne.txt");

        rootFolder.add(darianOneFile);
        rootFolder.add(darianOneFolder);


        // darianOne 目录
        Folder darianTwoFolder = new Folder("darianTwo");
        File darianTwoFile = new File("darianTwo.txt");
        darianOneFolder.add(darianTwoFile);
        darianOneFolder.add(darianTwoFolder);


        Folder darianThreeFolder = new Folder("darianThree");
        File darianThreeFile = new File("darianThree.txt");
        darianTwoFolder.add(darianThreeFile);
        darianTwoFolder.add(darianThreeFolder);


        displayTree(rootFolder, 0);

    }

    public static void displayTree(IFile rootFolder, int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("   ");
        }

        System.out.print("|--");
        //显示自身的名称
        rootFolder.display();
        //获得子树
        List<IFile> children = rootFolder.getChild();
        //遍历子树
        for (IFile file : children) {
            if (file instanceof File) {
                for (int i = 0; i <= deep; i++) {
                    System.out.print("   ");
                }
                System.out.print("|--");
                file.display();
            } else {
                displayTree(file, deep + 1);
            }
        }
    }
}
