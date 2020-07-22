package com.bit2020.chpater03.tv;

public class Tv {

	private int channel;
	private int volume;
	private boolean power;

	public Tv(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public Tv() {
		super();

	}

	public void power(boolean on) {

		this.power = on;
	}

	void channel(int channel) {
		if(channel > 255 ||channel < 1 ) {
			System.out.println("설정 불가합니다.");
			return;
		}
		this.channel = channel;
	}

	void channel(boolean up) {
		if(this.channel >= 255 ||this.channel <= 1 ) {
			System.out.println("설정 불가합니다.");
			return;
		}
		if (up) {
			this.channel++;
		} else {
			this.channel--;
		}
	}

	void volume(int voluem) {

		if(volume > 100 ||volume < 0 ) {
			System.out.println("설정 불가합니다.");
			return;
		}
		this.volume = voluem;
	}

	void volume(boolean up) {
		if(this.volume >= 100 ||this.volume <= 0 ) {
			System.out.println("설정 불가합니다.");
			return;
		}
		if (up) {
			this.volume++;
		} else {
			this.volume--;
		}
	}

	public void status() {
		System.out.println("TV[power=" + power + ", channel =" + channel + ", volume =" + volume + "]");
	}

	public int getChannel() {
		return channel;
	}

	public boolean isPower() {
		return power;
	}

	public int getVolume() {
		return volume;
	}

}
