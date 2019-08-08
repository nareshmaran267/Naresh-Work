import java.util.Scanner;
class coding5{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter total number of clients=");
int clients=sc.nextInt();
int i=0;
double totalMoney=0,totalPerson;
while(i<clients){
    int n=i+1;
    System.out.println("Enter house price for client("+n+")=");
    double priceHouse=sc.nextDouble();
   
    if(priceHouse<100000)
        totalPerson=(0.05*priceHouse)+priceHouse;
    
    else if(priceHouse>=100000&&priceHouse<=200000)
        totalPerson=(0.05*priceHouse)+priceHouse+3000;
  
    else
    totalPerson=(0.05*priceHouse)+priceHouse+5000;
        
    System.out.println("Total charge for client("+n+")="+totalPerson);
    totalMoney=totalMoney+totalPerson;
    i++;
}
System.out.println("Total actual charges for "+clients+" is RM "+totalMoney);}}