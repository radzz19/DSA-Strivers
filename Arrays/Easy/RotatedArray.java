import java.util.Scanner;

public class RotatedArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int temp[]=new int [n];
        k=k%n;
        for (int i=0;i<n;i++){
            temp[(k+i)%n]=nums[i];
            
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // Read rotation count
        RotatedArray ra = new RotatedArray();
        ra.rotate(arr, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    
}
