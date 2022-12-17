#include <stdio.h>
#include <math.h>
#include<bits/stdc++.h>
using namespace std;

int totalTopics(unsigned char *topics1, unsigned char *topics2, int topics) {
    int total = 0;
    for (int j=0; j<topics; j++) {
        unsigned char orValue = topics1[j] | topics2[j];
        if (orValue)
            total++;
    }
    return total;
}

int main() {
    int N, M;
    scanf("%d %d", &N, &M);
    unsigned char topics[N][M];
    for (int i=0; i<N; i++) {
        unsigned char input;
        scanf("%c", &input);
        for (int j=0; j<M; j++) {
            scanf("%c", &input);
            topics[i][j] = input-'0';
        }
    }
    int combined[M+1];
    for (int j=1; j<=M; j++)
        combined[j] = 0;
    for (int i=0; i<N; i++)
        for (int j=i+1; j<N; j++) {
            int total = totalTopics(topics[i], topics[j], M);
            combined[total]++;
        }
    for (int j=M; j>0; j--)
        if (combined[j] > 0) {
            printf("%d\n%d\n", j, combined[j]);
            break;
        }
        
    return 0;
}