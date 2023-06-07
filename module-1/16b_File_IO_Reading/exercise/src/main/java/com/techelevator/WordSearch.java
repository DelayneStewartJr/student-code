package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		WordSearch wordSearch = new WordSearch();
		wordSearch.run();
	}

	public void run() {
		/* Your code goes here */
		WordSearch wordSearch = new WordSearch();
		System.out.println("what is the fully qualified name of the file that should searched?");
		String path = userInput.nextLine();
		File filePath = new File(path);

		System.out.println("what is the search word you are looking for?");
		String searchWord = userInput.nextLine();
		System.out.println("Should the search be case sensitive? (Y\\N)");
		String answer = userInput.nextLine();

		int lineCount = 1;

			try (Scanner inputScanner = new Scanner(filePath)) {
				while (inputScanner.hasNextLine()){
					String line = inputScanner.nextLine();
					if (answer.equalsIgnoreCase("N")){
						if(line.toLowerCase(Locale.ROOT).contains(searchWord.toLowerCase(Locale.ROOT))){
							System.out.println(lineCount +") " + line);
						}

					}
					if (line.contains(searchWord)){
						System.out.println(lineCount +") " + line);
					}
					lineCount++;
				}
			}
			catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			}

	}

}
