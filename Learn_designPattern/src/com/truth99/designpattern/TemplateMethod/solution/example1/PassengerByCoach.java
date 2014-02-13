package com.truth99.designpattern.TemplateMethod.solution.example1;


public class PassengerByCoach extends HappyPeople {

	@Override
	public void travel() {
		System.out.println("Travelling by coach...");
	}

}
