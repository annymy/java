package ru.geekbrains.homework5;

public class Main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Lapteva Anna", "Director", "lala@gmail.com", "12345", 10000000, 23);
        empArray[1] = new Employee("Khazov Philipp", "zam", "meow@mail.ru", "54321", 999999, 24);
        empArray[2] = new Employee("Platon Pluton", "cat", "wiskas@yandex.ru", "22334", 10000, 3);
        empArray[3] = new Employee("Belov Aleksandr", "joker", "melancholy@ramber.ru", "66666", 50000, 52);
        empArray[4] = new Employee("Kochenda Ann", "consultor", "star@bk.ru", "21345", 60000, 48);

        for (int i = 0; i < empArray.length; i++) {
            if(empArray[i].getAge()>40 ){
                empArray[i].Info();
            }
        }
    }
}
