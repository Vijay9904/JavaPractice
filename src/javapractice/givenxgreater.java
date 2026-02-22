
package javapractice;
import java.util.Scanner;
public class givenxgreater {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int arr[]={10,20,30,40};
        int count=0;
        int no;
        System.out.println("enter the array search");
        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                no=arr[i];
                System.out.println(no);
               //count++;
            }
        }
          // System.out.println(count);
    }
    
}
