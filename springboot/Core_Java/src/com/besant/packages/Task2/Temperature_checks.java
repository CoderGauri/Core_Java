package com.besant.packages.Task2;

import java.util.Scanner;

public class Temperature_checks {
    public static void main(String[] args) {
Scanner temp = new Scanner(System.in);
System.out.println("enter your temperature");
int temp1 = temp.nextInt();
System.out.println("your temperature is " + temp1);System.out.println("Temperature is Warm");
if (temp1 < 0){
    System.out.println("Temperature is cold");
} else if (temp1 > 0 && temp1 <15){
            System.out.println("Temperature is cool");
        }
else if (temp1 > 16 && temp1 < 30){
    System.out.println("Temperature is Warm");
}
else {
    System.out.println("Temperature is Hot");
}
    }
}
