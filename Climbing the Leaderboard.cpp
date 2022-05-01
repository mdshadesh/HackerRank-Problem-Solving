#include <bits/stdc++.h>

using namespace std;

typedef long long LL;


int n, m;

int main()
{
    scanf("%d", &n);
    set<int> s;
    for (int i = 0; i < n; ++i)
    {
        int x;
        scanf("%d", &x);
        s.insert(x);
    }
    scanf("%d", &m);
    vector<int> v(s.begin(), s.end());
    for (int i = 0; i < m; ++i)
    {
        int x;
        scanf("%d", &x);
        int pos = upper_bound(v.begin(), v.end(), x) - v.begin();
        printf("%d\n", (int)v.size() - pos + 1);
    }
    return 0;
}
