package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon25418 {
    static int A;
    static int K;
    static int COUNT;
    static boolean[] VISIT;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        VISIT = new boolean[K + 1];
        bfs(A);
        System.out.println(COUNT);
    }

    public static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        VISIT[x] = true;
        queue.offer(x);

        while (!queue.isEmpty()) {
            int s = queue.size();
            for (int i = 0; i < s; i++) {
                int n = queue.poll();
                if (n + 1 <= K && !VISIT[n + 1]) {
                    VISIT[n + 1] = true;
                    queue.offer(n + 1);
                }
                if (n * 2 <= K && !VISIT[n * 2]) {
                    VISIT[n * 2] = true;
                    queue.offer(n * 2);
                }
            }
            COUNT++;
            if (queue.contains(K)) {
                return;
            }
        }
    }
}
