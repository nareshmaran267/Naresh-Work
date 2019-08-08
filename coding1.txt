
import java.util.Scanner;

public class coding1{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter Your MATHS Mark=");
    double num1=sc.nextDouble();
    System.out.print("Enter Your ENGLISH Mark=");
     double num2=sc.nextDouble();
    System.out.print("Enter Your CHEMISTRY MARK=");
     double num3=sc.nextDouble();
    
    double sum=num1+num2+num3;
    System.out.println("Your Total Marks="+sum);
    double average=sum/3;
    System.out.println("Total Average Marks= "+ average);
 if(average > 40)
  System.out.println("You Passed The Exam");
  else
   System.out.println("You Failed...Better Luck Next Time.....");} 
}