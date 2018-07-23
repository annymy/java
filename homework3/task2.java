package ru.geekbrains.homework3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avokado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak","kiwi","mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        Scanner scanner = new Scanner(System.in);
        String user;
        Random random = new Random();
        int guess = random.nextInt(25);
        do {
            System.out.println("Попробуйте угадать слово");
            user = scanner.nextLine();
            if(user.equals(words[guess])) {
                System.out.print("Вы угадали!");
                break;
            }
            else {
                for (int i = 0; i < words[guess].length(); i++) {
                    if (user.charAt(i) == words[guess].charAt(i)) {
                        System.out.print(user.charAt(i));
                    } else {
                        System.out.print("*");
                    }
                }
                for (int j = 0; j < (15-user.length()) ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }while(true);

    }
}
