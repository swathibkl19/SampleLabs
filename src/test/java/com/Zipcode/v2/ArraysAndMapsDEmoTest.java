package com.Zipcode.v2;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ArraysAndMapsDEmoTest {

    ArraysAndMapsDEmo arraysAndMapsDEmo = new ArraysAndMapsDEmo();

    @Test
    public  void  sumOfArray(){

    Integer[] arr =new Integer[]{100,200,30,40};
    Integer expectedSum =370;
    Integer actualSum = arraysAndMapsDEmo.sumOfArrays(arr);
    Assert.assertEquals(expectedSum,actualSum);


    }
    @Test
    public  void  avgOfArray(){

        Integer[] arr =new Integer[]{100,200,30,40};
        Integer expectedAvg =92;
        Integer actualAvg = arraysAndMapsDEmo.avgOfArrays(arr);
        Assert.assertEquals(expectedAvg,actualAvg);


    }

    @Test
    public void  sumOfArrayList(){

        Integer[] arr =new Integer[]{100,200,30,40};
        Integer expectedSum =370;
        Integer actualSum = arraysAndMapsDEmo.sumForArrayList(arr);
        Assert.assertEquals(expectedSum,actualSum);


    }
    @Test//add student scores.
    public void addStudentScores(){
        HashMap<String,Integer>  studentMap = new HashMap<String,Integer>();
        studentMap.put("Lasya",100);
        studentMap.put("Aaryan",99);
        studentMap.put("Pavan",98);
        studentMap.put("Swathi",97);

        Integer expectedScore =394;
       Integer actualScore = arraysAndMapsDEmo.sumOfStudentScores(studentMap);
       Assert.assertEquals(expectedScore,actualScore);

    }
    @Test
    public void  largestValueInHashMap(){
        HashMap<String,Integer> studentMap = new HashMap<String,Integer>();
        studentMap.put("Aaryan",100);
        studentMap.put("Lasya",99);
        studentMap.put("Pavan",98);
        studentMap.put("Swathi",97);
        Integer expectedScore =100;
        Integer actualScore = arraysAndMapsDEmo.largestValueInHashMap(studentMap);
        Assert.assertEquals(expectedScore,actualScore);
    }
}