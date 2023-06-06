package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SameFirstLastTest {

    @Test
    public void arrayLength0_ExpectFalse() {
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] inputArr = {};
        boolean expected = false;

        //Assert
        assertEquals(expected, sameFirstLast.isItTheSame(inputArr));
    }

    @Test
    public void arrayLength1_ExpectTrue() {
        //Arrange
        SameFirstLast exercises = new SameFirstLast();
        int[] inputArr = { 1 };
        boolean expected = true;

        //Assert
        assertEquals(expected, exercises.isItTheSame(inputArr));
    }

}
