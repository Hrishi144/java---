import java.util.Scanner;
 class Employee{
    String address,name;
    int age,salary;
    long phnnum;
    Scanner sc=new Scanner(System.in);
    void printemployee(String role){
        System.out.println("enter the name of "+role);
         name=sc.nextLine();
        System.out.println("enter the age of "+role);
         age=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the address of"+role);
         address=sc.nextLine();
        System.out.println("enter the phone number of "+role);
        phnnum=sc.nextLong();
        sc.nextLine();
       
    }void salary(String role){
    System.out.println("enter the salary of "+role);
     salary=sc.nextInt();
     sc.nextLine();
   
    }} 
    class officer extends Employee{
    
    String spcliztion1;
    String department1;
    void specialization(){
    System.out.println("enter the specialization of the officer");
       spcliztion1=sc.nextLine();

    }void department(){
        System.out.println("enter the department of the officer");
         department1=sc.nextLine();
    }
}
class manager extends Employee{
  
    String spcliztion2;
    String department2;
    void specialization(){
    System.out.println("enter the specialization of the manager");
      spcliztion2=sc.nextLine(); 
     
    }void department(){
       System.out.println("enter the department of the manager");
         department2=sc.nextLine();
    }}
     public class Company{
        public static void main(String[]args){
            officer e=new officer();
            e.printemployee("officer");
            e.salary("officer");
            e.specialization();
            e.department();
            manager x=new manager();
            x.printemployee("manager");
            x.salary("manager");
            x.specialization();
            x.department();
            System.out.println("THE DETAILS ARE OF THE FOLLOWING***********\n");
            System.out.println("Name: "+e.name);
            System.out.println("age: "+e.age);
            System.out.println("phonenumebr "+e.phnnum);
            System.out.println("address: "+e.address);
            System.out.println("salary: "+e.salary);
            System.out.println("specialization: "+e.spcliztion1);
            System.out.println("Department1: "+e.department1+"\n");
 System.out.println("Name: "+x.name);
System.out.println("age: "+x.age);
System.out.println("phonenumebr "+x.phnnum);
System.out.println("address:"+x.address);
System.out.println("salary:"+x.salary);
System.out.println("specialization: "+x.spcliztion2);
System.out.println("Department1:" +x.department2);

        }
     }
