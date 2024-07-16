package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon11724 {

    public static int RESULT = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] nodes = new ArrayList[N + 1];
        boolean[] visit = new boolean[N + 1];
        for(int i = 1; i < N + 1; i++) {
            nodes[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int node0 = Integer.parseInt(st.nextToken());
            int node1 = Integer.parseInt(st.nextToken());

            nodes[node0].add(node1);
            nodes[node1].add(node0);
        }

        for(int i = 1; i < N + 1; i++) {
            if(!visit[i]) {
                dfs(nodes, visit, i);
                RESULT++;
            }
        }

        System.out.println(RESULT);
    }

    public static void dfs(ArrayList<Integer>[] nodes, boolean[] visit, int startNode) {
        visit[startNode] = true;
        for(int i = 0; i < nodes[startNode].size(); i++) {
            if(!visit[nodes[startNode].get(i)]) {
                dfs(nodes, visit, nodes[startNode].get(i));
            }
        }
    }
}
