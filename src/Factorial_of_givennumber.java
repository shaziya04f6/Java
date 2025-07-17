/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
import java.util.Scanner;
public class Factorial_of_givennumber {
   public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number:");
       int n=sc.nextInt();
       Factorial_of_givennumber obj=new Factorial_of_givennumber ();
       int result=obj.fact(n);
       System.out.print("Factorial of given number"+ n + "is:"+ result+" ");
       
   }
   public int fact(int n){
       if(n==1||n==0)
           return 1;
       else
           return n*fact(n-1);
   }
}
