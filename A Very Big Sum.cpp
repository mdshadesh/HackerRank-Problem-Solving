#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <iomanip>
using namespace std;


int main() {
    int t;
    double res=0;
    cin>>t;
    int table[5];
    for(int i=0;i<t;i++){
        cin>>table[i];
        res+=table[i];
    }
    cout<<fixed<<std::setprecision(0)<<res;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}