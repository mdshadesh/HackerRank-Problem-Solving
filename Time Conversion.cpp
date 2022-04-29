#include <cstdio>
#include <iostream>
#include <vector>

using namespace std;
using std::vector;

void solve(){
    int hour, minute, second;
    char c1, c2;
    scanf("%d:%d:%d%c%c", &hour, &minute, &second, &c1, &c2);
    // printf("%d\n%d\n%d\n%c\n%c", hour, minute, second, c1, c2);
    hour = hour % 12;
    if (c1 == 'P'){
        hour = hour + 12;
    }
    printf("%02d:%02d:%02d\n", hour, minute, second);

    return;
}

int main(){

    solve();

    return 0;
}