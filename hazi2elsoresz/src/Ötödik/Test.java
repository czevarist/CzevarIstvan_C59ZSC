package Ötödik;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] t = new int[30];

        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(10);
        }

        printArray(t);

        long timeStart = System.currentTimeMillis();
        insertionSort(t);
        long timeEnd = System.currentTimeMillis();

        printArray(t);

        System.out.println(timeEnd - timeStart);
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
}
    static void insertionSort(int[] a){
        int j,x;
        for(int i = 1; i < a.length; i++)
        {
            x = a[i];
            for(j = i-1; j >= 0; j--)
            {
                if(x < a[j]){
                    int tmp = a[j];
                    a[j] = x;
                    a[j+1] = tmp;
                }
            }
        }
}
}
