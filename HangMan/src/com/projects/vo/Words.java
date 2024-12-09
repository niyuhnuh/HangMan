package com.projects.vo;

import java.util.HashSet;
import java.util.Set;

public class Words {
	private Set<String> words;
	
	public Words() {
		words = new HashSet<>();
	}
	
	public void initializeWords() {
		System.out.println("Initializing words....");
		//Get input from txt file
		words.add("bag");
		
	}
	
	public Set<String> getWords(){
		return words;
		
	}

	public void loadEasyWords() {
		System.out.println("Easy word is selected");
	}

	public void loadMediumWords() {
		System.out.println("Medium word is selected");
	}

	public void loadHardWords() {
		System.out.println("Hard word is selected");
	}

}
