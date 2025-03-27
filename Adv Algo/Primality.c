#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Function for modular exponentiation (x^y % p)
long long powerMod(long long x, long long y, long long p)
{
    long long res = 1;
    x = x % p;
    while (y > 0)
    {
        if (y & 1)
            res = (res * x) % p;
        y = y >> 1;
        x = (x * x) % p;
    }
    return res;
}

// Miller-Rabin primality test
int millerRabinTest(long long d, long long n)
{
    long long a = 2 + rand() % (n - 4);
    long long x = powerMod(a, d, n);
    if (x == 1 || x == n - 1)
        return 1;

    while (d != n - 1)
    {
        x = (x * x) % n;
        d *= 2;
        if (x == 1)
            return 0;
        if (x == n - 1)
            return 1;
    }
    return 0;
}

// Function to check if a number is prime using Miller-Rabin algorithm
int isPrime(long long n, int k)
{
    if (n < 2)
        return 0;
    if (n == 2 || n == 3)
        return 1;
    if (n % 2 == 0)
        return 0;

    long long d = n - 1;
    while (d % 2 == 0)
        d /= 2;

    for (int i = 0; i < k; i++)
    {
        if (!millerRabinTest(d, n))
            return 0;
    }
    return 1;
}

int main()
{
    long long num;
    int k = 5; // Number of iterations for accuracy
    printf("Enter a number: ");
    scanf("%lld", &num);

    if (isPrime(num, k))
    {
        printf("%lld is a prime number.\n", num);
    }
    else
    {
        printf("%lld is not a prime number.\n", num);
    }

    return 0;
}