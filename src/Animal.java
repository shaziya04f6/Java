/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syed.shaziya
 */
public class Animal {
    void sound(){
        System.out.println("Some Sound.");
    }
    
}
class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("Bark.");
    }
}
class Cat extends Dog{
    void sound(){
        super.sound();
        System.out.println("Meow.");
    }
}
class Output{
    public static void main(String args[]){
        Cat ct =new Cat();
        ct.sound();
    }
}
