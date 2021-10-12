package com.company;

public class Array2 {
    public static void main(String[] args) {
        int[] arrOne = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

        System.out.println("Negative elements: ");
        negative(arrOne);
        System.out.println();
        System.out.println("Odd elements: ");
        odd(arrOne);
        System.out.println();
        System.out.println("Number of odd elements: ");
        oddQty(arrOne);
        System.out.println();
        System.out.println("Multiple elements with same value: ");
        sameValue(arrOne);
        System.out.println();
        System.out.println("Each second element: ");
        eachSecond(arrOne);
        System.out.println();
        System.out.println("Average value of elements: ");
        average(arrOne);
        System.out.println();
        System.out.println("Average value and Number of elements smaller than average: ");
        lessThanAverage(arrOne);


    }

    public static void negative(int[] arrOne) {
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] < 0) {
                // System.out.println("Negative elements: ");
                System.out.println(arrOne[i]);
            }
        }
    }

    public static void odd(int[] arrOne) {
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] % 2 == 1) {
                System.out.println(arrOne[i]);
            }
        }
    }

    public static void oddQty(int[] arrOne) {
        int odd_count = 0;
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] % 2 == 1)
                odd_count++;
        }
        System.out.println(odd_count);
    }

    public static void sameValue(int[] arrOne) {
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = i + 1; j < arrOne.length; j++) {
                if (arrOne[i] == arrOne[j]) {
                    System.out.println(arrOne[j]);
                }
            }
        }
    }

    public static void eachSecond(int[] arrOne) {
        int i = 1;
        while (i < arrOne.length) {
            System.out.println(arrOne[i]);
            i = i + 2;
        }
    }

    public static double average(int[] arrOne) {
        double avg = 0;
        for (int i = 0; i < arrOne.length; i++)
            avg += arrOne[i];
        avg = avg / arrOne.length;
        System.out.println(avg);
        return avg;
    }

    public static void lessThanAverage(int[] arrOne) {
        int count = 0;
        double avg = average(arrOne);
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] < avg)
                count++;
        }
        System.out.println(count);
        // TODO  average() sout is printing out,
        //  when average() is called in lessThanAverage().
        //  Callig method in method is the reason? how to remove?
    }
}

