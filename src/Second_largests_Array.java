/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
import java.util.Scanner;
public class Second_largests_Array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int i,j;int temp;
        System.out.println("Enter Array Elements:");
        for(i=0;i<size;i++){
           a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for( i=0;i<a.length;i++){
            System.out.print("The second largest element in given list of array is:"+a[1]+" ");
            break;
        }
    }
    
}
