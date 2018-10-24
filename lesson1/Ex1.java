package lesson1;

public class Ex1<T> {
    private T[] array;

    public Ex1(T[] array) {
        this.array = array.clone();
    }

    public void change(int x, int y) {
        T a;
        if (x < array.length && y < array.length) {
            a = array[x];
            array[x] = array[y];
            array[y] = a;
        }
    }

    public void show() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}

class doing {
    public static void main(String[] args) {
        Integer[] arrayInt = {1, 2, 3, 4, 5};
        Ex1<Integer> aI = new Ex1<>(arrayInt);
        aI.change(1, 4);
        aI.show();

        String[] arrayString = {"lala", "tata", "papa", "pum"};
        Ex1<String> aS = new Ex1<>(arrayString);
        aS.change(0, 10);
        aS.show();
    }

}

