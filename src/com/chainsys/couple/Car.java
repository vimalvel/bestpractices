package com.chainsys.bestPractices.couple;

// Objects of this class can work only with petrol engine and steel wheels
// The car clas is tightly coupled with petrolengine class and Steeel Class
public class Car {
	
private  PetrolEngine engine;// early bound with petrol engine
private SteelWheels[] wheels;// early bound with steel wheel

public Car() {
	engine=new PetrolEngine();
	wheels=new SteelWheels[4];
	wheels[0]=new SteelWheels();
	wheels[0].location="front left";
	wheels[1]=new SteelWheels();
	wheels[1].location="front right";
	wheels[2]=new SteelWheels();
	wheels[2].location="back left";
	wheels[3]=new SteelWheels();
	wheels[3].location="back right";
}
public Car(PetrolEngine engine,SteelWheels[] wheel) {
	this.engine=engine;
	this.wheels=wheel;
	wheels=new SteelWheels[4];
	wheels[0].location="front left";
	wheels[1].location="front right";
	wheels[2].location="back left";
	wheels[3].location="back right";
}
public void StartCar() {
	engine.start();
	wheels[0].rotate();
	wheels[1].rotate();
	wheels[2].rotate();
	wheels[3].rotate();
}
public SteelWheels[] getWheels() {
	return this.wheels;
}
	
}

