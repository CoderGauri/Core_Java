public class CalculatorDemo {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 34;
        //object Creation
        CalculatorDemo obj = new CalculatorDemo();
        //Function or method calling
        int result = obj.addNumber(num1,num2);
        System.out.println(result);
        int result1 = obj.subNumber(num1,num2);
        System.out.println(result1);
        int result2 = obj.multiplyNumber(num1,num2);
        System.out.println(result2);
        int result3 = obj.divideNumber(num1,num2);
        System.out.println(result3);
    }
    //add functionality
    public int addNumber(int a , int b){
        int sum = a + b;
        return sum;}
        public int subNumber(int a , int b){
            int sum = a - b;
            return sum;}
            public int multiplyNumber(int a , int b){
                int sum = a * b;
                return sum;}
                public int divideNumber(int a , int b){
                    int sum = a / b;
                    return sum;

    }



}

