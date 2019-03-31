package com.Zipcode.v2;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {
    Item item = new Item();
    @Test
    public void nonNullaryItemTest(){
        //Given
        Long expectId =1L;
        String expectedName ="abcd";
        Double expecteddPrice =1.0;
        //When

        Item item =new Item(expectId,expectedName,expecteddPrice);
        Long actualId =item.getId();
        String actualName =item.getName();
        Double actualPrice =item.getPrice();
        //Then
        Assert.assertEquals(expectId,actualId);
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expecteddPrice,actualPrice);
    }

    @Test
    public void nullartItemTest(){
        //Given
        Long expectId =0L;
        String expectedName ="";
        Double expecteddPrice =1.0;

        //When
        Long actualId =item.getId();
        String actualName =item.getName();
        Double actualPrice =item.getPrice();

        //Then
        Assert.assertEquals(expectId,actualId);
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expecteddPrice,actualPrice);

    }

    @Test
    public void setId() {

        //Given
        Long expectId =2L;
       //When
           item.setId(expectId);
        Long actualId = item.getId();

        //Then

        Assert.assertEquals(expectId,actualId);

    }

    @Test
    public void setName() {
        //Given
        String expectedName ="abcd";

        //When

        item.setName(expectedName);
        String actualName =item.getName();

        //Then

        Assert.assertEquals(expectedName,actualName);

    }
    @Test
    public void setPrice(){
        //Given
        Double expectedPrice =1.0;

        //When
        item.setPrice(expectedPrice);
        Double actualPrice =item.getPrice();

        //Then
        Assert.assertEquals(expectedPrice,actualPrice);
    }
}
