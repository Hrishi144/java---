import java.util.Scanner;
public class swap{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of a and b");
       int a=sc.nextInt();
       int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the new value of a is "+a+" and the value of b is "+b);
    }
}