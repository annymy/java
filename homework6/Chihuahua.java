package ru.geekbrains.homework6;

public class Chihuahua extends Dog {
    public Chihuahua(String name) {
        super(name);
    }

    @Override
    public boolean run(float f) {
        if (f <= 400) {
            return true;
        } else {
            return false;
        }
    }
}
