package lesson1.Ex3;

import lesson1.Ex3.Fruits.Apple;
import lesson1.Ex3.Fruits.Orange;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apple apple1= new Apple();
        Apple apple2= new Apple();
        Apple apple3= new Apple();
        Apple apple4= new Apple();
        Apple apple5= new Apple();
        Orange orange1 = new Orange();
        Orange orange2= new Orange();
        Orange orange3= new Orange();
        Orange orange4= new Orange();
        Orange orange5= new Orange();

        BoxWithFruits<Apple> box1 = new BoxWithFruits<>();
        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box1.addFruit(apple3);
        box1.addFruit(apple4);
        box1.addFruit(apple5);

        BoxWithFruits<Orange> box2 = new BoxWithFruits<>();
        box2.addFruit(orange1);
        box2.addFruit(orange2);
        box2.addFruit(orange3);
        box2.addFruit(orange4);
        box2.addFruit(orange5);

        System.out.println(box2.getWeightBox());

        BoxWithFruits box3 = new BoxWithFruits();
        box3 = box3.change(box2,box3);
        System.out.println(box3.getWeightBox());

    }
}
