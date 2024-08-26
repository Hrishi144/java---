class oddeven{
    int numbr=10;
    void num(){
        if(numbr%2==0){
        System.out.println("the given number"+numbr+" is even");
        }else{
         System.out.println("the given number"+numbr+" is odd");   
        }}
 }
  public class check{
    public static void main(String args[]){
        oddeven n= new oddeven();
         n.num();
          }}
