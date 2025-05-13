/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the size of array");
       int n=sc.nextInt();
      int[]arr=new int[n];
      int sum=0;
        System.out.println("Enter the array element");
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
          sum+=arr[i];
      }
        System.out.println("The Result is:"+sum);
    }
    
}
