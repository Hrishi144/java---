class oddeven{
    int numbr=3;
    void num(){
        System.out.println("the given number"+numbr+" is even");
        }
        void num2(){
         System.out.println("the given number"+numbr+" is odd");   
        }
 }
  public class mainclass{
    public static void main(String[] args){
        oddeven n= new oddeven();
        if(n.numbr%2==0){
        n.num();
        }
        else {
        n.num2();
    }  }}
