#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void solve() {
    int n;
    cin >> n;
    int nr = n;
    int counter = 0;
    while (nr > 0) {
        int c = nr % 10;
        nr = nr / 10;
        if (c != 0 && n % c == 0) {
            ++counter;
        }
    }
    cout << counter << endl;
}

int main() {
    int t;
    cin >> t;
    for (int i = 0; i < t; ++i) {
        solve();
    }
    return 0;
}