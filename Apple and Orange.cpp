#include <iostream>
#include <cmath>
#include <vector>
#include <cstdlib>
#include <cstdio>
#include <climits>
#include <ctime>
#include <cstring>
#include <queue>
#include <stack>
#include <list>
#include <algorithm>
#include <map>
#include <set>
#define LL long long
#define Pr pair<int,int>
#define fread(ch) freopen(ch,"r",stdin)
#define fwrite(ch) freopen(ch,"w",stdout)

using namespace std;
const int INF = 0x3f3f3f3f;
const int mod = 1e9+7;
const double eps = 1e-8;
const int maxn = 112345;


int main()
{
    //fread("");
    //fwrite("");

    int s,t,a,b,m,n,x;
    int aa,bb;
    aa = bb = 0;

    scanf("%d%d%d%d%d%d",&s,&t,&a,&b,&m,&n);
    while(m--)
    {
        scanf("%d",&x);
        if(s <= a+x && a+x <= t) aa++;
    }

    while(n--)
    {
        scanf("%d",&x);
        if(s <= b+x && b+x <= t) bb++;
    }

    printf("%d\n%d\n",aa,bb);

    return 0;
}