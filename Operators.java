package src;
public class Operators {
    public static void main(String []args)
    {
        System.out.println("Study of Arithmatic operators in Java.");


        // initializing variables
        int num1 = 101, num2 = 20, unary ,sum, sub, mul, div, mod = 0;
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // operations num1 and num2
        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;
        System.out.println("The Addition = " + sum);
        System.out.println("The subtraction = " + sub);
        System.out.println("The Multiplication = " + mul);
        System.out.println("The Divison = " + div);
        System.out.println("The Remainder = " + mod);

        System.out.println('\n'+"Study of Unary operators in Java.");
        unary = - num1;
        System.out.println("The Unary minus = " + unary);
        unary =  ++num1;
        System.out.println("The Unary Pre - Increment  = " + unary);
        unary = num1--;
        System.out.println("The Unary Post - decrement = " + unary);

        System.out.println('\n'+"Study of Relational operators in Java.");
        System.out.println("num1 > num2 is " + (num1 > num2));
        System.out.println("num1 < num2 is " + (num1 < num2));
        System.out.println("num1 >= num2 is " + (num1 >= num2));
        System.out.println("num1 <= num2 is " + (num1 <= num2));
        System.out.println("num1 == num2 is " + (num1 == num2));
        System.out.println("num1 != num2 is " + (num1 != num2));

        System.out.println('\n'+"Study of Logical operators in Java.");
        boolean a = true;
        boolean b = false;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + !a);
        System.out.println("!b: " + !b);
        System.out.println('\n'+"Study of Ternary operators in Java.");
        boolean condition = false;
        String result = (condition) ? "True" : "False";
        System.out.println(result);
    }
}
