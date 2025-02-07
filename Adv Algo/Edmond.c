#include <stdio.h>
#include <limits.h>
#include <string.h>

#define MAX_V 1000 // Maximum number of vertices

int v, e, graph[MAX_V][MAX_V], parent[MAX_V];

// BFS function to find an augmenting path
int bfs(int rGraph[MAX_V][MAX_V], int source, int sink)
{
    int visited[MAX_V] = {0}, queue[MAX_V], front = 0, rear = 0;
    queue[rear++] = source;
    visited[source] = 1;
    parent[source] = -1;

    while (front < rear)
    {
        int u = queue[front++];
        for (int i = 0; i < v; i++)
        {
            if (!visited[i] && rGraph[u][i] > 0)
            {
                queue[rear++] = i;
                parent[i] = u;
                visited[i] = 1;
                if (i == sink)
                    return 1;
            }
        }
    }
    return 0;
}

// Edmonds-Karp algorithm (BFS-based Ford-Fulkerson)
int maxFlow(int source, int sink)
{
    int rGraph[MAX_V][MAX_V], max_flow = 0;
    memcpy(rGraph, graph, sizeof(graph));

    while (bfs(rGraph, source, sink))
    {
        int path_flow = INT_MAX;
        for (int i = sink; i != source; i = parent[i])
            path_flow = (path_flow < rGraph[parent[i]][i]) ? path_flow : rGraph[parent[i]][i];

        for (int i = sink; i != source; i = parent[i])
        {
            rGraph[parent[i]][i] -= path_flow;
            rGraph[i][parent[i]] += path_flow;
        }

        max_flow += path_flow;
    }
    return max_flow;
}

int main()
{
    scanf("%d %d", &v, &e);
    memset(graph, 0, sizeof(graph));

    for (int i = 0; i < e; i++)
    {
        int u, v, capacity;
        scanf("%d %d %d", &u, &v, &capacity);
        graph[u][v] = capacity;
    }

    printf("%d\n", maxFlow(0, v - 1)); // Source = 0, Sink = v-1
    return 0;
}
