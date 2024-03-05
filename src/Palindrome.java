import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please Enter Value...");

        String input = scanner.next();
        StringBuilder reverse = new StringBuilder();

        int length = input.length();

        for (int i = length-1; i>=0; i-- ){
            reverse.append(input.charAt(i));
        }

        if (input.contentEquals(reverse)){
            System.out.println(input +" is a palindrome String");
        }else {
            System.out.println(input +" isn't a palindrome String");
        }
    }
}
