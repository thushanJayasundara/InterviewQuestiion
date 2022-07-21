import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0, reverseNumber = 0,numberForStringBuffer = 0, numberForStringBuilder = 0;

        System.out.println("Please Enter Number...");

        number = scanner.nextInt();
        numberForStringBuffer = number;
        numberForStringBuilder = number;

        while (number != 0)
        {
            reverseNumber = reverseNumber * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("[Method 01] Reverse number is "+reverseNumber);

        StringBuffer stringBuffer = new StringBuffer(String.valueOf(numberForStringBuffer));
        StringBuffer revStrBuf = stringBuffer.reverse();
        System.out.println("[Method 02] Reverse number is "+revStrBuf);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(numberForStringBuilder);
        StringBuilder revStrBui = stringBuilder.reverse();
        System.out.println("[Method 03] Reverse number is "+revStrBui);
    }
}
