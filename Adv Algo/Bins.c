#include <stdio.h>
#include <limits.h>
#include <stdlib.h>

void firstFit(int binCapacity, int items[], int n)
{
    int bins[n];
    int binCount = 0;
    for (int i = 0; i < n; i++)
    {
        int placed = 0;

        for (int j = 0; j < binCount; j++)
        {
            if (bins[j] >= items[i])
            {
                bins[j] -= items[i];
                placed = 1;
                break;
            }
        }

        if (!placed)
        {
            bins[binCount] = binCapacity - items[i];
            binCount++;
        }
    }

    printf("First Fit - Total bins used: %d\n", binCount);
}

void bestFit(int binCapacity, int items[], int n)
{
    int bins[n];
    int binCount = 0;

    for (int i = 0; i < n; i++)
    {
        int bestIdx = -1;
        int minSpaceLeft = INT_MAX;

        for (int j = 0; j < binCount; j++)
        {
            if (bins[j] >= items[i] && (bins[j] - items[i]) < minSpaceLeft)
            {
                bestIdx = j;
                minSpaceLeft = bins[j] - items[i];
            }
        }

        if (bestIdx != -1)
        {
            bins[bestIdx] -= items[i];
        }
        else
        {
            bins[binCount] = binCapacity - items[i];
            binCount++;
        }
    }

    printf("Best Fit - Total bins used: %d\n", binCount);
}

int compare(const void *a, const void *b)
{
    return ((int)b - (int)a);
}

void firstFitDecreasing(int binCapacity, int items[], int n)
{
    qsort(items, n, sizeof(int), compare);
    firstFit(binCapacity, items, n);
}

void bestFitDecreasing(int binCapacity, int items[], int n)
{
    qsort(items, n, sizeof(int), compare);
    bestFit(binCapacity, items, n);
}

int main()
{
    int binCapacity, n;

    printf("Enter bin capacity: ");
    scanf("%d", &binCapacity);

    printf("Enter number of items: ");
    scanf("%d", &n);

    int items[n];
    printf("Enter item sizes:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &items[i]);
    }

    firstFit(binCapacity, items, n);
    bestFit(binCapacity, items, n);
    firstFitDecreasing(binCapacity, items, n);
    bestFitDecreasing(binCapacity, items, n);

    return 0;
}