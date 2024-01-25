package lesson2;

public class Fifth {
    public static void fifthMethod() {
        int[] array1 = new int[]{0, 1, 0, 1, 1, 0, 1, 0, 0, 1};

        for(int i = 0; i < array1.length; i++){
            if (array1[i] == 0) {
                array1[i] = 1;
            }else{
                array1[i] = 0;
            }
        }
    }
}
