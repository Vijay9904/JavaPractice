/*
 5️⃣ Final Variable

Create a class Bank:

final String bankName = "SBI"

Try modifying it inside constructor

👉 What happens? Why?
 */
package vk;
public class task5 {
    public static class bank{
//        final String bankname="SBI";
//        bank(){
//            bankname="ippb";
//            final is constant you can not modify after initialize the value
//        }
        int age;
        String name;
        bank(int age,String name){
            this.age=age;
            name=name;//without this variable jar kela tar null value deto 
        }
        public void display(){
            System.out.println(age + " "+ name);
        }
    }
    public static void main(String args[]){
        bank b = new bank(21,"sbi");
        b.display();
    }
    
}
