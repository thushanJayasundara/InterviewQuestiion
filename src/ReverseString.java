import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reverse = "";

        System.out.println("Please Enter Value...");
        String input = scanner.next();
        String forCharArray = input;

        int length = input.length();

        for (int i = length - 1; i>0; i--){
            reverse = reverse + input.charAt(i);
        }

        System.out.println("[Method 01] Reverse number is "+reverse);

        char[] reverseArray = forCharArray.toCharArray();
        reverse = "";
        for (int i = forCharArray.length()-1; i>0; i--){
            reverse = reverse+reverseArray[i];
        }
        System.out.println("[Method 02] Reverse number is "+reverse);


    }
}
