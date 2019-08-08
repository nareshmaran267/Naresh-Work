import java.util.Scanner;
class coding2{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String[]Racer=new String[5];
double[]Time=new double[5];
int i=0;
double highest=9999;
String highest2="";

while(i<Racer.length){
    int n=i+1;
System.out.println("Enter name for racer("+n+")=");
Racer[i]=sc.next();
System.out.println("Enter time for lap 1=");
double time1=sc.nextDouble();
System.out.println("Enter time for lap 2=");
double time2=sc.nextDouble();

if(time1>time2)
Time[i]=time2;
else if(time1<time2)
Time[i]=time1;
else
Time[i]=time1;

if(Time[i]<highest){
highest=Time[i];
highest2=Racer[i];

i++;}

}
System.out.println("Racer "+ highest2 +" is the winner with the time record of "+highest+" s");
}}