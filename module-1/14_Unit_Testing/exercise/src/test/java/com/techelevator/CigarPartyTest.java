package com.techelevator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CigarPartyTest {
@Test
    public void return_false_if_the_party_is_on_the_weekend(){
    //Arrange
    CigarParty maybeParty = new CigarParty();
    int cigars = 30;
    boolean isWeekend = false;
    boolean expected = false;

    //Act
    boolean result = maybeParty.haveParty(cigars, isWeekend);

    //Assert
    Assert.assertEquals(expected, result);

}

    @Test
    public void return_true_if_the_party_is_on_the_weekend() {
        //Arrange
        CigarParty maybeParty = new CigarParty();
        int cigars = 70;
        boolean isWeekend = true;
        boolean expected = true;

        //Act
        boolean result = maybeParty.haveParty(cigars, isWeekend);

        //Assert
        Assert.assertEquals(expected, result);

    }
}
