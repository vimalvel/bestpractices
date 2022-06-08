package com.chainsys.besstPractices.decouple;

public class WoodenWheel implements Iwheel {
	public static String location;
	public void  rotate() {
		System.out.println("WoodenWheel Wheel rotating");
	}
	public void stopRotation() {
		System.out.println("Woodenwheel Wheel Stop");
	}

}
