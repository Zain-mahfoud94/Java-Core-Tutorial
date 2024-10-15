package Operators;

public class Operators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2= 5;
        int result = num1 + num2;
        System.err.println(result);
        result = num1 - num2;
        System.err.println(result);
        result = num1 * num2;
        System.err.println(result);
        result = num1 / num2;
        System.err.println(result);
        result = num1 % num2;
        System.err.println(result);
        num1 += 2;
        System.err.println(num1);
        num1 -= 2;
        System.err.println(num1);
        // post increment
        num1++;
        System.err.println(num1);
        // pre increment
        ++num1;
        System.err.println(num1);
        // decrement
        num1--;
        System.err.println(num1);
    }
}
