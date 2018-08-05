package ru.geekbrains.homework6;

public abstract class Animal {
    public String name;

    public abstract boolean run(float f);
    public abstract boolean jump(float f);
    public abstract boolean swim(float f);

    public Animal(String name) {
        this.name = name;
    }
}
