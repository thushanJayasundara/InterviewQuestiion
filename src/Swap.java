public class Swap {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        System.out.println("Before swapping values are "+num1+" / "+num2);
        System.out.println("");

        // 1st method
        int t = num1;
        num1 = num2;
        num2 = t;
        System.out.println("Method 01 [Number 01 = "+num1+" "+"Number 02 = "+num2+"]");

        //2nd Method
        num1 = 10;
        num2 = 20;
        num1 =  num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("Method 02 [Number 01 = "+num1+" "+"Number 02 = "+num2+"]");

        //3rd method (Positive Numbers Only)
        num1 = 10;
        num2 = 20;
        num1 = num1*num2;
        num2 = num1/num2;
        num1 = num1/num2;
        System.out.println("Method 03 [Number 01 = "+num1+" "+"Number 02 = "+num2+"]");

        //4th method
        num1 = 10;
        num2 = 20;
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("Method 04 [Number 01 = "+num1+" "+"Number 02 = "+num2+"]");

        //5th method
        num1 = 10;
        num2 = 20;
        num2 = num1 + num2 - (num1 = num2);
        System.out.println("Method 05 [Number 01 = "+num1+" "+"Number 02 = "+num2+"]");


    }
}
