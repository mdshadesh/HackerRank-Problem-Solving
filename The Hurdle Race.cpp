#include <bits/stdc++.h>

using namespace std;


int main()
{
    int n;
    int k;
    cin >> n >> k;
    int res = 0;
    vector<int> height(n);
    for(int height_i = 0; height_i < n; height_i++)
    {
       cin >> height[height_i];
        if (height[height_i] > k) 
        { 
            res += -k + height[height_i]; 
            k = height[height_i]; 
        }
    }
    printf("%d\n", res);
    return 0;
}