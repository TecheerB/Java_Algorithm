package BOJ.DFS_BFS;

import java.io.*;
import java.util.*;

public class 효율적인_해킹_1325 {
    static int n, m;
    static int ans;
    static boolean visit[];
    static int arr[];
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n+1];
        arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            graph[e].add(s);
        }

        for (int i = 1; i <= n; i++) {
            visit = new boolean[n + 1];
            bfs(i);
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ans){
                sb.append(i + " ");
            }
        }
        System.out.println(sb.toString());

    }

    public static void bfs(int index){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(index);
        visit[index] = true;

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int v : graph[now]){
                if(!visit[v]) {
                    visit[v] = true;
                    arr[index] ++;
                    q.offer(v);
                }
            }
        }
        if (ans < arr[index]){
            ans = arr[index];
        }

    }
}
