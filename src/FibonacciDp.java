public class FibonacciDp {
    public static void main(String[] args) {
        int n = 16;
        int res = fibnacci(n);
        System.out.println(res);
    }

    // using dp
//    private static int fibnacci(int n) {
//        //taking integer array
//        int[] arr=new int[n];// 0 to n
//        arr[0]=0;
//        arr[1]=1;
//        //0 1 1 2
//        for (int i = 2; i <n ; i++) {
//            arr[i]=arr[i-1]+arr[i-2];// 0+1=1
//        }
//        return arr[n-1];
//    }qqqqq
    private static int fibnacci(int n) {
        int first = 0;
        int sec = 1;
        int res = 0;
        if (n == 0) {
            return first;
        } else if (n == 1) {
            return sec;
        } else {
            for (int i = 2; i <= n; i++) {
                res = first + sec;
                // swaping
                first = sec;
                sec = res;
            }
            return res;
        }
    }
}

/*
psuedo code inorder travel binary tree( left root right )
inorder(Node node)// this is root node
{
if(root==null)
{
return ;
}
print(node.data+" ");
inorder(node.left);

inorde(node.right);

}

 */