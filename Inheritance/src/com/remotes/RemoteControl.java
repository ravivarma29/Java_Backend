package com.remotes;

public class RemoteControl {	
	//Override method
	public static void main(String[] args) {
		TvRemote tv=new TvRemote();
		tv.turnOn();
		tv.increaseVolume();
		tv.increaseVolume(5);
		
	AcRemote ac=new AcRemote();
	ac.turnOn();
	}	

}
