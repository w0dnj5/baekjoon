package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon1068 {

    static int N;
    static ArrayList<Integer>[] TREE;
    static boolean[] VISIT;
    static int DELETE;
    static int COUNT;
    static int ROOT;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        TREE = new ArrayList[N];
        VISIT = new boolean[N];
        COUNT = 0;
        for (int i = 0; i < N; i++) {
            TREE[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int parentNode = Integer.parseInt(st.nextToken());
            // 뿌리가 처음부터 나오지 않을 수도 있다. 그러므로 시작 지점을 -1 나왔을 때로 설정해준다.
            if (parentNode == -1) {
                ROOT = i;
                continue;
                // 설정 후 다시 반복문을 돌린다.
            }
            // 부모노드와 인접한 자식 노드를 추가해준다.
            TREE[parentNode].add(i);
        }

        DELETE = Integer.parseInt(br.readLine());
        // 뿌리 노드가 삭제되는 경우에는 탐색 할 필요가 없으므로 예외 처리를 해줘야한다.
        if (DELETE != ROOT) {
            dfs(ROOT);
        }
        // 탐색 후 결과 출력
        System.out.println(COUNT);
    }

    public static void dfs(int x) {
        VISIT[x] = true;
        boolean flag = true;
        // 만약 자식 노드가 없다면 반복문 내부를 실행하지 않고 넘어간다.
        for (int n : TREE[x]) {
            // 삭제할 부모 노드 아래로는 모두 삭제되기 때문에 탐색 할 필요가 없어진다.
            if (n != DELETE && !VISIT[n]) {
                dfs(n);
                // 모든 깊은 탐색이 끝난 후에 부모노드로 돌아오면 그 노드는 리프 노드가 아니므로 false로 변경
                flag = false;
            }
        }
        // true는 리프 노드라는 뜻이 되므로 갯수를 하나 증가 시킨다.
        if (flag) {
            COUNT++;
        }
    }
}
