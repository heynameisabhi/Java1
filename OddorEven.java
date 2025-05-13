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
public class OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EveCount=0;
        int OddCount=0;
        System.out.println("Enter the value of size");
        int n= sc.nextInt();
        int []arr=new int[n]; 
        System.out.println("Enter the Array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        
    }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                EveCount++;
            }
            else{
                OddCount++;
            }
        }
        
        System.out.println("Even Count: "+EveCount);
        System.out.println("odd Count: "+OddCount);
    }
    
}
