import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        //Condition for type conversion
//        float num = input.nextInt();  //here int input in converted to float
//        System.out.println(num);
//
//        //Typecasting
//        int num1 = (int)(56.25);
//        System.out.println(num1);
//
//        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);
//
//        byte a =  40 ;
//        byte b = 50;
//        byte c = 100 ;
//        int ans = a * b / c;
//        System.out.println(ans);
        byte a = 42;
        char b = 'a';
        short c = 1024;
        int d = 50000;
        float f = 5.67f;
        double e = 0.1234;
        double result = (f * b) + (d / b) + (e - c);
        //float + int - double = double
        System.out.println(result);
    }
}
