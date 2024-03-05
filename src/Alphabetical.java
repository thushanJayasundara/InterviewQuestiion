
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Alphabetical {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> output = new ArrayList<>();

        System.out.println("Please enter String value.");
        String input = scanner.next().trim();

        if (!input.isEmpty()) {

            for (int i = 0; i < input.length(); i++) {

                char letter = input.charAt(i);

                if (Character.isUpperCase(letter)) {
                    output.add(String.valueOf(letter));
                }
                if (Character.isLowerCase(letter)) {
                    output.add(String.valueOf(letter));
                }
            }

            output.sort(String.CASE_INSENSITIVE_ORDER);

            output.forEach(System.out::println);
        }
    }
}
