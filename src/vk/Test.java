package vk;
class employee{
void salary(){
    System.out.println("the base salary");
}
}
class manager extends employee{
    double salary;
    manager(double salary){
        this.salary=salary;
    }
    @Override
    void salary(){
        System.out.println("the salary of manager"+salary);
    }
}
public class Test{
    public static void main(String args[]){
        employee e= new manager(888.99);
        e.salary();
    }
}