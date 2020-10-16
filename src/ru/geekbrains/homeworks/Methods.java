package ru.geekbrains.homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methods {
    public static void main(String[] args) {

    }
    public static Object[] changeArray(int [] array){
        List<Integer> newArr = new ArrayList<>();
        if (searchFour(array)){
              for (int i = searchIndexLastFour(array)+1; i<array.length; i++){
                  newArr.add(array[i]);
              }
              return newArr.toArray();
        } else {
            throw new RuntimeException();
        }
    }
    public static boolean searchFour (int [] array){
        int point = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] == 4){
                point++;
            }
        }
        return point >= 1;
    }
    public static int searchIndexLastFour(int [] array){
        int index = 0;
        for (int i = (array.length-1); i>=0; i--){
            if (array[i] == 4){
                index = i;
                break;
            }
        }
        return index;
    }
    public static boolean searchFourOrOne(int [] array){
        int point = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] == 4 || array[i] == 1){
                point++;
            }
        }
        return point >= 1;
    }
}
