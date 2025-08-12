class Hello {
    public static void main(String a[])

    {
        // Variables
        int num1 = 3;
        int num2 = 7;
        int result = num1 + num2;

        // System.out.println(num1);
        // System.out.println(num2);
        // System.out.println(result);
        // System.out.println("Hello World");
        // System.out.println(5 + 9);

        // Data Types
        int num = 1;
        byte by = 127;
        long lg = 54678;
        short sh = 558;
        char c = 'k';
        boolean b = true;
        float f = 5.9f;
        double d = 5.8;
        // System.out.println(num);
        // System.out.println(by);
        // System.out.println(lg);
        // System.out.println(sh);
        // System.out.println(c);
        // System.out.println(b);
        // System.out.println(f);
        // System.out.println(d);

        // Type casting and conversion
        byte b1 = 127;
        System.out.println(b1);
        int a1 = 367;
        b1 = (byte) a1;
        System.out.println(a1);
        float f1 = 5.6f;
        int t = (int) f1;
        System.out.println(t);
        // system promotion
        byte val1 = 20;
        byte val2 = 30;
        int result1 = val1 * val2;
        System.out.println(result1);

        //Arithmetic operators
        int a2 = 10;
        int b2 = 3;

        
        System.out.println("a2 + b2 = " + (a2 + b2));  // Addition: 13
        System.out.println("a2 - b2 = " + (a2 - b2));  // Subtraction: 7
        System.out.println("a2 * b2 = " + (a2 * b2));  // Multiplication: 30
        System.out.println("a2 / b2 = " + (a2 / b2));  // Division (integer): 3
        System.out.println("a2 % b2 = " + (a2 % b2));  // Modulus: 1

        System.out.println("a2 before increment: " + a2);
        a2++;  // Post-increment
        System.out.println("a2 after post-increment: " + a2);

        a2 = 10;  // Reset a2
        ++a2;    // Pre-increment
        System.out.println("a2 after pre-increment: " + a2);

        a2--;    // Post-decrement
        System.out.println("a2 after post-decrement: " + a2);

        --a2;    // Pre-decrement
        System.out.println("a2 after pre-decrement: " + a2);

        //relational operators
          int a3 = 10;
        int b3 = 20;

        System.out.println("a3 == b3: " + (a3 == b3));   // false
        System.out.println("a3 != b3: " + (a3 != b3));   // true
        System.out.println("a3 > b3: " + (a3 > b3));     // false
        System.out.println("a3 < b3: " + (a3 < b3));     // true
        System.out.println("a3 >= b3: " + (a3 >= b3));   // false
        System.out.println("a3 <= b3: " + (a3 <= b3));   // true

         int a4 = 10;
        int b4 = 20;

        // Logical AND
        System.out.println("(a4 > 5 && b4 > 15): " + (a4 > 5 && b4 > 15)); // true

        // Logical OR
        System.out.println("(a4 > 15 || b4 > 15): " + (a4 > 15 || b4 > 15)); // true

        // Logical NOT
        System.out.println("!(a4 > 5): " + !(a4 > 5)); // false

    }

}
