package com.bptn.course.week2.solidDesignPrinciples.dip;

//Abstraction (Interface) for smart devices
interface SmartDevice {
	void turnOn();

	void turnOff();
}

//Concrete implementation for a light bulb
class LightBulb implements SmartDevice {
	@Override
	public void turnOn() {
		System.out.println("Light bulb turned on.");
	}

	@Override
	public void turnOff() {
		System.out.println("Light bulb turned off.");
	}
}

//Concrete implementation for a thermostat
class Thermostat implements SmartDevice {
	@Override
	public void turnOn() {
		System.out.println("Thermostat turned on.");
	}

	@Override
	public void turnOff() {
		System.out.println("Thermostat turned off.");
	}
}

//Abstraction (Interface) for a home automation controller
interface AutomationController {
	void controlDevice(SmartDevice device);
}

//Concrete implementation for a basic home automation controller
class BasicAutomationController implements AutomationController {
	@Override
	public void controlDevice(SmartDevice device) {
		// Basic controller logic
		device.turnOn();
		device.turnOff();
	}
}

public class Main {
	public static void main(String[] args) {
		// Instantiate smart devices
		SmartDevice lightBulb = new LightBulb();
		SmartDevice thermostat = new Thermostat();

		// Instantiate a home automation controller
		AutomationController controller = new BasicAutomationController();

		// Control devices using the controller
		controller.controlDevice(lightBulb);
		controller.controlDevice(thermostat);
	}
}
