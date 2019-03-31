package com.Zipcode.v2;

import java.sql.Array;
import java.util.*;

public class ArraysAndMapsDEmo {



    public Integer sumOfArrays(Integer[] intArray){
       // public Integer sumOfArrays (Integer[] intArray){
        int sum=0;

        for(Integer val : intArray){
            sum = sum + val;
        }
        return sum;
    }

        public Integer avgOfArrays(Integer[] intArray){
            int avg=0;

            Integer sum = sumOfArrays(intArray);

            avg =sum/intArray.length;

            return avg;
        }

        public Integer sumForArrayList(Integer[] intArray){


        String[] strArray = new String[]{"Lasya","Aaryan"};

        List<String> arrStrList =Arrays.asList(strArray);
           List<Integer> arrIntList =  Arrays.asList(intArray);
           int sum =0;
           for(Integer val : arrIntList){

               sum = sum + val;
           }

        return sum;
        }

        public Integer sumOfStudentScores(HashMap<String,Integer>   studentMap){
            int sum =0;
          //  for (Map.Entry<String,String> entry : gfg.entrySet())
            for(Map.Entry<String,Integer>  stdEntry : studentMap.entrySet()){

                sum = sum +stdEntry.getValue();
            }
            return sum;

        }
        public Integer largestValueInHashMap(HashMap<String,Integer> studentMap){

//        Map<String,Integer> largestMap = null;
//
//        for (Map.Entry<String,Integer> entry : studentMap.entrySet()){
//
//            if(largestMap == null || entry.getValue().compareTo(largestMap.getValue()) > 0 ){
//
//                largestMap=entry;
//            }
//        }
            List<Integer> arrListOfValues = new ArrayList<Integer>();
            for (Map.Entry<String,Integer> entry : studentMap.entrySet()){
                arrListOfValues.add(entry.getValue());
            }
           Integer maxValue= Collections.max(arrListOfValues);
            System.out.println(maxValue);

           return maxValue;
        }


}

