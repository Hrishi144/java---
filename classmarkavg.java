import java.util.Scanner;
class student{
    int rollnumber,mathmarks,phymarks,chemmarks;
    String name;
    double avg;
    void getrequireddetails(){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the rollnumber of the student");
      rollnumber=sc.nextInt();
      sc.nextLine();
      System.out.println("enter the name of the student");
      name=sc.nextLine();
      System.out.println("enter the mathematics mark of the student");
      mathmarks=sc.nextInt();
      System.out.println("enter the physics marks of the student");
      phymarks=sc.nextInt();
      System.out.println("enter the chemistry mark of the student");
      chemmarks=sc.nextInt();
    }void displayaverage(){
        avg=(mathmarks+phymarks+chemmarks)/3;
        System.out.println("the average  the marks is"+avg);
    }
} public class Implement1{
    public static void main(String args[]){
        student s=new student();
        s.getrequireddetails();
        s.displayaverage();
    }
}