package ru.geekbrains.homework7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat ("Barsik", false);
        cats[1] = new Cat ("Murzik", false);
        cats[2] = new Cat("Muska", false);
        cats[3] = new Cat("Businka", false);
        cats[4] = new Cat("Markiz", false);
        Plate plate = new Plate(0);

        for(int i=0; i<cats.length; i++){
            if(cats[i].full == false) {
                if(plate.eat==0) plate.getEat();
                cats[i].isFull();
                plate.eat -=1;
                System.out.println("Кот " + cats[i].name + " покушал");
            }
        }

    }
}
