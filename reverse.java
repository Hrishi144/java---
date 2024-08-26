import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
     System.out.println("enter the string");
     String org=sc.nextLine();
     String rev=" ";
     for(int i=0;i<org.length();i++){
         rev=org.charAt(i)+rev;
     }
     System.out.println("the reversed string is  "+rev);
    }
}