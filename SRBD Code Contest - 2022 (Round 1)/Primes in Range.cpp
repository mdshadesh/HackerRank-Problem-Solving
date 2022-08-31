#include <bits/stdc++.h>
#define mx 200007
using namespace std;
#define ll long long
 
bool ok[mx];
std::vector<int> v[mx];
 
void sieve()
{
  for( int i=2;i<mx;i++ )
  {
    if(!ok[i])
    {
      for( int j=i;j<mx;j+=i )
      {
        if(j!=i)
          ok[j]= 1;
        v[j].push_back(i);
      }
    }
  }
}
 
int val[mx];
int occ[mx];
 
int main()
{
    // ios_base::sync_with_stdio(0);
    // cin.tie(0);
 
    sieve();
 
    int n,q;
    scanf("%d %d", &n, &q);
 
    int arr[n+5];
 
    for( int i=0;i<n;i++ )
    {
      scanf("%d", &arr[i]);
      occ[arr[i]]++;
    }
 
    for( int i=2;i<mx;i++ )
      for( int j=i;j<mx;j+=i )
        val[i]+= occ[j];
 
    while(q--)
    {
      int x;
      scanf("%d", &x);
 
      int p= v[x].size();
 
      ll ans= 0;
 
      for( int mask=1;mask<(1<<p);mask++ )
      {
        int tot= 1;
        for( int i=0;i<p;i++ )
          if(mask&(1<<i))
            tot*= v[x][i];
 
        if(tot>=mx)
          continue;
 
        if(__builtin_popcount(mask)&1)
        {
          if(tot<mx)
            ans+= val[tot];
        }
        else
          if(tot<mx)
            ans-= val[tot];
      }
 
      printf("%d\n", n-ans);
    }
}