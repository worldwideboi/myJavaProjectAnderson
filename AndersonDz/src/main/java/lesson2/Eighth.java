package lesson2;

public class Eighth {
    public static void eighthMethod() {
        int size = 10;
        int[][] array = new int[size][size];

        for(int i = 0;i < array.length;i++){
            array[i][i] = 1;
        }
        for (int i = 0;i < array.length;i++){
            array[i][array.length - 1 - i] = 1;
        }
    }
}
