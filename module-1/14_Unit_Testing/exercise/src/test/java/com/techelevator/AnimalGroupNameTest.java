package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {
    @Test
    public void provide_known_animal_name_expect_known_herd_name() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animalName = "giraffe";
        String expectedHerdName = "Tower";

        // Act
        String actualHerdName = animalGroupName.getHerd(animalName);

        //Assert
        Assert.assertEquals(expectedHerdName, actualHerdName);
    }

    @Test
    public void provide_known_animal_name_mixedcase_expect_known_herd_name() {

        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animalName = "giRAffE";
        String expectedHerdName = "Tower";

        // Act
        String actualHerdName = animalGroupName.getHerd(animalName);

        //Assert
        Assert.assertEquals(expectedHerdName, actualHerdName);
    }

}