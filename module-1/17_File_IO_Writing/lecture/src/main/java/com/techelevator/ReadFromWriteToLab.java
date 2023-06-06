package com.techelevator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromWriteToLab {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        ReadFromWriteToLab readFromWriteToLab = new ReadFromWriteToLab();
        readFromWriteToLab.run();
    }

    public void run() {
        try (userInput) {  //note: end of this try block is the last line of runnable app code.

            /** Your code goes here */

            //1.  Prompt user for the search word to remove  - handle if user input is empty


            //2.  Prompt user for the location of the source file


            //3.  Validate the input source file.  Tools to consider: if, else if, exists() and isFile() methods


            //4.  Prompt user for the location of the destination file - handle IF user input is empty


            //5.  Validate the destination file is a .txt file. Tools to consider: if, endsWith() String method


            //6.  Remove search word entered on step 1.  Tools to consider: String method replaceAll()


        }
    }
}