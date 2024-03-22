import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon16173 {

    static int N;
    static int[][] MAP;
    static boolean[][] VISIT;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        MAP = new int[N][N];
        VISIT = new boolean[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                MAP[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 시작 지점 부터 깊은 탐색 시작
        dfs(0, 0);

        // 모두 탐색 후 3, 3 즉 마지막을 방문했다면 HaruHaru, 방문하지 못했다면 Hing 출력
        if (VISIT[N - 1][N - 1]) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }

    public static void dfs(int x, int y) {
        VISIT[x][y] = true;

        // 현재 위치에 있는 숫자만큼 다음 칸 이동
        int move = MAP[x][y];
        // 오른쪽으로 이동했을 때 보드 밖이 아니라면 이동
        if (y + move < N) {
            if (!VISIT[x][y + move]) {
                dfs(x, y + move);
            }
        }
        // 아래로 이동했을 때 보드 밖이 아니라면 이동
        if (x + move < N) {
            if (!VISIT[x + move][y]) {
                dfs(x + move, y);
            }
        }
    }
}
