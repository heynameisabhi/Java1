/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of size");
        int n= sc.nextInt();
        int []arr=new int[n]; 
        System.out.println("Enter the Array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reversed array is: ");
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        
    }
    
}
