public class Conditional {
    public static void main(String a[]) {
        // example one
        int time = 9;
        if (time <= 10) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good evening ");
        }
        // example 2
        int age = 20;
        if (age >= 18 && age <= 30) {
            System.out.println("Eligible to enter college");
        } else {
        }
       //if else if
       int marks = 72;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
//trenary operator 

int n = 5;
String result = "even" ;
result = n%2 == 0 ? "even" : "odd";
System.out.println(result);

    }
}
