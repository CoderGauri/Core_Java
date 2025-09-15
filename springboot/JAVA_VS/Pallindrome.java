public class Pallindrome {
    public static void main(String args[]){
//System.out.println(args);

// for(String str: args){
//     System.out.println(str);
//}
palin("gadeag");
    }
    public static void palin (String str){
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                System.out.println("its not a palindrome");
break;
            }
            left++;
            right--;
        }
 System.out.println("is palindrome"); 
    }
}
