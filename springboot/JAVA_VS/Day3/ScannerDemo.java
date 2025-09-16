package Day3;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create scanner

        System.out.print("Enter your name: ");
        String name = sc.nextLine();          // Read a line of text

        System.out.print("Enter your age: ");
        int age = sc.nextInt();               // Read integer

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();      // Read double

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        sc.close();   // Close scanner
    }}
 
    

