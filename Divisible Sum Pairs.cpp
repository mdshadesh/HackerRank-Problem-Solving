#include <bits/stdc++.h>

using namespace std;

int main(){
    int n;
    int k;
    int count = 0;
    cin >> n >> k;
    vector<int> a(n);
    for(int a_i = 0;a_i < n;a_i++){
       cin >> a[a_i];
    }
    
    for(int i =0 ; i < n -1 ; i++){
        for(int j=i+1 ; j < n ; j++){
            if( (a[i]+a[j])%k ==0){
                count++;
            }
        }
    }
    
    cout << count;
    return 0;
}