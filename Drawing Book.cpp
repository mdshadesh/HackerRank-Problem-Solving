#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int n;
    cin >> n;
    int p;
    cin >> p;
    int min_left = 0;
    int cur_left = 0, cur_right = 1;
    while (cur_left != p && cur_right != p) {
        ++min_left;
        cur_left += 2;
        cur_right += 2;
    }
    int min_right = 0;
    cur_left = n % 2 == 0 ? n : n - 1;
    cur_right = cur_left + 1;
    
    while (cur_left != p && cur_right != p) {
        ++min_right;
        cur_left -= 2;
        cur_right -= 2;
    }
    
    cout << std::min(min_left, min_right);
    return 0;
}