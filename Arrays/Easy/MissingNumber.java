import java.util.Arrays;
import java.util.Scanner;
public class MissingNumber{
    public static int missingNum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(arr[i] != i) return i;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.err.println(missingNum(arr));
    }
}