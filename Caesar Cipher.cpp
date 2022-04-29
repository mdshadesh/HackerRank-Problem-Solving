#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  \
       int n;
       char s[100];
       int k;
    cin >> n;
    for (int i =0; i < n;i++){
        cin>> s[i];
    }
    cin >> k;
    for (int i =0; i<n;i++)
        {
        if((s[i]>='a' && s[i]<='z')){
            char o = s[i]- 'a' + k;
                 o = o %('z'-'a' +1);
                 o+='a';
            cout<<o;
        }
        else if ((s[i]>='A' && s[i]<='Z')){
            char o = s[i] - 'A' + k;
                 o = o %('Z'-'A'+1);
                 o+='A';
            cout<<o;
        }
          else
           cout <<s[i];
                            
    }
    
    return 0;
}