package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon2606 {

    static int C;
    static int N;
    static ArrayList<Integer>[] COMPUTERS;
    static int COUNT;
    static boolean[] VISIT;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        C = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        COMPUTERS = new ArrayList[C + 1];
        VISIT = new boolean[C + 1];

        StringTokenizer st;
        for (int i = 1; i <= C; i++) {
            COMPUTERS[i] = new ArrayList<>();
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int parentNode = Integer.parseInt(st.nextToken());
            int childNode = Integer.parseInt(st.nextToken());
            // 양방향성을 위해서 각 노드를 서로 연결!!!
            COMPUTERS[parentNode].add(childNode);
            COMPUTERS[childNode].add(parentNode);
        }

        COUNT = 0;
        dfs(1);
        System.out.println(COUNT - 1);
    }

    public static void dfs(int x) {
        VISIT[x] = true;
        ++COUNT;

        for (int n : COMPUTERS[x]) {
            if (!VISIT[n]) {
                dfs(n);
            }
        }
    }
}
