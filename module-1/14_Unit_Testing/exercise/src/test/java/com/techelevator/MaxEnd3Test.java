package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {
    @Test
//Arrange
    public void the_index_of_2_is_the_largest_in_array() {
        MaxEnd3 indexOfTwo = new MaxEnd3();
//Act
        int []nums = {1,2,3};
        int [] expected = {3,3,3};
        int [] result = indexOfTwo.makeArray(nums);
//Assert
        Assert.assertArrayEquals(expected,result);

    }

    @Test
//Arrange
    public void the_index_of_3_is_the_largest_in_array() {
        MaxEnd3 indexOfTwo = new MaxEnd3();
//Act
        int []nums = {2,11,3};
        int [] expected = {3,3,3};
        int [] result = indexOfTwo.makeArray(nums);
//Assert
        Assert.assertArrayEquals(expected,result);

    }

}
