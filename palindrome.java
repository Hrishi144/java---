import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine(); // Changed nextInt() to nextLine() and string to String
        int flag = 0;
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        sc.close(); 
    }
}
