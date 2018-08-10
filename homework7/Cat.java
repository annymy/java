package ru.geekbrains.homework7;

public class Cat {
    public String name;
    public boolean full = false;

    public Cat() {
    }

    public Cat(String name, boolean full) {
        this.name = name;
        this.full = full;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFull() {
        full = true;
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", full=" + full +
                '}';
    }

}
