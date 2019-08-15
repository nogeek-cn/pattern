package com.darian.pattern_23._10_observer.darian;

import java.util.Observable;

public class BlogUser extends Observable {

    public void publishBlog(String articleTitle, String articleContent) {
        Article art = new Article();
        art.setArticleTitle(articleTitle);
        art.setArticleContent(articleContent);
        System.out.println("BlogUser#publishBlog get articleTitle :" + articleTitle + ", get articleContent : " + articleContent);
        this.setChanged();
        this.notifyObservers(art);
    }
}
