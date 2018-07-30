package ru.geekbrains.homework6;

public abstract class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }


    @Override
    public boolean jump(float f) {
        if(f<=0.5) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean swim(float f) {
        if(f<=10){
            return true;
        }else {
            return false;
        }
    }
}
