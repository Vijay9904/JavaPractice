
package javapractice;
import  java.util.Scanner;
public class Javapractice {
     
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  //System.out.println("enter the number of element");
  int no=sc.nextInt();
  int arr[]= new int[no];
  //System.out.println("eneter the array element");
  for(int i=0;i<no;i++){
      arr[i]=sc.nextInt();
  }
 
  for(int i=0;i<arr.length;i++){
     // System.out.print(arr[i]);
  }
  
     
    }
}  

