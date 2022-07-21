// 0, 1, 1, 2, 3, 5, 8, 13, 21

public class Fibonacci {
    public static void main(String[] args) {

        int num1 = 0, num2 = 1, sum = 0;
        System.out.println("Number 01 = "+num1+" / Number 02 = "+num2);

        for (int i = 0; i < 10; i++)
        {
         sum = num1+num2;
         System.out.println(sum);
         num1 = num2;
         num2 = sum;
        }

    }
}
