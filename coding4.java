/*Create a complete Java program which 
 * determine the number of odd and even numbers
 * based on ten (10) numbers entered by user. 
 */
import java.util.Scanner;
class coding4{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double[]number=new double[10];
int even=0,odd=0;
for(int i=0;i<number.length;i++){
    int n=i+1;
    System.out.println("Enter number("+n+")=");
    number[i]=sc.nextInt();
    
if(number[i]%2==0)
even=even+1;
else
odd=odd+1;}
System.out.println("there are a total of "+even+" even numbers and a total of "+odd+" odd numbers");
}}