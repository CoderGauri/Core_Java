package Day2;

    class Calculator {

    //  Add two integers
    int add(int a, int b) {
        return a + b;
    }

    //  Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two ints: " + calc.add(5, 10));          // calls #1
        System.out.println("Sum of three ints: " + calc.add(1, 2, 3));      // calls #2
        System.out.println("Sum of two doubles: " + calc.add(4.5, 5.5));    // calls #3
    }
}

