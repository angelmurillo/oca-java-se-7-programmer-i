package com.ocajexam.tutorial;

import com.ocajexam.tutorial.planets.Earth;
import com.ocajexam.tutorial.planets.Mars;
import com.ocajexam.tutorial.planets.Venus;

public class GreetingsUniverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Greetings, Universe!");
		Earth earth = new Earth();
		Venus venus = new Venus();
		Mars mars = new Mars();

	}

}
