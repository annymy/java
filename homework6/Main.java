package ru.geekbrains.homework6;

public class Main {
    public static void main(String[] args) {
        Animal kitty = new Cat("Whiskas");
        Animal puppy = new Chihuahua("Reks");
        Animal dog  = new Pudel("Platon");

        System.out.println("Кошка " + kitty.name + " проплыла 5 метров " + kitty.swim(5));
        System.out.println("Собака " + puppy.name + " пробежала 300 метров " + puppy.run(300));
        System.out.println("Собака " + dog.name + " подпрыгнула на 1 метр " + puppy.run(300));
    }
}
