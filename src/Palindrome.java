import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please Enter Value...");
        String input = scanner.next();
        String organizedString = input;
        String reverse = "";

        int length = input.length();

        for (int i = length-1; i>=0; i-- ){
            reverse = reverse+input.charAt(i);
        }

        if (organizedString.equals(reverse)){
            System.out.println(organizedString+" is a palinedrome String");
        }else {
            System.out.println(organizedString+" isn't a palinedrome String");
        }
    }
}
