package dz1.Ex3;

import dz1.Ex3.Fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class BoxWithFruits<T extends Fruit> {
    public float weight = 0;
    private List<T> box;

    public BoxWithFruits() {
        this.box = new ArrayList<>();
    }


    public void addFruit(T fruit){
        box.add(fruit);
    }

    public float getWeightBox(){
            weight = 0;
            for (int i = 0; i < box.size(); i++) {
                weight = weight+ box.get(i).getWeight();
            }
            return weight;
    }

    public boolean compare(BoxWithFruits<?> box1, BoxWithFruits<?> box2){
        if(box1.getWeightBox()==box2.getWeightBox()){
            return true;
        }
        else return false;
    }

    public BoxWithFruits<T> change(BoxWithFruits<T> boxOld, BoxWithFruits<T> boxNew){
        for (int i = 0; i < boxOld.box.size(); i++) {
            boxNew.addFruit(boxOld.box.get(i));
        }
        for (int i = boxOld.box.size()-1; i >=0; i--) {
            boxOld.box.remove(i);
        }
        return boxNew;
    }

}
