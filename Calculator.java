public class Calculator
{
public static void main(String args[])   
{  
   sum(20,30);
   sub(30,15);
 
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

}