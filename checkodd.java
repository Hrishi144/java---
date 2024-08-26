import java.util.Scanner;
public class checkodd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[20];
        System.out.println("enter the no:of numbers");
        int n=sc.nextInt();
        System.out.println("enter the array of numbers");
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        if(a[i]%2==1){
            System.out.println(a[i]+" is odd");
            
        }else{
            System.out.println(a[i]+" is not odd");
        }
    }
}
}