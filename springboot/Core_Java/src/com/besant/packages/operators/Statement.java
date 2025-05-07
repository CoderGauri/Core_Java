package com.besant.packages.operators;

import  java.util.Scanner;
public class Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = "Sunday";
        if (day.equals( "Monday")){
            System.out.println("happy Monday ");
        } else if (day.equals("Tuesday") ) {
            System.out.println("happy Tuesday");
        }
        else if (day == "Wednesday") {
            System.out.println("happy wednesday ");
        }
        else if (day == "Thursday") {
            System.out.println("happy Thursday");
        }
        else if (day == "Friday") {
            System.out.println("happy Friday " );
        }
        else if (day == "Saturday") {
            System.out.println("happy Saturday");
        }
        else if (day == "Sunday") {
            System.out.println("happy Sunday");
        }
        else {
            System.out.println("invalid Day");
        }
      switch (day){
          case "Monday":
                System.out.println("happy Monday from switch " );
                break;
          case "Tuesday":
              System.out.println("happy tuesday from switch " );
              break;
          case "Wednesday":
              System.out.println("happy wednesday from switch " );
              break;
          case "Thursday":
              System.out.println("happy thursday from switch " );
              break;
          case "Friday":
              System.out.println("happy Friday from switch " );
              break;
          case "Saturday":
              System.out.println("happy Saturday from switch " );
              break;
          case "Sunday":
              System.out.println("happy Sunday from switch " );
              break;

      }
    }
}
