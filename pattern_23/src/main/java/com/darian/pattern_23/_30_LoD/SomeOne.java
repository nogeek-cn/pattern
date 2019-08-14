package com.darian.pattern_23._30_LoD;

public class SomeOne {
	public void play(Friend friend){
		System.out.println("someone play");
		friend.play();
	}
	
	public void play(Stranger stranger) {
		System.out.println("someone play");
		stranger.play();
	}
}
