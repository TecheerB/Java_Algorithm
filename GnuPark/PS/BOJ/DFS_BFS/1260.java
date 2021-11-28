import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 1260 {
    static int map[][];
    static boolean[] visit;
    static int n, m, v;

    public static void dfs(int i) {
        visit[i] = true;
        System.out.print(i + " ");
        for (int j = 1; j < n + 1; j++) {
            if (map[i][j] == 1 && visit[j] == false) {
            }
        }
    }

    public static void bfs(int i) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(i);
        visit[i] = true;
        // 방문한 위치는 알아야하니까, 그것을 체크하기 위해서 visit가 필요.
        while (!q.isEmpty()) {
            int temp = q.poll();
            // 첫번째 방문한 위치는 빼주기로 한다.
            System.out.print(temp + " ");
            for (int k = 1; k <= n; k++) {
                if (map[temp][k] == 1 && visit[k] == false) {
                    q.offer(k);
                    visit[k] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        map = new int[n + 1][n + 1];
        visit = new boolean[n + 1];
        for (int j = 0; j < n + 1; j++) {
            Arrays.fill(map[j], 0);
        }
        Arrays.fill(visit, false);
        for (int i = 0; i < m; i++) {
            String edge = br.readLine();
            StringTokenizer st1 = new StringTokenizer(edge, " ");
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }
        dfs(v);
        System.out.println();
        Arrays.fill(visit, false);
        bfs(v);
    }
}
