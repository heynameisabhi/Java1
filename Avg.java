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
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of size");
        int n= sc.nextInt();
        int []arr=new int[n]; 
        System.out.println("Enter the Array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
          sum+=arr[i];
      }
       double avg=sum/n;
        System.out.println("Average is :"+avg);
       
    }
    
}
