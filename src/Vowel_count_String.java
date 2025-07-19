/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
import java.util.Scanner;
public class Vowel_count_String {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String value:");
        String s=sc.nextLine();
        int count=0;
        
        for(int i=0;i < s.length();i++){
           char ch=s.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch =='u'){
                count++;
                 
            }
            
        }
        System.out.print("The number of vowels in a given string is :"+count);
        
         
    }
    
}
