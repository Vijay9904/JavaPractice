
package vk;
public class task2 {
    public static  class student{
        int rno;
        String name;
        
        public student(int r,String n){
        rno=r;
        name=n;
    }
        public void display(){
            System.out.println(rno + " " + name);
        }
    }
     
    public static void main(String[] args){
        student s= new student(47,"vijay");
        s.display();
    }
    
}
