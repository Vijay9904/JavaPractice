package vk;

abstract class Vehicle{

public abstract void start();
public abstract void stop();
public void fueltype(String name){
  System.out.println("the fuel  type is "+ name);
}
}
class Car extends Vehicle{
    public void start(){
     System.out.println("car is starting");
    }
    public void stop(){
      System.out.println("car has stoped");  
    }
    
}
class Bike extends Vehicle{
    public void start(){
      System.out.println("bike is starting ");
    }
    public void stop(){
      System.out.println("the bike has stoped");
    }
}


public class abstract1 {
    public static void main(String args[]){
        Vehicle  v= new Car();
        v.start();
        v.stop();
        v.fueltype("petrol");
        v=new Bike();
        v.start();
        v.stop();
        v.fueltype("petrol");
    }
    
}
