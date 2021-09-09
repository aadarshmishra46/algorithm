package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
4 6  (number of vertex is 4 and number of node is 6)
0 1
1 2
2 3
3 0
0 2
1 3
BFS Traversal
0 1 2 3
 */
public class BFS_Traversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        while (e-->0){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);

        }
        bFS_Traversal(n, adj);

    }

    private static void bFS_Traversal(int n, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited=new boolean[n];
        // here is only one componenet no need to take for loop
        // just take queue
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;
        while (!queue.isEmpty()){
            int node=queue.remove();
            System.out.println(node+" ");
           for(Integer it: adj.get(node)){
               if(visited[it]==false)
               {
                   visited[it]=true;
                   queue.add(it);
               }

           }
        }
    }


}
    