package array;

public class MyArray {
    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 5, 8, 7};
        //int[] myIntArray2 = new int[5];
        //int[] myIntArray1 = new int[]{1, 2, 3, 4, 5};

        //System.out.println(myIntArray[3]); //print for single index value



        //want to run the all index value

        int index = 0;
        while (index <=4) {

            System.out.println(myIntArray[index]); //print for all index value
            index++;
        }
    }
}
