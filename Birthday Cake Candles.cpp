#include <iostream>

using namespace std;

int main() {
    
    int n, maks = 0, kolko, x;
    
    cin >> n;
    
    for( int i=0; i<n; i++ ) {
        cin >> x;
        
        if( x > maks ) {
            maks = x; 
            kolko = 1;
        }
        else if( x == maks )
            kolko++;
    }
    
    cout << kolko;
    
    
    return 0;
}