/*
Compile-Time Polymorphism
 (Method Overloading)
*/
package vk;
/*
1.Create a class Calculator with a method multiply that can:

Multiply two integers

Multiply three integers

Multiply two doubles
*/
public class Calculator {
     static void multiplay(int a,int b){
         int result=a*b;
        System.out.println("the multiplication of the two integer is "+ " " + result);
        
    }
       static void multiplay(int a,int b,int c){
         int result=a*b*c;
        System.out.println("the multiplication of the three integer is "+ " " + result);
        
    }
         static void multiplay(double a,double b){
         double result=a*b;
        System.out.println("the multiplication of the two double is "+ " " + result);
        
    }
    public static void main(String args[]){
        int num1=10;
        int num2=20;
        int num3=30;
        double a1=10.2;
        double b1=20.2;
        multiplay(num1,num2);
        multiplay(num1,num2,num3);
         multiplay(a1,b1);
        
    }
    
}
