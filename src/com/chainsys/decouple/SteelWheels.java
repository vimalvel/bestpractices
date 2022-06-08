package com.chainsys.besstPractices.decouple;

public class SteelWheels implements Iwheel {
	public static String location;
	public void  rotate() {
		System.out.println("Steel Wheel rotating");
	}
	public void stopRotation() {
		System.out.println("Steel Wheel Stop");
	}

}
