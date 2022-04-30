#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int q;
    cin >> q;
    for(int a0 = 0; a0 < q; a0++){
        int x;
        int y;
        int z;
        cin >> x >> y >> z;
        int d1 = abs(x - z), d2 = abs(y - z);
        if (d1 < d2) cout << "Cat A" << endl;
        else if (d1 > d2) cout << "Cat B" << endl;
            else cout << "Mouse C" << endl;
    }
    return 0;
}