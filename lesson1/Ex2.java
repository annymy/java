package lesson1;

import java.util.*;

public class Ex2<T> {
    private List<T> arrayList = new ArrayList<>();

    public void Ex2(List<T> arrayList){
        this.arrayList = arrayList;
    }

    public void change(T[] array){
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
    }

    public void show(){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+ " ");
        }
        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};
        Ex2<Integer> arrayList = new Ex2<>();
        arrayList.change(array);
        arrayList.show();
    }
}
