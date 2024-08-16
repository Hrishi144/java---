class numbers{
    int a=10;
    int b=30;
    int c=20;
    double avg;
    void average(){
        avg=(a+b+c)/3;
    }
    void display(){
        System.out.println("the average is "+avg);
        System.out.println("'-'");
    }
}
public class average{
    public static void main(String[] args){
    numbers n=new numbers();
    n.average();
    n.display();
}}