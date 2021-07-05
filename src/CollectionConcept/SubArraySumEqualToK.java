package CollectionConcept;

public class SubArraySumEqualToK {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i< arr.length;i++)
        {
            for (int j = i; j < arr.length ; j++) {
                for (int k = i; k < j+1; k++) {
                    System.out.print(arr[k]+" ");

                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
