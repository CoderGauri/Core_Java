public class LambdaDemo {
    public static void main(String[] args) {
        Calculator c = (a,b)-> a + b ;
        int sum = c.add(4,5);
        System.out.println(sum);
        A ist1 = new A();
        int sum1 = ist1.add(3,9);
        System.out.println(sum1);
    }
}
 interface Calculator {
    int add (int a , int b);
 }

 class A implements Calculator {
     public int add (int a , int b){
        return a + b ;
     }

 }