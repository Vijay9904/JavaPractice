
package javapractice;

//import java.util.Scanner;
public class arrayquestions {
    public static void main(String [] args){
        //Scanner sc = new Scanner(System.in);
        int arr[]={100,80,30,40,50,60,23,34};
//        int s=0;
//        for(int i=0;i<arr.length;i++){
//            s+=arr[i];
//            }
//          System.out.println(s);
//System.out.println("enter the x value to find ");
//int x= sc.nextInt();
//for(int i=0;i<arr.length;i++){
//    if(arr[i]==x){
//        System.out.println(i);
//    }
//}
//max array
int max=Integer.MIN_VALUE;
int second=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}
for(int i=0;i<arr.length;i++){
    if(arr[i]>second&& arr[i]!=max){
        second=arr[i];
    }
}
System.out.println(second);

        
          
        }
      
        
    }
    

