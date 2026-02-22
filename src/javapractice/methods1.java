
package javapractice;
import java.util.Scanner;

class vk{
    
    void display(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("a is greater"+a);
        }
        else if(b>a && b>c){
            System.out.println("b is grater"+b);
        }
        else{
            System.out.println("c is greater"+c);
        }
    }
}
public class methods1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no");
        int d=sc.nextInt();
        System.out.println("enter the second no");
        int e=sc.nextInt();
        System.out.println("enter the third no");
        int f=sc.nextInt();
        vk v= new vk();
        v.display(d, e, f);
        
    }
}
