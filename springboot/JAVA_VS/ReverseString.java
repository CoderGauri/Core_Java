public class ReverseString {
    public static void main(String args[]) {
        System.out.println(reverse1("Method 1"));

    }

    public static String reverse1(String s) {
        char arr1[] = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while (left < right ){
            char temp = s.charAt(left);
            arr1[left] = s.charAt(right);
            arr1[right] = temp;
            left++;
            right--;

        }
        return new String(arr1);
    }
}
