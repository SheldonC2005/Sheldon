#include <stdio.h>
#include <limits.h>
#include <string.h>

#define V 6 // Number of vertices

// Function to perform DFS and find an augmenting path
int dfs(int rGraph[V][V], int source, int sink, int parent[])
{
    int visited[V] = {0}, stack[V], top = 0;
    stack[top++] = source;
    visited[source] = 1;
    parent[source] = -1;

    while (top > 0)
    {
        int u = stack[--top];
        for (int v = 0; v < V; v++)
        {
            if (!visited[v] && rGraph[u][v] > 0)
            {
                stack[top++] = v;
                parent[v] = u;
                visited[v] = 1;
                if (v == sink)
                    return 1;
            }
        }
    }
    return 0;
}

// Ford-Fulkerson algorithm (DFS-based)
int fordFulkerson(int graph[V][V], int source, int sink, int flowGraph[V][V])
{
    int rGraph[V][V], parent[V], max_flow = 0;
    memcpy(rGraph, graph, sizeof(rGraph));
    memset(flowGraph, 0, sizeof(flowGraph));

    while (dfs(rGraph, source, sink, parent))
    {
        int path_flow = INT_MAX;

        for (int v = sink; v != source; v = parent[v])
        {
            int u = parent[v];
            if (rGraph[u][v] < path_flow)
                path_flow = rGraph[u][v];
        }

        for (int v = sink; v != source; v = parent[v])
        {
            int u = parent[v];
            rGraph[u][v] -= path_flow;
            rGraph[v][u] += path_flow;
            flowGraph[u][v] += path_flow;
        }

        max_flow += path_flow;
    }

    return max_flow;
}

int main()
{
    int graph[V][V];

    for (int i = 0; i < V; i++)
        for (int j = 0; j < V; j++)
            scanf("%d", &graph[i][j]);

    int source, sink;
    scanf("%d %d", &source, &sink);

    int flowGraph[V][V];
    int maxFlow = fordFulkerson(graph, source, sink, flowGraph);

    for (int u = 0; u < V; u++)
    {
        for (int v = 0; v < V; v++)
        {
            if (flowGraph[u][v] > 0)
                printf("Edge (%d -> %d): %d\n", u, v, flowGraph[u][v]);
        }
    }

    return 0;
}
