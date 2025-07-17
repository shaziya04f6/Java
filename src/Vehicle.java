/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
public class Vehicle {
   void start(){
       System.out.println("Vehicle started.");
   }
    
}
class Car extends Vehicle{

  @Override
void start() {
    super.start();
    System.out.println("Car started.");
} 
}
class Bike extends Car{
    void start(){
        super.start();
        
        System.out.println("Bike started.");
    }
}
class Result{
    public static void main(String args[]){
      Bike obj=new Bike();
      obj.start();
    }
}
