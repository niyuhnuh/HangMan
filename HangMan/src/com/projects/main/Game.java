package com.projects.main;

import java.util.Scanner;

import com.projects.vo.GuessValidator;
import com.projects.vo.Words;

public class Game {
	private Words words;
	private GuessValidator guessValidator;
	private Scanner scanner;

	public Game(Words words) {
		this.words = words;
		this.guessValidator = new GuessValidator();
		this.scanner = new Scanner(System.in);
	}

	public void play() {
		System.out.println("Game is starting");
		askGameDifficulty();
		words.wordRandomizer();
		
		//
	}


	private void askGameDifficulty() {
		System.out.println("Choose a difficulty level: ");
		System.out.println("(1) Easy");
		System.out.println("(2) Medium");
		System.out.println("(3) Hard");

		int input = validateInput();

		switch (input) {
		case 1:
			words.loadEasyWords();
			break;
		case 2:
			words.loadMediumWords();
			break;
		case 3:
			words.loadHardWords();
			break;
		}

	}

	private int validateInput() {
		int choice = 0;
		boolean validChoice = false;

		while (!validChoice) {
			try {
				choice = Integer.parseInt(scanner.nextLine().trim());

				if (choice >= 1 && choice <= 3) {
					validChoice = true;
				} else {
					System.out.println("Invalid choice. Please enter a number between 1 and 3.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a number between 1 and 3.");
			}
		}
		return choice;
	}

}
