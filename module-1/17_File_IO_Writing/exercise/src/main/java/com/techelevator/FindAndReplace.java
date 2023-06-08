package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FindAndReplace findAndReplace = new FindAndReplace();
        findAndReplace.run();
    }

    public void run() {
        /* Your code goes here */
        try(userInput){
            System.out.println("What is the search word");
            String searchWord = userInput.nextLine();

            System.out.println("What is the replacement word");
            String replacementWord = userInput.nextLine();

            System.out.println("What is source file");
            String sourceFilePath = userInput.nextLine();
                File sourceFile = new File(sourceFilePath);

            System.out.println("What is destination file");
            String destinationFilePath = userInput.nextLine();
                File destinationFile = new File(destinationFilePath);

            try( Scanner sourceFileScanner = new Scanner(sourceFile);
                PrintWriter newFile = new PrintWriter(destinationFile)){
                while(sourceFileScanner.hasNextLine()) {
                    String sourceLine = sourceFileScanner.nextLine();
                    if (sourceLine.contains(searchWord)){
                        sourceLine = sourceLine.replaceAll(searchWord, replacementWord);
                     }
                    newFile.println(sourceLine);


                }
            }

            } catch (FileNotFoundException e){
                System.out.println("File is not found");

        }

    }

}
