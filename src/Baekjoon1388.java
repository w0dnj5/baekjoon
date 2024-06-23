package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1388 {

    static int N;
    static int M;
    static String[][] BOARD;
    static boolean[][] VISIT;
    static int C;
    static int[] MOVE = {1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        BOARD = new String[N][M];
        VISIT = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split("");
            BOARD[i] = input;
        }

        C = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!VISIT[i][j]) {
                    // 이어진 판자 탐색이 모두 끝나면 블럭 개수 1개 추가
                    bfs(i, j);
                    ++C;
                }
            }
        }
        System.out.println(C);
    }

    public static void dfs(int x, int y) {

        VISIT[x][y] = true;

        // 현재 위치의 판자 모양을 확인
        if (BOARD[x][y].equals("-")) {
            for (int i = 0; i < 2; i++) {
                // - 모양이라면 좌우를 확인
                int ny = y + MOVE[i];
                if (ny >= 0 && ny < M) {
                    // 확인하는 판자가 바닥 범위 내일 때 -라면 다음 탐색 실행
                    if (!VISIT[x][ny] && BOARD[x][ny].equals("-")) {
                        dfs(x, ny);
                    }
                }
            }
        } else {
            for (int i = 0; i < 2; i++) {
                // | 모양이라면 상하를 확인
                int nx = x + MOVE[i];
                if (nx >= 0 && nx < N) {
                    // 확인하는 판자가 바닥 범위 내일 때 |라면 다음 탐색 실행
                    if (!VISIT[nx][y] && BOARD[nx][y].equals("|")) {
                        dfs(nx, y);
                    }
                }
            }
        }
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();

        VISIT[x][y] = true;

        queue.add(new int[]{x, y});
        while (!queue.isEmpty()) {
            x = queue.peek()[0];
            y = queue.peek()[1];
            queue.poll();

            if (BOARD[x][y].equals("-")) {
                for (int i = 0; i < 2; i++) {
                    // - 모양이라면 좌우를 확인
                    int ny = y + MOVE[i];
                    if (ny >= 0 && ny < M) {
                        // 확인하는 판자가 바닥 범위 내일 때 -라면 다음 탐색 실행
                        if (!VISIT[x][ny] && BOARD[x][ny].equals("-")) {
                            VISIT[x][ny] = true;
                            queue.add(new int[]{x, ny});
                        }
                    }
                }
            } else {
                for (int i = 0; i < 2; i++) {
                    // | 모양이라면 상하를 확인
                    int nx = x + MOVE[i];
                    if (nx >= 0 && nx < N) {
                        // 확인하는 판자가 바닥 범위 내일 때 |라면 다음 탐색 실행
                        if (!VISIT[nx][y] && BOARD[nx][y].equals("|")) {
                            VISIT[nx][y] = true;
                            queue.add(new int[]{nx, y});
                        }
                    }
                }
            }
        }
    }
}
