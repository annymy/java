package homework2;

public class Main {
    public static void main(String[] args) {
        String [][]mass = {{"1", "2", "3", "4"},{"a", "1", "5", "7"}, {"6", "3","2", "8"}, {"4", "3","0", "3"}};
        String[][] massTest = new String[2][2];
        int sumMass;

        try {
            sumMass = sumMass(mass);
            System.out.println("Сумма числовых элементов в массиве "+ sumMass);
        } catch (MyArraySizeException a){
            a.printStackTrace();
        }

        try {
            sumMass = sumMass(massTest);
            System.out.println("Сумма числовых элементов в массиве "+ sumMass);
        } catch (MyArraySizeException e){
            e.printStackTrace();
        }

    }

    public static void display (int [][]mass){
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static int sumMass(String[][] mass) throws MyArraySizeException {
        if(mass.length != 4 || mass[1].length !=4){
            throw new MyArraySizeException();
            }

        int [][]newMass = new int[4][4];
        int summ = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                try {
                    newMass[i][j] = Integer.valueOf(mass[i][j]);
                } catch (NumberFormatException e) {
                    newMass[i][j] = 0;
                    System.out.println("Неверные данные лежат в ячейке " + i + ";" + j);
                }
                summ+=newMass[i][j];
            }
        }
        display(newMass);
        return summ;
    }
}
