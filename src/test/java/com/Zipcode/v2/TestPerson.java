package com.Zipcode.v2;


import org.junit.Assert;
import org.junit.Test;


public class TestPerson {
    Person person =new Person();



    @Test
    public void testDefaultConstructor(){
    //Given
        String expectedName ="";
        Integer expectedAge =Integer.MAX_VALUE;
        //when

        String actualName=person.getName();
        Integer actualAge =person.getAge();
        //then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedAge,actualAge);


 }
    @Test
    public void testConstructorWithName(){
        //Given
     String expectedName ="abcd";
     //when
        Person person = new Person(expectedName);
     String actualName= person.getName();
     //then
     Assert.assertEquals(expectedName,actualName);
 }

    @Test
    public void testConstructorWithAge(){
        //Given
     Integer expectedAge =12;
        //When
        Person person =new Person(expectedAge);
     Integer actualAge =person.getAge();
     //Then
     Assert.assertEquals(expectedAge,actualAge);
 }
 @Test
 public void testConstructorWithNameAndAge(){
        //given
     String expectedName ="abcd";
     Integer expectedAge =12;
     //When
     Person person =new Person(expectedName,expectedAge);
     String actualName =person.getName();
     Integer actualAge = person.getAge();
     //Then
     Assert.assertEquals(expectedName,actualName);
     Assert.assertEquals(expectedAge,actualAge);

 }

   @Test
    public void setNameTest(){
        //Given
    String expectedName="abcd";
    //When
    person.setName(expectedName);
    String actualName =person.getName();
    //Then
    Assert.assertEquals(expectedName,actualName);

}
   @Test

   public void setAgeTest(){
        //Given
    Integer expectedAge =12;
    //When
    person.setAge(expectedAge);
    Integer actualAge =person.getAge();
    //Then
    Assert.assertEquals(expectedAge,actualAge);

}

}
