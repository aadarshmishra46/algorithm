package BinearySearchQue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

bool canPlace(ll dist[], ll n, ll c, ll min_dist)
{
    int cow = 1;
    int curr_stall = dist[0];
    for (ll i = 1; i < n; i++)
    {
        ll x = dist[i];
        if ((x - curr_stall) >= min_dist)
        {
            cow++;
            curr_stall = x;
            if (cow == c)
            {
                return true;
            }
        }
    }

    return false;
}
int main()
{
    ll t;
    cin >> t;
    while (t--)
    {
        ll n, c;
        cin >> n >> c;
        ll dist[n];
        for (ll i = 0; i < n; i++)
        {
            cin >> dist[i];
        }
        sort(dist, dist + n);

        ll s = dist[0];
        ll e = dist[n - 1] - dist[0];
        int mid, ans = 0;
        while (s <= e)
        {
            mid = (s + e) >> 1;
            if (canPlace(dist, n, c, mid))
            {
                ans = mid;
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
        }

        cout << ans << endl;
    }
    return 0;
}
 */
public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        int cow=sc.nextInt();
        int[] arr=new int[n];


        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        int first=arr[0];
        int last=arr[n-1];
        int count=0;
        while (count==cow)
        {
            int check=(first+last)/2;

        }

    }
}
