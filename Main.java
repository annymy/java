package ru.geekbrains.java1;

import java.util.Arrays;


public class Main {


    public static void main(String[] args) {
        //задание 1
        int[] arr1 = {1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0};
        System.out.println(Arrays.toString(arr1) + " Изначальный массив");
        for (int i = 0; i < arr1.length; i++) {
            switch (arr1[i]) {
                case 1:
                    arr1[i] = 0;
                    break;
                case 0:
                    arr1[i] = 1;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr1));

        //задание 2
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));

        //задание 3

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
        }
        System.out.println(Arrays.toString(arr3));

        //Задание 4

        int[][] arr4 = new int[3][3];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        //Задание 5
        int[] mass = {282, 2, 638, 13, 404, 5, 23, 455, 136, 456, 28, 590, 6, 10, 30, 848, 65};
        System.out.println(Arrays.toString(mass));
        int max = mass[0];
        int min = mass[0];
        for (int a : mass) {
            if (a > max) {
                max = a;
            } else if (a < min) {
                min = a;
            }
        }
        System.out.println("MAX " + max + " MIN " + min);

        //Задание 6
        int[] checkBalance = {4,1,1,2};
        System.out.println(check(checkBalance));

        //Задание 7
        int[] ree = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(ree));
        shift(ree, 4);


    }

    public static boolean check(int[] mass) {
        ;
        int right, left;
        boolean result = false;
        for (int i = 0; i < mass.length; i++) {
            left = 0;
            right = 0;
            for (int j = 0; j < i; j++) {
                left += mass[j];
            }
            for (int d = i; d < mass.length; d++) {
                right += mass[d];
            }
            if (left == right) {
                result = true;
                for(int a = 0; a< mass.length; a++){
                    System.out.println(mass[a] + " ");
                    if (a==i-1) System.out.print("|| ");
                }
                break;
            }


        }
        return result;
    }

    public static void shift(int[] mass, int n){
        int storage = 0;
        for (int j = 1; j<=n; j++){
            for (int i = 0; i < mass.length-1; i++) {
                    storage = mass[i + 1];
                    mass[i + 1] = mass[i];
                    mass[i] = storage;
            }


        }
        System.out.println(Arrays.toString(mass));
    }
}
