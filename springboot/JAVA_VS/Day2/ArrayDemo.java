package Day2;

public class ArrayDemo {
    public static void main(String a[]) {
        int nums[] = { 3, 4, 5, 7 };
        nums[1] = 6;
        System.out.println(nums[1]);

        int nums1[] = new int[4];
        nums1[0] = 10;
        nums1[1] = 20;
        nums1[2] = 30;
        nums1[3] = 40;
        for (int i = 0; i < 4; i++) {
            System.out.println(nums1[i]);
        }

    }
}
