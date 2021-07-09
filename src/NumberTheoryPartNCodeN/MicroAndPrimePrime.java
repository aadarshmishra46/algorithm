package NumberTheoryPartNCodeN;
//link https://www.hackerearth.com/practice/math/number-theory/primality-tests/practice-problems/algorithm/micro-and-prime-prime-1/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MicroAndPrimePrime {
    static int testCases,a,b;

    static BufferedReader in=new BufferedReader( new InputStreamReader( System.in ) );

    //  static int primes[]=new int[1000001];

    static int primeprime[]=new int[1000001];

    static boolean visited[]=new boolean[1000001];

    static int maxN=1000000;

    static void initialize(){

        visited[0]=visited[1]=true;

        for(int i=2;i*i<=maxN;i++){

            if( !visited[i] ){

                for( int j=i*i;j<=maxN;j+=i ){

                    visited[j]=true;

                }

            }

        }

        int count=0;

        for(int j=2;j<=maxN;j++){

            if( !visited[j] ){

                count++;//2

            }

            if(!visited[ count ]  ){

                primeprime[j]=1;

            }

        }

        for(int i=2;i<=maxN;i++){

            primeprime[i]+=primeprime[i-1];

        }

    }

    public static void main(String[] args) throws IOException {

        testCases=Integer.parseInt( in.readLine() );

        initialize();

        for(int i=0;i<testCases;i++){

            String x[]=in.readLine().split("\\s");

            a=Integer.parseInt( x[0] );

            b=Integer.parseInt( x[1] );

            int count=primeprime[b]-primeprime[a-1];

            System.out.println(count);

        }

    }

}


