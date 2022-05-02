#include <bits/stdc++.h>

using namespace std;

int main(){
    int n;
    int k;
    cin >> n >> k;
    vector<int> c(n);
    for(int c_i = 0;c_i < n;c_i++){
       cin >> c[c_i];
    }
    int energy=100;
    for(int i=0;i<n;i+=k){
        if(c[i]==0) energy--;
        else energy-=3;
    }
    printf("%d",energy);
    return 0;
}
