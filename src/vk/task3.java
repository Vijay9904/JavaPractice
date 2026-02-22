
package vk;
public class task3 {
    public static class emp{
        int id;
        String name;
        static String company="TCS";
 
        
        public void display(){
            System.out.println(id + " "+ name + " " + company);
        }
    }
    public static void main(String args[]){
        emp e= new emp();
         emp e1= new emp();
        e.id=1;
        e.name="vijay";
        e1.id=2;
        e1.name="khetre";
        e.display();
        e1.display();
       
        
    }
    
}
