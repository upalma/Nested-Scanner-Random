package array;


import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
        }

        for( int j = 0; j<array.length ; j++){
            System.out.println(array[j]);
        }
    }
} //someone can tell me why ramdom is no t working