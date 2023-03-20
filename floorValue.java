package DsaBasic;

import java.util.Scanner;

public class floorValue {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int [] arr ={2,4,6,8,13,15,17,34,56,67,88};
        System.out.print("enter number: ");
        int target = sc.nextInt();
        int ans= arr[BinarySearch(arr,target)];
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
        int str=0;
        int end= arr.length-1;
        while (str<=end){
            int mid=str+((end-str)/2);
            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                str=mid+1;
            }
            else {
                return mid;
            }
        }
        return end;

    }
}
