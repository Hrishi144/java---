import java.util.Scanner;
class arrangement{
    void condition(int n,int[] a){
   int chan;
    for(int j=0;j<n-1;j++){
        for(int i=0;i<n-1-j;i++)
        if(a[i]>a[i+1]){
            chan=a[i];
            a[i]=a[i+1];
            a[i+1]=chan;

        }}
    }
}public class BubbleSort{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        arrangement x=new arrangement();
        x.condition(n,a);
        System.out.println("the sorted array is:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+ " ");
        }
    }

}