package InterviewPrerationNS;

public class First_Second_Max {
    public static void main(String[] args) {
        int[] arr={20,15,18,9,35,16,35,18,10};
        printFirst_Second_Max(arr,arr.length);
    }

    private static void printFirst_Second_Max(int[] arr, int n) {
        int first=0;
        int second=0;
        int temp=0;
        for (int i = 0; i < n; i++) {

            if(arr[i]>first){
               second =first;
               first=arr[i];

            }
            else if(arr[i] >second){
                second =arr[i];

            }

        }

        System.out.println(first+" "+second);
    }
//
}
