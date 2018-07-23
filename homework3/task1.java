package ru.geekbrains.homework3;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Random random = new Random();
        int user;
        boolean result = false;
        do{
            Scanner scanner = new Scanner(System.in);
            int number = random.nextInt(9);
            System.out.println("Попробуйе угадать загаданное число");
            for (int i = 0; i < 3; i++) {
                user = scanner.nextInt();
                result = guess(number, user);
                if(result == true) { ;
                    break;
                }
            }
            if(result == false) {
                System.out.println("К сожалению, вы не угадали((");
            }
            System.out.println("Хотите сыграть еще? 1 - да, 2 - нет");
            user = scanner.nextInt();
            if(user == 2) break;
        }while(true);
    }

    public static boolean guess(int number, int user) {
        if(number==user){
            System.out.println("Вы угадали!");
            return true;
        }else if (number > user) {
            System.out.println("Загаданное число больше");
            return false;
        } else {
            System.out.println("Загаданное число меньше");
            return false;
        }
    }
}
