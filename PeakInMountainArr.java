package DsaBasic;

public class PeakInMountainArr {
    public static void main(String[] args) {
        int [] arr={0,2,4,5,2};
        System.out.println(BinarySearch(arr));
    }

    static int BinarySearch(int[] arr){
        int str=0;
        int end= arr.length-1;
        while (str<end){
            int mid=str+((end-str)/2);
            if (arr[mid]>arr[mid+1]) {
                //you are in the decreasing part of the array
                // this may be the ans but check left
                end = mid;// this whe end is not eql  to mid-1;
            }
            else {
                str=mid+1;//boz we know that mid+!>mid

            }
        }
        //in the wnd str==end and point to the largest number boz of the two check
        // str and end is to find max elem in the arr
        return str;
    }
}
