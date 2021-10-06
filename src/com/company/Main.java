package com.company;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        {
            int[] arrOne = {1, 9, 5, 7, 6};
                        System.out.println(Arrays.toString(arrOne));

            arrOne[1] = 0;
            for (int i = 0; i < arrOne.length; i++)
                {
                System.out.println(arrOne[i]);
            }
        }
    }
}