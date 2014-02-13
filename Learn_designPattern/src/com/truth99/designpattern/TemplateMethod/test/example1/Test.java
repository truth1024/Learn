package com.truth99.designpattern.TemplateMethod.test.example1;

import com.truth99.designpattern.TemplateMethod.solution.example1.HappyPeople;
import com.truth99.designpattern.TemplateMethod.solution.example1.PassengerByAir;
import com.truth99.designpattern.TemplateMethod.solution.example1.PassengerByCoach;
import com.truth99.designpattern.TemplateMethod.solution.example1.PassengerByTrain;

public class Test {

	public static void main(String[] args) {
		HappyPeople passengerByAir = new PassengerByAir();
		HappyPeople passengerByCoash = new PassengerByCoach();
		HappyPeople passengerByTrain = new PassengerByTrain();
		
		System.out.println("\nTom:");
		passengerByAir.celeberateSpringFestival();
		System.out.println("\nJimmy:");
		passengerByCoash.celeberateSpringFestival();
		System.out.println("\nLucy:");
		passengerByTrain.celeberateSpringFestival();
	}

}
