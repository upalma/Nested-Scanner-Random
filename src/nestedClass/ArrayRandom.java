package nestedClass;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {
    public static void main(String[] args) {

        int []array = new int[4];
        //Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert element value: ");
        for (int i = 0; i<4; i++){
            array[i]= scanner.nextInt();
        }
        for(int i = 0; i<4; i++){
            System.out.println("Index value: "+array[i]);
        }

    }
}
