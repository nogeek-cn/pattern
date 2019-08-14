package com.darian.pattern_23._30_LoD.darian.ex2;

public class SomeOne {
	public void play(Friend friend){
		System.out.println("someone play");
		friend.play();
		Stranger stranger = friend.getStranger();
		stranger.play();
	}
}
