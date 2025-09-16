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
 
//     String temp = "helloaA world ";
// 		System.out.println(temp.length());
// 		System.out.println(temp.charAt(temp.length() - 1));
// 		System.out.println(temp.substring(0, 5));
// 		System.out.println(temp.contains("ll"));
// 		System.out.println(temp.indexOf(97));
// 		System.out.println(temp.indexOf(65));
// 		System.out.println(temp.equals("helloaA"));
// 		System.out.println(temp.equalsIgnoreCase("helloaa"));
// 		String[] str = temp.split(" ");
// //		for (String s : str) {
// //			System.out.println(s);
// //		}
// //		String temp2 = "  ";
// //		System.out.println(temp2.isEmpty());
// //		System.out.println(temp2.isBlank());
// //
// //		char[] carr = temp.toCharArray();
// //		for (char c : carr) {
// //			System.out.println(c);
// //		}
// 		System.out.println(temp.repeat(4));
// 		System.out.println(temp.trim());
// 	}
// Daily connect to discuss React
//array
// int[] arr = { 1, 2, 3 };
// 		for (int i : arr) {
// 			System.out.println(i);
// 		}
// 		int[][] arr2 = { { 1, 2, 3 }, { 6, 7, 8 }, { 11, 12, 13 } };
// 		for (int[] j : arr2) {
// 			System.out.println();
// //			System.out.println(Arrays.toString(j));
// 			for(int k:j) System.out.print(k+" ");
// 		}
		
// 		int[] arr3 = new int[4];
// 		arr3[2] = 10;
// Daily connect to discuss React

