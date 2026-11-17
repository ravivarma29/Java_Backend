package com.remotes;

public class TvRemote extends Remote {
	
	int volume=0;
	
	@Override
	void turnOn()
	{
		System.out.println("Smasung Tv is Turn on");
	}
	void increaseVolume() {
		this.volume=this.volume+1;
		System.out.println("increase Volume " + volume);
	}
		static void turnOff()
		{
			
		}

	void increaseVolume(int volume)
	{
		this.volume+=volume;
		System.out.println("Volume "+ this.volume);
	}

}
