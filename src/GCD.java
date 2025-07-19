/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
import java.util.Scanner;
public class GCD {
public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first element:");
    int n1=sc.nextInt();
    System.out.println("Enter second element:");
    int n2=sc.nextInt();
    int g=0;
    for(int i=1;i<=n2;i++){
        if(n1%i==0 && n2%i==0){
           g=i;
        }
    }
    System.out.print("The greatest common divisor is:"+g);
}
    
}
