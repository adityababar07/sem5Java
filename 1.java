package src;

import java.util.Scanner;

class practical1 {

    public static void arithmeticOperators() {

        int a = 101;
        int b = 20;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        System.out.println("Study of Arithmatic operators in Java.\n");
        System.out.println("The addition = " + c);
        System.out.println("The substraction = " + d);
        System.out.println("The multiplication = " + e);
        System.out.println("The division = " + f);
        System.out.println("The remainder = " + g);
    }

    public static void unaryOperator() {

        int num = 101;
        int minus = -(num);
        int pre_increment = ++num;
        int post_decrement = num--;

        System.out.println('\n'+"Study of Unary operators in Java.");
        System.out.println("The minus operand = " + minus);
        System.out.println("The pre_increment operand = " + pre_increment);
        System.out.println("The post_decrement operand = " + post_decrement);

    }

    public static void relationalOperators() {
        System.out.println("Study of relational operators in java");
        int num1 = 101;
        int num2 = 20;
        System.out.println("num1 > num2 is " + (num1 > num2));
        System.out.println("num1 < num2 is " + (num1 < num2));
        System.out.println("num1 >= num2 is " + (num1 >= num2));
        System.out.println("num1 <= num2 is " + (num1 <= num2));
        System.out.println("num1 == num2 is " + (num1 == num2));
        System.out.println("num1 != num2 is " + (num1 != num2));

    }

    public static void logicalOperators() {
        int a = 34;
        int b = 24;

        System.out.println('\n'+"Study of Logical operators in Java.");
        System.out.println("a > b is " + (a > b));
        System.out.println("a < b is " + (a < b));
        System.out.println("(a>b)&&(a>20) is " + ((a > b) && (a > 20)));
        System.out.println("(a>b)&&(a<20) is " + ((a > b) && (a < 20)));
        System.out.println("(a>b)||(a<b)) is " + ((a > b) || (a < b)));
        System.out.println("!(a>b) is " + !(a > b));
        System.out.println("!(a<b) is " + (!(a < b)));

    }

    public static void ternaryOperator() {
        
        int a = 5;
        int b = 3;
        String result = a > b ? "True" : "False";
        System.out.println('\n'+"Study of Ternary operators in Java.");
        System.out.println("result of a>b?\"True\":\"False\" is " + result);
    }

    public static void main(String[] args) {
        arithmeticOperators();
        unaryOperator();
        relationalOperators();
        logicalOperators();
        ternaryOperator();
    }
}