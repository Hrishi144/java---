import java.util.Scanner;

class Pair {
    void meth(int a[], int t) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] == t) {
                System.out.println("The indices are " + i + " and " + (i + 1));
                return; 
            }
        }
        System.out.println("No matching pair found");
    }
}

public class twosum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] a = new int[n]; 

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the target:");
        int t = sc.nextInt();

        Pair x = new Pair();
        x.meth(a, t); 
    }
}