package com.techelevator;

public class Examples {

	public static void main(String[] args) {
		int x;
		int y;

		System.out.println("*******************************************");
		System.out.println("**** INCREMENT AND DECREMENT OPERATORS ****");
		System.out.println("*******************************************");
		System.out.println();

		/* The ++ operator increments a variable by 1 (i.e. adds one to the
		 * value of the variable and assigns the result to the variable) */
		x = 1;
		System.out.println("x == " + x);
		x++;
		System.out.println("x++ == " + x);
		System.out.println();

		/* The -- operator decrements a variable by 1 (i.e. subtracts one from the
		 * value of the variable and assigns the result to the variable) */
		x = 1;
		System.out.println("x == " + x);
		x--;
		System.out.println("x-- == " + x);
		System.out.println();

		// when the ++ is used as a postfix operator the increment is performed after evalutation
		System.out.println("x = 1");
		x = 1;
		System.out.println("y = x++");
		y = x++;
		System.out.println("x == " + x);
		System.out.println("y == " + y);
		System.out.println();

		// when the ++ is used as a prefix operator the increment is performed before evalutation
		System.out.println("x = 1");
		x = 1;
		System.out.println("y = ++x");
		y = ++x;
		System.out.println("y == " + y);
		System.out.println("x == " + x);
		System.out.println();

		System.out.println("****************************************");
		System.out.println("**** SHORTHAND ASSIGNMENT OPERATORS ****");
		System.out.println("****************************************");
		System.out.println();

		/* The "shorthand operators" are ( += -= *= ).  They have the
		 * effect of applying the arithmetic operator on the variable
		 * on the left and the expression on the right and then assigning
		 * the result to the variable on the left.
		 *
		 * So, this:
		 *
		 *     x = x + 2;
		 *
		 * Is equivalent to this:
		 *
		 *     x += 2;
		 */
		System.out.println("x = 0");
		x = 0;
		System.out.println("y = 0");
		y = 0;

		System.out.println("x += 5");
		x += 5;
		System.out.println("x == " + x);

		// the right hand side of the operator can be an expression
		System.out.println("y += x * 2 + 3");
		y += x * 2 + 3;
		System.out.println("y == " + y);
		System.out.println();

		System.out.println("*******************");
		System.out.println("**** FOR LOOPS ****");
		System.out.println("*******************");
		System.out.println();

		System.out.println("Displaying the numbers 0 - 9 using a for loop");
		for (int ix = 0; ix < 10; ix++) {
			System.out.println(ix);
		}
		System.out.println();

		System.out.println("**************************");
		System.out.println("**** BREAKING A LOOP  ****");
		System.out.println("**************************");
		System.out.println();

		int[] testScores = new int[] { 100, 94, 0, 87, 88, 0};
		boolean hasPerfectScore = false;

		for (int i = 0; i < testScores.length; i++) {
			if (testScores[i] == 100) {
				hasPerfectScore = true;
				break; // stop looking for a perfect score if you've found one
			}
		}
		System.out.println("Contains perfect score " + hasPerfectScore);



		System.out.println("**************************************");
		System.out.println("**** SKIPPING A LOOP -  CONTINUE  ****");
		System.out.println("**************************************");
		System.out.println();

		int[] testScores2 = new int[] { 100, 94, 0, 87, 88, 0};

		int sum = 0;
		int scoreCount = 0;

		for (int i = 0; i < testScores2.length; i++) {
			if (testScores2[i] == 0) {
				continue;  // don't count zeroes for average
			}
			sum += testScores2[i];
			scoreCount++;
		}
		System.out.println("Sum equal to " + sum + " ScoreCount equal " + scoreCount);

		System.out.println("*********************");
		System.out.println("**** WHILE LOOPS ****");
		System.out.println("*********************");
		System.out.println();

		System.out.println("Displaying the numbers 0 - 9 using a for loop");
		int i = 0;
		while(i < 10)
		{

			System.out.println(i);

			i++;
		}
		System.out.println();


		System.out.println("************************");
		System.out.println("**** DO WHILE LOOPS ****");
		System.out.println("************************");
		System.out.println();

		System.out.println("Displaying the numbers 0 - 9 using a for loop");
		int idw = 0;
		do
		{
			// Will execute at least once regardless
			System.out.println(idw);

			idw++;
		}
		// Checking condition AFTER the first iteration.
		while(idw < 10); //loop iterates 9 times
		System.out.println();




		// Print whether each number between 1 and 10 (inclusive) is even or odd
		for (int ix = 1; ix <= 10; ix++) {
			if (ix % 2 == 0) {
				System.out.println(ix + " is even");
			} else {
				System.out.println(ix + " is odd");
			}
		}
		System.out.println();

		// loops can be nested
		System.out.println("Displaying the numbers 1 - 5, five times, using nested for loops");
		for (int ix = 0; ix < 5; ix++) {
			for (int jx = 1; jx <= 5; jx++) {
				System.out.println(jx);
			}
		}
		System.out.println();

		System.out.println("****************");
		System.out.println("**** ARRAYS ****");
		System.out.println("****************");
		System.out.println();

		// the following line declares an array of Strings with 4 elements
		String[] fruit = new String[4];
		fruit[0] = "Apple";
		fruit[1] = "Orange";
		fruit[2] = "Banana";
		fruit[3] = "Pear";
		System.out.println("I have " + fruit.length + " fruits!");
		for (int index = 0; index < fruit.length; index++) {
			System.out.println(fruit[index]);
		}
		System.out.println();

		// the following array has length 3 even when no values have been assigned.
		String[] trees = new String[3];
		System.out.println("I have room for " + trees.length + " trees!");
		trees[1] = "Maple";
		System.out.println(trees[1]);

		int[] intArray = new int[] { 1, 2, 3 }; // this is how we declare an array literal
		for (int ix = 0; ix < intArray.length; ix++) {
			System.out.print(intArray[ix]);
		}
		System.out.println();
		System.out.println();

		// The same literal syntax would apply to an array of Strings
		String[] stooges = new String[] { "Larry", "Curly", "Moe" };

		/* Arrays are Objects, so they are "passed by reference".  In other words. when assigning
		 * the value of one array variable to another array variable, we are assigning a reference
		 * to the same array to both */
		char[] firstArray = new char[] { 'a', 'b', 'c' };
		char[] secondArray = firstArray;

		secondArray[0] = 'z';
		System.out.println("firstArray[0]: " + firstArray[0]);
		System.out.println("secondArray[0]: " + secondArray[0]);


		System.out.println("Number 9 from Lecture class");
//		int[] arrayToLoopThrough = { 3, 4, 2, 9 };
//
//		int counter = 0; // Must be started outside the block so that have access to it after the block
//
//		for (int i = 0; i < arrayToLoopThrough.length; i++) {
//			counter++;
//		}
//		System.out.println(counter);

		System.out.println("Number 10 from Lecture class");
//		int[] arrayToLoopThrough = { 4, 23, 9, 4, 33 };
//
//		int counter = 0;
//
//		//     Start;       Keep going while         Increment by one;
//		for (int i = 0; i <= arrayToLoopThrough.length; i++) {
//			counter = counter + 1;
//		}
//
//		System.out.println(counter);


		System.out.println("Number 12 from Lecture class");
//		int[] arrayToLoopThrough = { 4, 3, 4, 1, 4, 6 };
//
//		int sum = 0;
//
//		//     Start;       Keep going while       Increment by;
//		for (int i = 0; i < arrayToLoopThrough.length; i = i + 2) {
//			sum = sum + arrayToLoopThrough[i];
//		}
//
//		System.out.println(sum);











	}

}
