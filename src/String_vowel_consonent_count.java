/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
import java.util.ArrayList;
import java.util.Scanner;
public class String_vowel_consonent_count {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String value:");
    String s=sc.nextLine();
    ArrayList<Character>al1=new ArrayList<Character>();
    ArrayList<Character>al2=new ArrayList<Character>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            al1.add(ch);
        }else{
            al2.add(ch);
        }
        
    }
    System.out.println("Vowels in a given String:");
    for(char vowels:al1){
        System.out.println(vowels);
    }
    System.out.println("Consonents in a given String:");
    for(char consonent:al2){
        System.out.println(consonent);
    }
    
}
    
}
