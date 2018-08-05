package ru.geekbrains.homework6;

import ru.geekbrains.homework6.Animal.*;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean run(float f) {
        if(f<=200){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean jump(float f) {
        if(f<=200){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean swim(float f) {
        return false;
    }
}
