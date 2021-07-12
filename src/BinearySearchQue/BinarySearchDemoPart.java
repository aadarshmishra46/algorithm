package BinearySearchQue;

public class BinarySearchDemoPart {
    public static void binarySearch(int[] arr,int start,int end,int key){
        boolean isPresent=false;
        while (start<=end){
            int midIndex=start+(end-start)/2; // 0+6/2 =3
            if(arr[midIndex]==key){
                System.out.println(key+" Index :"+midIndex);
                isPresent=true;
                break;
            }
            if(arr[midIndex]>key){
                end=midIndex-1;//binary)
            }
            else
            {
                start=midIndex+1;
            }

        }
        if(!isPresent){
            System.out.println("Element is not present");
        }
    }
    public static void main(String[] args) {
        int[] arr={2,5,8,9,10,11,23};// array 0 6
        int key=25;
        binarySearch(arr,0,arr.length-1,key);
    }
}
