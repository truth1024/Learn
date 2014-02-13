package com.truth99.designpattern.TemplateMethod.solution.example1;


public class PassengerByTrain extends HappyPeople {

	@Override
	public void travel() {
		System.out.println("Travelling by train...");
	}

}
