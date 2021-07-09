package SortingAlgo;

public class MergeSortImplementation {
    public static void merge(int[] arr, int l,int m, int r){

    }
    public static void sort(int[] arr,int l,int r)
    {
        if(l<r){
            //middle point
            int m=l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);

            merge(arr,l,m,r);
        }
    }
    public  static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={12,11,13,5,6,7};
        //op 5 6 7 11 12 13
        System.out.println("Given Array");
        printArray(arr);
        sort(arr, 0,arr.length-1);
    }
}
