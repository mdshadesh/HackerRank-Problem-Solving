#include <bits/stdc++.h>
using namespace std;

typedef pair<int, int> ii;
typedef vector<ii> vii;
typedef vector<int> vi;

#define FOR(i,s,e) for (int i = int(s); i < int(e); i++)
#define FORIT(i,c) for (typeof((c).begin()) i = (c).begin(); i != (c).end(); i++)
#define sz(v) (int)v.size()
#define all(c) (c).begin(), (c).end()

typedef long long int ll;

// %I64d for ll in CF

int main() {
    int n, k, q;
    while (scanf("%d %d %d", &n, &k, &q) != EOF) {
        int as[n];
        for (int i = 0; i < n; i++) {
            scanf("%d", &as[i]);
        }

        for (int i = 0; i < q; i++) {
            int x;
            scanf("%d", &x);
            x -= k;
            while (x < 0) x += n;
            printf("%d\n", as[x]);
        }
    }
    return 0;
}