/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
import java.util.HashSet;
import java.util.Scanner;
public class Duplicate_elements_array {
public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of an Array:");
    int size=sc.nextInt();
    int a[]=new int[size];int i;
    System.out.println("Enter Array Elements:");
    for( i=0;i<size;i++){
         a[i]=sc.nextInt();
    }
    HashSet<Integer>hs=new HashSet<Integer>();
    for(i=0;i<a.length;i++){
        if(!hs.add(a[i])==true){
            System.out.print("The duplicate elements are"+a[i]);
        }
    }
    
}  
}
