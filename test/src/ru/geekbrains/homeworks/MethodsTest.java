package ru.geekbrains.homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MethodsTest {
    int [] array = {1, 2, 4, 4, 2, 3, 4, 1, 7 };
    Object[] trueVariant = {1,7};

    int [] array1 = {1, 2, 3, 4, 6};
    Object[] trueVariant1 = {6};

    int [] array2 = {2, 4, 5, 6, 7, 8};
    Object[] trueVariant2 = {5, 6, 7, 8};

    int[]arr = {5, 8, 9};

    @Test
    public void shouldChangeArray1(){
        Assertions.assertArrayEquals(trueVariant,Methods.changeArray(array));
    }

    @Test
    public void shouldChangeArray2(){
        Assertions.assertArrayEquals(trueVariant2,Methods.changeArray(array2));
    }

    @Test
    public void shouldChangeArray3(){
        Assertions.assertArrayEquals(trueVariant1,Methods.changeArray(array1));
    }

    @Test
    public void shouldSearchFourOrOne1(){
        Assertions.assertTrue(Methods.searchFourOrOne(array));
    }

    @Test
    public void shouldSearchFourOrOne2(){
        Assertions.assertTrue(Methods.searchFourOrOne(array1));
    }

    @Test
    public void shouldSearchFourOrOne3(){
        Assertions.assertFalse(Methods.searchFourOrOne(arr));
    }
}
