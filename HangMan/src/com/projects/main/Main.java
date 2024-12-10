package com.projects.main;

import java.io.IOException;

import com.projects.vo.Words;

public class Main {
	public static void main(String[] args) throws IOException {
		//Initialize words for the game from input txt file
		Words words = new Words();
		Game hangManGame = new Game(words);
		String filePath = "input.txt";
		words.initializeWords(filePath);
		//Play the game
		hangManGame.play();
	}
}
