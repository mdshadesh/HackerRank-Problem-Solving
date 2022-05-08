#include<bits/stdc++.h>
#define mp make_pair
#define PII pair<int,int>
#define fi first
#define se second
using namespace std;

const int NMAX=105;

int n,a[NMAX],fr[NMAX];

int main()
{
    int i,mx;
   // freopen("date.in","r",stdin);
   // freopen("date.out","w",stdout);
    cin.sync_with_stdio(false);
    cin>>n;mx=0;
    for (i=1;i<=n;i++)
    {
        cin>>a[i];
        fr[a[i]]++;
        mx=max(mx,fr[a[i]]);
    }
    mx=n-mx;
    cout<<mx<<"\n";
    return 0;
}