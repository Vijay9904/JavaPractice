
package vk;
/*Create a parent class Vehicle with a method start().

Override start() in child classes Car and Bike to print appropriate messages.

In main, create Vehicle reference pointing to Car and Bike objects and call start().
 */
class Vehicle{
    void start(){
        System.out.println("vechcle is starting");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("car is starting");
    }
}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("bike is starting");
    }
}
public class RunTimePolymorphism {
    public static void main(String args[]){
        Vehicle v ;
        v= new Car();
        v.start();
        v= new Bike();
        v.start();
    }
    
}
