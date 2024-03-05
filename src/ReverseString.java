import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder reverse = new StringBuilder();

        System.out.println("Please Enter Value...");
        String input = scanner.next();

        int length = input.length();

        for (int i = length - 1; i>0; i--){
            reverse.append(input.charAt(i));
        }

        System.out.println("[Method 01] Reverse number is "+reverse);

        char[] reverseArray = input.toCharArray();
        reverse = new StringBuilder();
        for (int i = input.length()-1; i>0; i--){
            reverse.append(reverseArray[i]);
        }
        System.out.println("[Method 02] Reverse number is "+reverse);


    }
}
