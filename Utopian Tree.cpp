#include <bits/stdc++.h>
using namespace std;

typedef pair<int, int> ii;
typedef vector<ii> vii;
typedef vector<int> vi;

#define FOR(i,s,e) for (int i = int(s); i != int(e); i++)
#define FORIT(i,c) for (typeof((c).begin()) i = (c).begin(); i != (c).end(); i++)
#define sz(v) (int)v.size()
#define all(c) (c).begin(), (c).end()

typedef long long int ll;

int main() {
    int t;
    while (scanf("%d", &t) == 1) {
        for (int i = 0; i < t; i++) {
            int n;
            scanf("%d", &n);

            int height = 1;
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0)
                    height *= 2;
                else
                    height++;
            }

            printf("%d\n", height);
        }
    }
    return 0;
}