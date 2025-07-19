/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
import java.util.Scanner;
public class Fibonacci_recursion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        Fibonacci_recursion obj=new Fibonacci_recursion();
        for(int i=0;i<n;i++){
            System.out.print( obj.fib(i)+"  ");
        }
        
    }
    public int fib(int n){
        if(n==1||n==0){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    
}
