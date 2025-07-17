/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
import java.util.Scanner;
public class String_Palindrome {
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String data:");
        String s=sc.nextLine();
        String s1="";
        int l=s.length()-1;
        for(int i=l;i>=0;i--){
           s1=s1+s.charAt(i);
        }
        if(s.equals(s1)){
            System.out.print("Given String is a Palindrome String.");
        }
        else{
            System.out.print("Not Palindrome String.");
        }
    } 
}
