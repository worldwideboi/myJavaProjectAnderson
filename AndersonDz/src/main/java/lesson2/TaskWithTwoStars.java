package lesson2;

public class TaskWithTwoStars {
    public static void twoStars(int[] array, int a) {
        if(array == null || array.length <=1 || a % array.length == 0) {
            return;
        }
        a = a % array.length;

    }
}
