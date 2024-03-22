package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1012 {

    static int M;
    static int N;
    static int[] XD = {0, 1, -1, 0};
    static int[] YD = {1, 0, 0, -1};
    static int[][] GROUND;
    static boolean[][] VISIT;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            GROUND = new int[M][N];
            VISIT = new boolean[M][N];
            int count = 0;

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                GROUND[x][y] = 1;
            }

            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    // 땅에 배추가 심어져있고 지렁이가 간 적이 없다면..
                    if (GROUND[x][y] == 1 && !VISIT[x][y]) {
                        bfs(x, y);
                        // 인접한 땅을 모두 확인했으면
                        // 지렁이 한 마리로 간주
                        ++count;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int x, int y) {
        // 지렁이가 방문했다고 기록을 남긴다.
        VISIT[x][y] = true;
        // 방문한 칸 기준 위, 아래, 좌, 우를 확인하는 동안
        for (int i = 0; i < 4; i++) {
            int nx = x + XD[i];
            int ny = y + YD[i];
            // 땅 범위 내에 있고 인접한 땅에 배추가 심어져있다면 다음 칸으로 이동
            if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                if (GROUND[nx][ny] == 1 && !VISIT[nx][ny]) {
                    // 다음 칸에서 다시 위, 아래, 좌, 우를 확인
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        // 지렁이가 방문했다고 기록을 남긴다.
        VISIT[x][y] = true;
        // 큐에 삽입
        queue.add(new int[]{x, y});
        while (!queue.isEmpty()) {
            // 확인한 노드의 좌표를 꺼낸다.
            x = queue.peek()[0];
            y = queue.peek()[1];
            queue.poll();
            for (int i = 0; i < 4; i++) {
                // 확인한 좌표의 위, 아래, 좌, 우에 배추가 있는 지 확인하고 큐에 삽입
                int a = x + XD[i];
                int b = y + YD[i];
                if (a >= 0 && a < M && b >= 0 && b < N) {
                    if (!VISIT[a][b] && GROUND[a][b] == 1) {
                        VISIT[a][b] = true;
                        queue.add(new int[]{a, b});
                    }
                }
            }
        }
    }
}
