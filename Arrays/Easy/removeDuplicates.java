import java.util.Scanner;

public class removeDuplicates {
     public static  int removeDupli(int[] nums) {
        if(nums.length==0) return 0;
        int idx=1;
        for(int i=1;i<nums.length;i++){
           if (nums[i] != nums[i - 1]) {
            nums[idx] = nums[i];
            idx++;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.err.println(removeDupli(arr));
    }

}
    

