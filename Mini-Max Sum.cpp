#include <algorithm>
#include <string.h>
#include <vector>
#include <cstdio>
#include <climits>
#include <iostream>
using namespace std;
typedef long long lld;

lld arr[6], N = 5;

int main ()
{
    //freopen("input.txt", "r", stdin);

    lld allsum = 0;
    lld MN = LLONG_MAX, MX = LLONG_MIN;

    for (int i=1; i<=N; i++)
    {
        scanf("%lld", &arr[i]);
        allsum += arr[i];
    }

    for (int i=1; i<=N; i++)
    {
        lld cur = allsum - arr[i];
        MN = min(MN, cur);
        MX = max(MX, cur);
    }

    printf("%lld %lld\n", MN, MX);
}