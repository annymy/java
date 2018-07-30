package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class test {
    private  static char[][] map = new char[5][5];
    private  static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void initMap(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length ; j++) {
                map[i][j] = '*';
            }
        }
    }

    public static void printMap(){
        System.out.println("  1 2 3 4 5 ");
        for (int i = 0; i < map.length ; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < map[i].length ; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void humanTurn(){
        int x, y;
        do{
            System.out.println("Введите координаты Х, У");
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;
        }while(!isCellEmpty(x,y));
        map[y][x] = 'x';
    }

    public static boolean isCellEmpty(int x, int y){
        if(x>4||x<0||y>4||y<0) return false;
        if(map[y][x]!='*') return false;
        return true;
    }

    private static void aiTurn(){
        boolean a = skyNet();
        if (a == false) {

            int x, y;
            do {
                x = rand.nextInt(5);
                y = rand.nextInt(5);
            } while (!isCellEmpty(x, y));
            map[y][x] = '0';
        }
    }



    public static boolean isCheckWin(char c) {

        int number1 = 0; //считаем победу по гориоонтали
        int number2 = 0; //cчитаем победу по диагонали1
        int number3 = 0; //считаем победу по диагонали2
        int number4 = 0;//считаем победу по вертикали
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {//
                if (map[i][j] == c) {// по горизонтали
                    number1 += 1;
                    if (number1 == 4) return true;
                } else {
                    number1 = 0;
                }
                if (map[j][i] == c) {//по вертикали
                    number4 += 1;
                    if (number4 == 4) return true;
                } else number4 = 0;
                if (i == j) { //главная диагональ
                    if (map[i][j] == c) {
                        number2 += 1;
                        if (number2 == 4) return true;
                    } else number2 = 0;
                }
                if (j == map.length - i - 1) {//побочная диагональ
                    if (map[i][j] == c) {
                        number3 += 1;

                        if (number3 == 4) return true;
                    }

                }
            }
        }
        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;



        return false;
    }



    private static boolean skyNet(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j] == '*'){
                    map[i][j] = 'x';
                    //System.out.println(i + " " + j);
                    if(isCheckWin('x')) {
                        map[i][j] = '0';
                        return true;
                    }else map[i][j] = '*';
                }
            }
        }
        return false;
    }
    private static boolean isMapfull(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j] == '*') return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isCheckWin('x')) {
                System.out.println("Победил игрок");
                break;
            }
            if(isMapfull()) break;
            aiTurn();
            printMap();
            if(isCheckWin('0')) {
                System.out.println("Победил компьютер");
                break;
            }
            if(isMapfull()) break;

        }
        System.out.println("Game over");
    }


}
