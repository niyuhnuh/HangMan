package com.projects.vo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Random;

public class Words {
	private Set<String> words;
	private Random random;

	public Words() {
		words = new HashSet<>();
		random = new Random();
	}

	public void initializeWords(String filePath) throws FileNotFoundException, IOException {
		System.out.println("Initializing words....");
		Set<String> uniqueWords = new HashSet<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;

			while ((line = reader.readLine()) != null) {
				if (line.trim().isEmpty())
					continue;
				String word = line.trim();
				if (!word.isEmpty() && word.length() > 3) {
					uniqueWords.add(word);
				}
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		this.words = uniqueWords;
	}

	public Set<String> getWords() {
		return words;

	}

	public void loadEasyWords() {
		System.out.println("Easy word is selected");
		Set<String> easyWords = new HashSet<>();
		
		for(String word : words) {
			if(word.length() >= 3 && word.length() <=5) {
				easyWords.add(word);
			}
		}
		
		words = new HashSet<>(easyWords);
	}

	public void loadMediumWords() {
		System.out.println("Medium word is selected");
	
		Set<String> mediumWords = new HashSet<>();
		
		for(String word : words) {
			if(word.length() >= 6 && word.length() <=8) {
				mediumWords.add(word);
			}
		}
		
		words = new HashSet<>(mediumWords);
	}

	public void loadHardWords() {
		System.out.println("Hard word is selected");
		
		Set<String> hardWords = new HashSet<>();
		
		for(String word : words) {
			if(word.length() >= 9) {
				hardWords.add(word);
			}
		}
		
		words = new HashSet<>(hardWords);
	}

	public String wordRandomizer() {
        List<String> wordList = new ArrayList<>(words);
        return wordList.get(random.nextInt(wordList.size()));
    }
}
