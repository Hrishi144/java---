import java.util.Scanner;
public class sum1 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];  

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  
        }
        System.out.println("Enter the target:");
        int tar = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {  
            if (arr[i] + arr[i + 1] == tar) {
                System.out.println("The indices are: " + i + " and " + (i + 1));
            }
        }

    
    }
}
