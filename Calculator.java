public class Calculator
{
public static void main(String args[])   
{  
   sum(20,30);
   sub(30,15);
   mult(12,10);
   div(12,2);
 
}

public static void sum(int n1, int n2){
    int sum;
    sum = n1 + n2;  


    System.out.println("The sum of numbers is: "+sum); 
 }
  public static void sub(int n1, int n2){
    int sub;
    sub = n1-n2;  


    System.out.println("The subtraction of numbers is: "+sub); 
 }
  public static void mult(int n1, int n2){
    int mult;
    mult = n1*n2;  


    System.out.println("The multiplication of numbers is: "+mult); 
 }
   public static void div(int n1,int n2){
      int div;
      div = n1/n2;
      
      system.out.println("The division of numbers is:"+div);
      
   }
      



}
