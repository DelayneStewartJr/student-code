package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {
    @Test
    public void the_result_is_a_2_and_allows_us_access_to_a_reservation () {
        //Arrange
        DateFashion fashionDate = new DateFashion();
        int you = 5;
        int date = 10;
        int expected = 2;

        //Act
        int result = fashionDate.getATable(you,date);

        //Arrange
        Assert.assertEquals(expected, result);

    }

    @Test
    public void the_result_is_a_0_and_allows_us_access_to_a_reservation () {
        //Arrange
        DateFashion fashionDate = new DateFashion();
        int you = 5;
        int date = 2;
        int expected =0;

        //Act
        int result = fashionDate.getATable(you, date);

        //Arrange
        Assert.assertEquals(expected, result);
    }
}
