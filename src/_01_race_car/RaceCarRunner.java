package _01_race_car;

import javax.swing.JOptionPane;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar cars1 = new RaceCar("car1", 5); 
		// 2. Print the RaceCar's position in the race
		System.out.println(cars1.getPositionInRace());
		// 3. Crash the RaceCar 
		cars1.crash();
		
		// 4. If the car is damaged. Bring it in for a pit stop.
		if(cars1.isDamaged()) {
		cars1.pit();	
		}
		// 5. Help the car move into first place.
		cars1.overtake();
		cars1.overtake();
		cars1.overtake();
		cars1.overtake();
		cars1.overtake();
		cars1.overtake();
		cars1.overtake();
	}
}
