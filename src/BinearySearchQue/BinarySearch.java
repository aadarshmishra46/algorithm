package BinearySearchQue;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={2,3,4,1};
        Arrays.sort(arr);
        int target=1;
        int low=0;
        int high= arr.length-1;
        while (low<=high)
        {
            int mid=low +(high-low)/2;
            int midValue=arr[mid];
            if(target==midValue)
            {
                System.out.println(arr[mid]);
                break;
            }
            else if(target>midValue)
            {
                low=mid+1;

            }
            else
            {
                high=mid-1;

            }

        }
    }
}
