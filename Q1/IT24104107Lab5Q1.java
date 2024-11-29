import java.util.Scanner;
public class IT24104107Lab5Q1 {
 public static void main (Strain [] args) {
  int num1,num2,num3,smallest,largest;
  Scanner lab = newScanner(System.in);
   System.out.println("Enter the firtst number");
   num1 = lab.nextInt();
   System.out.println("Enter the second number");
   num2= lab.nextInt();
   Systm.out.ptintln("Enter the third number");
   num3= lab.nextInt();
    smallest=num1;
   if(num2<smallest) {
    smallest=num2;
   } 
   if(num3<smallest) {
    smallest=num3;
   }
    largest=num1;
   if(num2>largest) {
    largest=num2;
   }
   if(num3>largest) {
    largest=num3;
   }
   System.out.println("User entered numbers are:" +num1+" "+num2+" "+num3);
   System.out.println("The Smallest number is :"+ smallest );
   System.out.println("The Largest number is :"+ largest );
 }
}
 

      