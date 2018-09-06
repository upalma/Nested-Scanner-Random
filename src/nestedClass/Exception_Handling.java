package nestedClass;

public class Exception_Handling {
    public static void main(String[] args) {
        int password = 100;
        try {
            int result = password / 5;
            System.out.println(result);
        }
        catch (Exception ex){
            System.out.println("Please enter the correct password");
        }
        System.out.println("Successfully login ");
    }
}
