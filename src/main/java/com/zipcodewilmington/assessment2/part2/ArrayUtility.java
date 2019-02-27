package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] newArray = new Integer[array1.length + array2.length];
        int index = array2.length;

        for (int i = 0; i < array2.length; i++) {
            newArray[i] = array2[i];
        }
        for (int i = 0; i < array1.length; i++) {
            newArray[i + index] = array1[i];
        }
    return newArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
//        if(index < 0) // rotating left?
//        {
//            index = -index % array.length; // convert to +ve number specifying how
//            // many positions left to rotate & mod
//            index = array.length - index;  // rotate left by n = rotate right by length - n
//        }
//        Integer[] result = new Integer[array.length];
//        for(int i = 0; i < array.length; i++){
//            result[(i+index) % array.length ] = array[i];
//        }
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        int counter = 0;
        for (int i = 0; i < array1.length; i++) {

            if (array1[i].equals(valueToEvaluate)) {
                counter++;
            }
//            for(i = 0; i < array2.length; i++)
//                if (array2[1].equals(valueToEvaluate)) {
//                    counter++;
//                }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {


        Integer[] counterForEachIndex = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            counterForEachIndex[i] = (array[i]);
        }

        Integer compartorIndex = 0;
        Integer compartor = counterForEachIndex[0];
        for (int j = 0; j > counterForEachIndex.length - 1; j++) {
            if (counterForEachIndex[j] > compartor) {
                compartor = counterForEachIndex[j];
                compartorIndex = j;
            }
        }
        return array[compartorIndex];
    }
}
