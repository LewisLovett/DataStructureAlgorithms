package org.example;

import java.util.Arrays;

public class Q2 {

    public double findMedian(int[] numbers1, int[] numbers2){
        int numbers1Length = numbers1.length;
        int numbers2Length = numbers2.length;

        int mergedArrayLength = numbers1Length + numbers2Length;

        int[] mergedArray = new int[mergedArrayLength];
        System.arraycopy(numbers1,0,mergedArray,0,numbers1Length);
        System.arraycopy(numbers2,0,mergedArray,numbers1Length,numbers2Length);

        Arrays.sort(mergedArray);

        double medianIndex = (double)mergedArrayLength / 2;

        if(mergedArrayLength %2 == 0){

            return mergedArray[(int)medianIndex];
        }else{

            int median1 = (int)Math.floor(medianIndex)-1;

            int median2 = (int)Math.ceil(medianIndex)-1;


            return ((double)(mergedArray[median1] + mergedArray[median2]) / 2);
        }

    }
}
