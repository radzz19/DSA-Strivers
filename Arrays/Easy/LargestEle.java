import java.util.Scanner;

public class LargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();  
        }
        int maxele=arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i]>maxele){
                maxele=arr[i];
            }  
        }
        System.out.println(maxele);
    }
    
}
