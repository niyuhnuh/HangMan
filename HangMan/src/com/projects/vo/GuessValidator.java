package com.projects.vo;

import java.util.HashSet;
import java.util.Set;

public class GuessValidator {
	private Set<Character> correctGuesses;
	private Set<Character> incorrectGuesses;
	public GuessValidator() {
		this.correctGuesses = new HashSet<>();
		this.incorrectGuesses = new HashSet<>();
	}
}
