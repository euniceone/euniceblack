/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package child;

/**
 *
 * @author pc
 */
public class Child extends Parents {
    public void money (){
        System.out.println("I have five million naira in my account");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Child tobi = new Child();
        System.out.println("Grandpa died at aage" + tobi.age);
        tobi.money();
        tobi.house();
              
        Parents pt = new Parents();
        System.out.println("your age is " +pt.age);
        pt.money();
    }
    
    
}
class Parents extends Grandpa{
    public int age = 78;
    
   
    public void money (){
        System.out.println("I have Two million naira in my account");

}} 
class Grandpa{
    public void house(){
        System.out.println("I have two houses ");
    }
}