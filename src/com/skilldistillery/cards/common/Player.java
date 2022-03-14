package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// Variables
	private String name;

	// Constructors
	public Player() {
	}
	
	
	// Start G&S ****************************************

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	// End G&S ****************************************

	
}
