package com.darian.pattern_23._10_observer.darian;

import java.util.Observable;
import java.util.Observer;

public class MyObServer implements Observer {

	public void update(Observable o, Object arg) {
		Article art = (Article)arg;
		
		System.out.println("MyObServer -- update().....");
		System.out.println("MyObServer#update-- get articleTitle :" + art.getArticleTitle());
		System.out.println("MyObServer#update-- get articleContent :" + art.getArticleContent());
	}

}
