package com.company.Array.TwoD;

import java.util.Scanner;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ABooleanMatrixProblem {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int t=0;t<T;t++){
            int N=in.nextInt();
            int M=in.nextInt();
            boolean flag=false;
            for(int i=0;i<N;i++){
                flag=false;
                for(int j=0;j<M;j++){
                    char ch=in.next().charAt(0);
                    if(ch=='1'){
                        flag=true;
                    }
                }
                for(int k=0;k<M;k++){
                    if(flag){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }

                System.out.println();
            }
        }
    }
}
/*
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int t=0;t<T;t++){
			int N=in.nextInt();
			int M=in.nextInt();
			int[][] matrix=new int[N][M];
			int flag=0;
			for(int i=0;i<N;i++){
				flag=0;
				for(int j=0;j<M;j++){
					matrix[i][j]=in.nextInt();
					if(matrix[i][j]==1){
						flag=1;
					}
				}
				for(int k=0;k<M;k++){
					if(flag==1){
						System.out.print(1+" ");
					}
					else{
						System.out.print(0+" ");
					}
				}

				System.out.println();
			}
			/*for(int i=0;i<N;i++){
				for(int j=0;j<M;j++){
					if(matrix[i][j]==1){
						for(int k=0;k<M;k++){
							System.out.print(1+" ");
						}
						System.out.println();
						break;
					}
					if(j==M-1 && matrix[i][j]==0){
						for(int k=0;k<M;k++){
							System.out.print(0+" ");
						}
						System.out.println();
					}
				}
			}
		}
                }
                }
 */
/*
  public static void convertMat(int[][] arr,int m,int n){
        boolean check=false;
        for (int i = 0; i < m; i++) {
            check=false;
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==1){
                    check=true;
                    break;
                }
            }
            if(check)
                for (int j = 0; j < n; j++)
                    System.out.print(1+" ");
            else
                for (int j = 0; j < n; j++)
                    System.out.print(0+" ");
            System.out.println();
        }
    }
 */