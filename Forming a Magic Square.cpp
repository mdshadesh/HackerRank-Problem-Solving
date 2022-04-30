#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

const int magic_squares_3x3[8][9] = {
    {8, 1, 6, 3, 5, 7, 4, 9, 2},
    {4, 3, 8, 9, 5, 1, 2, 7, 6},
    {2, 9, 4, 7, 5, 3, 6, 1, 8},
    {6, 7, 2, 1, 5, 9, 8, 3, 4},
    {6, 1, 8, 7, 5, 3, 2, 9, 4},
    {8, 3, 4, 1, 5, 9, 6, 7, 2},
    {4, 9, 2, 3, 5, 7, 8, 1, 6},
    {2, 7, 6, 9, 5, 1, 4, 3, 8}
};
int matrix[9];

int main() 
{
    for (int i = 0; i < 9; i++) 
    scanf("%d", &matrix[i]);
    int min_cost = 100;
    for (int i = 0; i < 8; i++) 
    {
        int cost = 0;
        for (int j = 0; j < 9; j++) 
        cost += abs(matrix[j] - magic_squares_3x3[i][j]);
        if (cost < min_cost) 
        min_cost = cost;
    }
    printf("%d\n", min_cost);
    return 0;
}
