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
public class LargestNumber {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    
       int n=sc.nextInt();
      int[]arr=new int[n];
      System.out.println("Enter the array elements");
       for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int max = arr[0];

       for(int i=0;i<n;i++){
          if(max<arr[i]){
              max=arr[i];
          }
      }
        System.out.println("MAX: "+max);;
    
    
}
}
