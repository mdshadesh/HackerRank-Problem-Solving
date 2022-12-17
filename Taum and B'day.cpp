#include<bits/stdc++.h>
using namespace std;

int main() 
{
  int cases;
  scanf("%d", &cases);
  while (cases--) 
  {
    int B, W, X, Y, Z;
    scanf("%d %d %d %d %d", &B, &W, &X, &Y, &Z);
    long long res = (long long)B * X + (long long)W * Y;
    res = min(res, (long long)B * X + (long long)W * (X + Z));
    res = min(res, (long long)B * (Y + Z) + (long long)W * Y);
    printf("%lld\n", res);
  }
  return 0;
}