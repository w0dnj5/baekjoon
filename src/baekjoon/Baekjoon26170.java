package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon26170 {
    static int SIZE = 5;
    static int[][] MAP;
    static boolean[][] VISIT;
    static int[] MOVE_X = {-1, 1, 0, 0};
    static int[] MOVE_Y = {0, 0, -1, 1};
    static int RESULT = 26;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        MAP = new int[SIZE][SIZE];
        VISIT = new boolean[SIZE][SIZE];
        // 입력대로 맵을 생성한다.
        for (int i = 0; i < SIZE; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        dfs(x, y, 0, 0);
        if (RESULT == 26) {
            System.out.println(-1);
        } else {
            System.out.println(RESULT);
        }

    }

    public static void dfs(int x, int y, int apple, int count) {
        if (MAP[x][y] == 1) {
            apple++;
        }
        // 사과 3개를 얻었다면 기존 값과 비교해 더 작은 값으로 바꿔준다.
        if (apple == 3) {
            RESULT = Math.min(RESULT, count);
            // 사과를 3개를 못 모았다면 최솟값은 바뀌지 않으므로 -1을 출력해주면 된다.
            return;
        }

        for (int i = 0; i < 4; i++) {
            int xx = x + MOVE_X[i];
            int yy = y + MOVE_Y[i];
            // 바둑판 범위 내이고 장애물이 없는 구역이면 이동
            if (xx >= 0 && xx < SIZE && yy >= 0 && yy < SIZE && MAP[xx][yy] != -1 && !VISIT[xx][yy]) {
                // 이동할 때 바로 장애물이 생기므로 해당 위치에 장애물을 생성
                VISIT[x][y] = true;
                dfs(xx, yy, apple, count + 1);
                // 깊은 탐색 후 다른 경우의 수를 위해서 장애물을 제거해준다.
                VISIT[x][y] = false;
            }
        }
    }
}
