package com.bit2020.chpater03.tv;

public class Tv {

	private int channel;
	private int volume;
	private boolean power;
	
	public void status() {
		System.out.println("TV[power="+ power + ", channel =" + channel + ", volume =" + volume +"]");
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
