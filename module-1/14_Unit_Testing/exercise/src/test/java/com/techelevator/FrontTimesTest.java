package com.techelevator;


import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {
    @Test
    //Arrange
    public void the_first_3_char_repeated_twice() {
        FrontTimes wordRepeated = new FrontTimes();
        String str = "Chocolate";
        int n = 2;
        String expected = "ChoCho";

        //Act
        String actual = wordRepeated.generateString(str, n);

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    //Arrange
    public void the_first_3_char_repeated_3_times() {
        FrontTimes wordRepeated = new FrontTimes();
        String str = "Chocolate";
        int n = 3;
        String expected = "ChoChoCho";

        //Act
        String actual = wordRepeated.generateString(str, n);

        //Assert
        Assert.assertEquals(expected, actual);


    }
}
