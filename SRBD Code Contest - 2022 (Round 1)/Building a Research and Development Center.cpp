#include <bits/stdc++.h>
#define mx 100007
#define pii pair<int,int>
#define ff first
#define ss second
using namespace std;
#define ll long long

int par[mx];
set<pii>st[mx];

int Find(int u)
{
  if(par[u]==u)
    return u;
  return par[u]= Find(par[u]);
}

void unite(int u, int v)
{
  int paru= Find(u);
  int parv= Find(v);
  
  if(paru==parv)
    return;

  if(st[paru].size()>st[parv].size())
  {
    for( auto x: st[parv] )
      st[paru].insert(x);
    st[parv].clear();
    par[parv]= paru;
  }
  else
  {
    for( auto x: st[paru] )
      st[parv].insert(x);
    st[paru].clear();
    par[paru]= parv;
  }
}

int lvl[mx];

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n,q;
    cin>>n>>q;

    for( int i=0;i<n;i++ )
    {
      int x;
      cin>>x;

      lvl[x]= n-i;
      par[x]= x;

      st[x].insert({n-i,x});
    }

    while(q--)
    {
      int t;
      cin>>t;

      if(t==1)
      {
        int a,b;
        cin>>a>>b;

        unite(a,b);
      }
      else if(t==2)
      {
        int x;
        cin>>x;

        int paru= Find(x);

        st[paru].erase(st[paru].lower_bound({lvl[x],x}));
        lvl[x]++;
        st[paru].insert({lvl[x],x});
      }
      else
      {
        int x;
        cin>>x;

        int paru= Find(x);
        int val= (*(st[paru].rbegin())).ss;

        cout<<val<<"\n";
      }
    }
}