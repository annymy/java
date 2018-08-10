package ru.geekbrains.homework7;

public class Plate {
    public int eat = 0;

    public Plate(int eat) {
        this.eat = eat;
    }

    public int getEat() {
            eat = 2;
            System.out.println("Тарелку наполнили");
        return eat;
    }

    public void setEat(int eat) {
        this.eat = eat;
    }


}
