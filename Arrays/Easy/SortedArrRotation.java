// ques leetcode 1765::
// Non-decreasing order: The array must be sorted such that each element is greater than or equal to the previous one.
// Rotation: The array can be rotated any number of times, meaning elements from the start can be moved to the end.

// Approch::
// Count the number of decreasing pairs in the circular array comparison (i.e., where arr[i] > arr[(i+1)%n]).

// If the number of decreasing pairs (count) is at most 1, then it means the array is sorted and possibly rotated.

import java.util.Scanner;

public class SortedArrRotation {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();  
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
            
        }
        if(count<=1)System.out.println("true");
        else{
            System.out.println("false");
        }
    }
    
}
