/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
class Bank2{
    int getinterestRate(){
        return 0;}}
class Canara extends Bank2{
    int  getinterestRate(){
        return 5;}}
class SBI extends Bank2{
    int  getinterestRate(){
        return 6;}}
    
class SCDCC extends Bank2{
    int  getinterestRate(){
        return 8;}}

public class NewClass {
    public static void main(String[]args){
        Canara bank1= new Canara();
        SBI bank2=new SBI();
        SCDCC bank3 = new SCDCC();
        System.out.println("Bank1:"+bank1.getinterestRate()+"%");
        System.out.println("Bank2:"+bank2.getinterestRate()+"%");
         System.out.println("Bank3:"+bank3.getinterestRate()+"%");
        
    }
    
}
