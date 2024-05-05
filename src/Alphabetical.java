
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Alphabetical {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> output = new ArrayList<>();

        System.out.println("Please enter String value.");

        String input = scanner.nextLine().trim();
        String inputWithoutSpaces = input.replaceAll("\\s+", "");

        if (!inputWithoutSpaces.isEmpty()) {

            for (int i = 0; i < inputWithoutSpaces.length(); i++) {

                char letter = inputWithoutSpaces.charAt(i);

                if (Character.isLetter(letter)) {
                    output.add(String.valueOf(letter));
                }
            }

            output.sort(String.CASE_INSENSITIVE_ORDER);

            System.out.println("Sorted characters (case-insensitive):");
            output.forEach(System.out::println);
        }
    }
}
