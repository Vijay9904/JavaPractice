
package vk;
 class employee{
     String name;
     double salary;
     employee(String name ,double salary){
         this.name=name;
         this.salary=salary;
     }
    
     void display(){
         System.out.println(" the parant class is the name is "+ name + "the salary is"+salary);
     }
}
class Manager extends employee{

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void display() {
        System.out.println("the name is " +name + " the salary is"+ salary);
        super.display(); 
    }

    
}
public class employeehirachesuper {
    public static void main(String args[]){
       
       Manager  m = new Manager ("vk",880000.0);
       m.display();
    }
}
