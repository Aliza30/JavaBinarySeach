package DsaBasic;
import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int[] arr={1,22,23,34,44,53,66,67,71,88,91,93,96,123,556,3455,5674};
        int target= in.nextInt();
        int ans= BinarySearch(arr,target);
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
        return -1;

    }
}
