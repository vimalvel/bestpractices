package com.chainsys.besstPractices.decouple;

// Objects of this class can work only with any engine, and with any wheels
// The car clas is  decoupled from petrolengine class, and Steeelwheel Class
public class Car {
	
private  Iengine engine;// early bound with  engine interface
private  Iwheel[] wheels;// early bound with steel wheel


public Car(Iengine engine,Iwheel[] wheel) {
	this.engine=engine;
	this.wheels=wheel;
	}
public void StartCar() {
	engine.start();
	wheels[0].rotate();
	wheels[1].rotate();
	wheels[2].rotate();
	wheels[3].rotate();
}
public Iwheel[] getWheels() {
	return this.wheels;
}
	
}

