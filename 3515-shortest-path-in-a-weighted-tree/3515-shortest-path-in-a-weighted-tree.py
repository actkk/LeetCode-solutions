class FenwickTree:
    def __init__(self, n):
        self.n = n
        self.fenw = [0]*(n+1)

    def update(self, idx, val):
        while idx <= self.n:
            self.fenw[idx] += val
            idx += idx & -idx

    def prefix_sum(self, idx):
        s = 0
        while idx > 0:
            s += self.fenw[idx]
            idx -= idx & -idx
        return s

    def range_update(self, l, r, val):
        self.update(l, val)
        if r+1 <= self.n:
            self.update(r+1, -val)

    def point_query(self, idx):
        return self.prefix_sum(idx)

class Solution(object):
    def treeQueries(self, n, edges, queries):
        adj = [[] for _ in range(n+1)]
        for u, v, w in edges:
            adj[u].append((v, w))
            adj[v].append((u, w))

        parent = [0]*(n+1)
        dist = [0]*(n+1)
        edgeWeight = [0]*(n+1)
        tin = [0]*(n+1)
        tout = [0]*(n+1)
        self.timer = 0

        def dfs(u, p, w):
            parent[u] = p
            edgeWeight[u] = w
            dist[u] = dist[p] + w
            self.timer += 1
            tin[u] = self.timer
            for nbr, wgt in adj[u]:
                if nbr != p:
                    dfs(nbr, u, wgt)
            tout[u] = self.timer

        dfs(1, 0, 0)
        fenw = FenwickTree(n)
        jalkimoren = {'n': n, 'edges': edges, 'queries': queries}
        ans = []
        for q in queries:
            if q[0] == 1:
                _, u, v, new_w = q
                if parent[u] == v:
                    c = u
                else:
                    c = v
                d = new_w - edgeWeight[c]
                edgeWeight[c] = new_w
                fenw.range_update(tin[c], tout[c], d)
            else:
                _, x = q
                ans.append(dist[x] + fenw.point_query(tin[x]))
        return ans
