package org.example;

import java.util.ArrayList;

public class Q4 {

    public ArrayList<Integer>  dups(int[] numberInputs){
        ArrayList<Integer> duplicates = new ArrayList<>();
        ArrayList<Integer> numbersInArray = new ArrayList<>();

        for (int number:numberInputs) {

            if(numbersInArray.contains(number) ){

                if(!duplicates.contains(number)){
                    duplicates.add(number);
                }
            }else{

                numbersInArray.add(number);
            }
        }

        return duplicates;
    }

}
