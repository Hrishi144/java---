import java.util.Scanner;
class celcius{
    void calc(){
        double a,b;
        Scanner sc=new Scanner(System.in);
      System.out.println("enter the temprature value in celcius");
       a=sc.nextDouble();
       b=(a*1.8)+32;
       System.out.println("the value of temprature in farenheit is "+b+" degrees farenheit");
       }}
       public class Temprature{
        public static void main(String [] args){
            celcius x=new celcius();
            x.calc();
        }
       }