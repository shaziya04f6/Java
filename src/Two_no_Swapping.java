/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
import java.util.Scanner;
public class Two_no_Swapping {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Before Swapping:"+a+" "+b);
        // Swapping Two numbers a & b
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:"+a+" "+b);
        
        
    }
    
}
