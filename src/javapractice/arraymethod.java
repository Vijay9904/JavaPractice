package javapractice;

public class arraymethod {

    static void swap(int[] vk){
        int temp=vk[0];
        vk[0]=vk[1];
        vk[1]=temp;
        
    }

    public static void main(String[] args){

        int arr[] = {10,20};
        System.out.println("before swap" +arr[0]+" " +arr[1]);  
        swap(arr);   // now works

        System.out.println("after swap" + arr[0]+" " +arr[1]);  // 65
    }
}
