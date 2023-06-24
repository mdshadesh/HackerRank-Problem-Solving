#include <iostream>
#include <string>
using namespace std;

string Roadmap(string roadmap) {
    string backRoadmap;
    for (int i = roadmap.length() - 1; i >= 0; i--) {
        char direction = roadmap[i];
        if (direction == 'L') {
            backRoadmap += 'R';
        } else if (direction == 'R') {
            backRoadmap += 'L';
        } else {
            backRoadmap += direction;
        }
    }
    return backRoadmap;
}

int main() {
    int T;
    cin >> T;
    cin.ignore(); 

    for (int i = 0; i < T; i++) {
        string roadmap;
        getline(cin, roadmap);

        string backRoadmap = Roadmap(roadmap);
        cout << backRoadmap << endl;
    }

    return 0;
}

