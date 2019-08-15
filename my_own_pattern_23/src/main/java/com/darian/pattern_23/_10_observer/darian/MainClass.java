package com.darian.pattern_23._10_observer.darian;

public class MainClass {
    public static void main(String[] args) {
        BlogUser user = new BlogUser();
        user.addObserver(new MyObServer());
        user.publishBlog("aritcleTitle", "aritcleContent");
    }
}
