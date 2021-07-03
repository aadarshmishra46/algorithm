package Math.BitManipulation;

public class FindNthNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];

        }


        for (int i = 1; i <= arr.length + 1; i++) {
            xor = xor ^ i;

        }
        System.out.println(xor);
    }
}
