/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;
import java.util.Scanner;
import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of size");
        int n= sc.nextInt();
        int []arr=new int[n]; 
        System.out.println("Enter the Array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
    }
     for(int i=0;i<n/2;i++){
         int temp=arr[i];
         arr[i]=arr[n-1-i];
         arr[n-1-i]=temp;
     }
        System.out.println("the reversed array is: " + Arrays.toString(arr));
    
    }
    
    
    
}
