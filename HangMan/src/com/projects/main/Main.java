package com.projects.main;

import com.projects.vo.Words;

public class Main {
	public static void main(String[] args) {
		//Initialize words for the game from input txt file
		Words words = new Words();
		Game hangManGame = new Game(words);
		words.initializeWords();
		//Play the game
		hangManGame.play();
	}
}
