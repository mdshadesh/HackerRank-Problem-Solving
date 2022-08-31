#include <bits/stdc++.h>
using namespace std;
 
const int MAX = 200000;
vector<int> primes;
bool comp[MAX + 5];
int freq[MAX + 5], seen[MAX + 5];
 
void sieve()
{
    for (int i = 2; i * i <= MAX; i++)
    {
        if (!comp[i])
        {
            for (int j = i * i; j <= MAX; j += i)
            {
                comp[j] = 1;
            }
        }
    }
    primes.push_back(2);
    for (int i = 3; i <= MAX; i += 2)
    {
        if (!comp[i]) primes.push_back(i);
    }
}
 
bool checkBit(int n, int pos)
{
    return (n & (1 << pos)) > 0;
}
 
vector<int> factorize(int elem)
{
    vector<int> factors;
    for (int i = 0; i < primes.size() && primes[i] <= (elem / primes[i]); i++)
    {
        if (elem % primes[i] == 0)
        {
            factors.push_back(primes[i]);
            while (elem % primes[i] == 0)
            {
                elem /= primes[i];
            }
        }
    }
    if (elem > 1) factors.push_back(elem);
    return factors;
}
 
void process(int elem)
{
    auto factors = factorize(elem);
    int SIZE = factors.size();
    for (int mask = 1; mask < (1 << SIZE); mask++)
    {
        int constructed_num = 1;
        for (int i = 0; i < SIZE; i++)
        {
            if (checkBit(mask, i))
            {
                constructed_num *= factors[i];
            }
        }
        freq[constructed_num]++;
    }
}
 
int get_copr_pair_count_with(int x, int n)
{
    if (seen[x] != -1) return seen[x];
    auto factors = factorize(x);
    int SIZE = factors.size();
    int result = 0;
    for (int mask = 1; mask < (1 << SIZE); mask++)
    {
        int constructed_num = 1;
        int parity = 0;
        for (int i = 0; i < SIZE; i++)
        {
            if (checkBit(mask, i))
            {
                constructed_num *= factors[i];
                parity++;
            }
        }
        if (parity % 2 == 0)
            result -= freq[constructed_num];
        else
            result += freq[constructed_num];
    }
    return seen[x] = n - result;
}
 
int main()
{
    sieve();
    memset(seen, -1, sizeof seen);
    int n, q, elem;
    scanf("%d %d", &n, &q);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &elem);
        process(elem);
    }
    while(q--)
    {
        int x;
        scanf("%d", &x);
        printf("%d\n", get_copr_pair_count_with(x, n));
    }
    return 0;
}
 