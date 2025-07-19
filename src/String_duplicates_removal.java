/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
import java.util.Scanner;
import java.util.HashSet;
public class String_duplicates_removal {
  public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      HashSet<Character> hs=new HashSet<Character>();
      for(int i=0;i<s.length();i++){
          hs.add(s.charAt(i));
      }
      System.out.println("After removing duplicate characters from a given string is: "+hs);
          
  } 
    
}
