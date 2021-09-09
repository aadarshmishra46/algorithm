public class Anup_Interview {
    public static void main(String[] args) {
        int[] arr = {1, 33, 7, 2, 82, 77};
        int[] res = divide(arr);

      //  image(12,12);
        divide_In_String("The 6 people hello 9");
    }

    public static int[] divide(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            try {
                arr[i] =(int)(arr[i] /arr[i + 1]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try{
            arr[arr.length - 1] = arr[arr.length - 1] / arr[0];
        } catch (Exception e1){
            System.out.println(e1.getMessage());
        }

        return arr;
    }
    public  static void image(int n,int m){
        // accoring the question
        // n=12 and m=12
        n=12;
        m=12;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if((j>3 && j<9) && (i>3 && i<9))
                    System.out.print("w"+" ");
                else
                    System.out.print("b"+" ");
            }
            System.out.println();

        }

    }
    public  static  void divide_In_String(String s){
        int sum=0;
        int first=0;
        int last=0;
        boolean b=true;
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i)>=48 && s.charAt(i)<=57){
                int val=s.charAt(i)- '0';
               sum = sum+val;
               System.out.println(sum);
               last=val;
               if(b==true){
                   first=val;
                   b=false;
               }
           }
        }
        System.out.println("Sum="+sum+" First="+first+" Last= "+last);
    }
}

