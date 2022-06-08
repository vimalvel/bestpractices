package com.chainsys.besstPractices.decouple;

public class TestCar {

	public static void main(String[] args) {
		PetrolEngine p = new PetrolEngine();
		SteelWheels[] swheels = new SteelWheels[4];
		swheels[0] = new SteelWheels();
		swheels[0].location = "Front left";
		swheels[1] = new SteelWheels();
		swheels[1].location = "Front right";
		swheels[2] = new SteelWheels();
		swheels[2].location = "back left";
		swheels[3] = new SteelWheels();
		swheels[3].location = "back right";
		Car car = new Car(p, swheels);
		car.StartCar();
		SteelWheels[] carWheels = (SteelWheels[]) car.getWheels();
		int length = carWheels.length;
		for (int i = 0; i < length; i++) {
			System.out.println(carWheels[i].location);
		}
	
DieselEngine pe = new DieselEngine();
	WoodenWheel[] wwheels=new WoodenWheel[4];
	wwheels[0]=new WoodenWheel();
	wwheels[0].location="Front left";
	wwheels[1]=new  WoodenWheel();
	wwheels[1].location="Front right";
	wwheels[2]=new  WoodenWheel();
	wwheels[2].location="back left";
	wwheels[3]=new  WoodenWheel();
	wwheels[3].location="back right";
	Car seccar = new Car(pe, wwheels);
	seccar.StartCar();
	
	}
}

