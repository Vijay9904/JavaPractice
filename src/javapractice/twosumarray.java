package javapractice;

import java.util.Arrays;

public class twosumarray {

    static int[] sum(int[] arr, int target){
        int n = arr.length;
        int ans[] = new int[2];

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;   // stop once found
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){

        int arr[] = {10,33,44,55,18};
        int target = 54;

        System.out.println(Arrays.toString(sum(arr, target)));
    }
}
