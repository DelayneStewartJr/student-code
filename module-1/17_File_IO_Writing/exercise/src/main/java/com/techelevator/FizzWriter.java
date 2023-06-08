package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		FizzWriter fizzWriter = new FizzWriter();
		fizzWriter.run();
	}

	public void run() {
		/* Your code goes here */
		try (userInput) {
			System.out.println("What is the destination file?");
			String destinationFile = userInput.nextLine();
			File newFile = new File(destinationFile);

			try( PrintWriter printWriter = new PrintWriter(newFile)){
				for( int i = 1; i <= 300; i++) {
					boolean isDivisibleBy5 = i % 5 == 0 ;
					boolean isDivisibleBy3 = i % 3 == 0 ;
					if ( isDivisibleBy3 && isDivisibleBy5){
						printWriter.println("FizzBuzz");
					} else if (isDivisibleBy3){
						printWriter.println("Fizz");
					} else if ( isDivisibleBy5) {
						printWriter.println("Buzz");
					}else {
						printWriter.println(i);
					}

				}





			} catch (FileNotFoundException e){
				System.out.println("Invalid destination file");
			}

		}

	}
}
