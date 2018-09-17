package homework5;

public class homework5 {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        float[] arr = new float[size];
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        calc1(arr);
        calc2(arr);
    }

    public static void calc1(float[] arr) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Первый расчет " + (System.currentTimeMillis() - a));
    }

    public static void calc2(float[] arr) {
        float[] mass1 = new float[h];
        float[] mass2 = new float[h];
        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, mass1, 0, h);
        System.arraycopy(arr, h, mass2, 0, h);

        Object o = new Object();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < mass1.length; i++) {
                    mass1[i] = (float) (mass1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                for (int i = 0; i < mass2.length; i++) {
                    mass2[i] = (float) (mass2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

                }
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(mass1, 0, arr, 0, h);
        System.arraycopy(mass2, 0, arr, h, h);

        System.out.println("Второй расчет " + (System.currentTimeMillis() - a));


    }


}
