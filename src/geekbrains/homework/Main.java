package geekbrains.homework;

public class Main {
//задание 1
    public static void main(String[] args) {
    	//задание 2
	byte a = 1;
	short b = 100;
	int c = 100;
	long d = 5L;
	float e = 1.5f;
	double f = 1.556;
	boolean g = true;
	char h = 'A';

	//задание 3
	System.out.println("a*(b+(c/d)) = " + calculate1(3, 4,5,6));

	//задание 4
	System.out.println("Сумма чисел 5 и 12 лежит мeжду 10 и 20 " + diapazon(5, 12));

	//задание 6
	System.out.println("5 отрицательное "+ Bolshe0(5));

	//задание 5
	bolsheMenshe(-100);

	//задание 7
	name("Анна");

	//задание 8
	year(2016);


}
    public static float calculate1(int a, int b, int c, int d){
        return a*(b+(c/d));
    }

    public static boolean diapazon(int x, int y){
    	if(((x+y)>=10)&& (x+y)<=20) return true;
    	else return false;
	}

	public static boolean Bolshe0(int x){
    	if (x<0) return true;
    	else return false;
	}

	public static void bolsheMenshe(int x){
    	if(x>=0){
    		System.out.println(x + " Положительное");
		}
		else{
    		System.out.println(x + " Отрицательное");
		}
	}

	public static void name(String Name){
    	System.out.println("Привет, " + Name);
	}

	public static void year(int year){
    	if(year%4 == 0){
    		if(year%100 == 0 && year%400!=0){
    			System.out.println("Год " + year + " не високосный");
			} else System.out.println("Год " + year + " високосный");
		} else System.out.println("Год " + year + " не високосный");
	}

}
