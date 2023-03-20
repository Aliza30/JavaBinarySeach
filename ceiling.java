package DsaBasic;

import java.util.Scanner;

public class ceiling {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int [] arr ={2,4,6,8,13,15,17,34,56,67,88};
        System.out.print("enter number: ");
        int target = sc.nextInt();
        int ans= arr[BinarySearch(arr,target)];
        System.out.println(ans);
    }
    static int BinarySearch(int[] letters, int target){

        int str=0;
        int end= letters.length-1;
        while (str<=end){
            int mid=str+((end-str)/2);
            if(target<letters[mid]){
                end=mid-1;
            }
            else  {
                str = mid + 1;
            }
        }
        return letters[str % letters.length] ;

    }
    }

