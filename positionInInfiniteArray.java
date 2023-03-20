package DsaBasic;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class positionInInfiniteArray {
    //box chunk will strat with 2;
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 12, 14, 17, 19, 22, 24, 25, 26, 28, 31, 34, 36, 36, 56, 77, 87, 89, 91, 93, 96, 100, 110, 112, 113, 123, 234, 235, 345, 347, 456, 567, 567};
        int target = 19;
        System.out.println(ans(arr, target));

    }
    static int ans(int[] arr, int target){
        int start=0;
        int end=1;
        while (target > arr[end]){
            int temp=end+1;
            //doubling the box.
            end =   end+(end-(start-1))*2;    // end= previous end+ sizeofbox*2;
            start =   temp;
        }
        return BinarySearch( arr, target, start ,end);
    }

    static int BinarySearch(int[] arr, int target, int str , int end){

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