package array;

import java.util.Scanner;

public class ScannerArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayall = new int[10];

        for (int i = 0; i <arrayall.length; i++) {
           arrayall[i] = sc.nextInt();
        }

       for( int i = 0; i<arrayall.length; i++){
            System.out.println("Array index value:  "+ arrayall[i]);
        }

    }
}

