package Graph;

import java.util.ArrayList;
import java.util.Scanner;
/*
4 6  (number of vertex is 4 and number of node is 6)
0 1
1 2
2 3
3 0
0 2
1 3

Answer:
1 3 2
0 2 3
1 3 0
2 0 1

 */
public class Graph_Representation_UsingList {
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
            AddIntoAdjList(adj,u,v);
        }
        print(adj);
    }

    private static void AddIntoAdjList(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    private static void print(ArrayList<ArrayList<Integer>> adj){
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
