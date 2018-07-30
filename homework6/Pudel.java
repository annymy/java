package ru.geekbrains.homework6;

public class Pudel extends Dog{
    public Pudel(String name) {
        super(name);
    }

    @Override
    public boolean run(float f) {
        if(f<=600){
            return true;
        }else {
            return false;
        }
    }
}
