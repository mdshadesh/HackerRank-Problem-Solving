#include <iostream>
using namespace std;

int getLastDigitOfProduct(int N, int arr[]) {
    int lastDigit = 1;
    for (int i = 0; i < N; i++) {
        lastDigit = (lastDigit * arr[i]) % 10;
    }
    return lastDigit;
}

int main() {
    int T;
    cin >> T;

    for (int i = 0; i < T; i++) {
        int N;
        cin >> N;

        int arr[N];
        for (int j = 0; j < N; j++) {
            cin >> arr[j];
        }

        int lastDigit = getLastDigitOfProduct(N, arr);
        cout << lastDigit << endl;
    }

    return 0;
}
