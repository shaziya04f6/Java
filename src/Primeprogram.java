/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
import java.util.Scanner;
public class Primeprogram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
         int i;
        int count=0;
        for( i=1;i <= n; i++){
           if(n%i==0) {
               count++;
           }
        }
        if(count==2){
            System.out.print("Prime number");
        }
        else{
            System.out.println("not a prime number.");
        }
        
    }
    
}
