package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1260 {

    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        List<List<Integer>> nodes = new ArrayList<>();

        for(int i = 0; i < N + 1; i++) {
            nodes.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n0 = Integer.parseInt(st.nextToken());
            int n1 = Integer.parseInt(st.nextToken());

            nodes.get(n0).add(n1);
            nodes.get(n1).add(n0);
        }

        for(int i = 0; i < N + 1; i++) {
            Collections.sort(nodes.get(i));
        }

        sb = new StringBuilder();
        dfs(nodes, new boolean[N + 1], V);
        System.out.println(sb.toString());

        sb = new StringBuilder();
        bfs(nodes, new boolean[N + 1], V);
        System.out.println(sb.toString());
    }

    public static void dfs(List<List<Integer>> nodes, boolean[] visit, int start) {
        visit[start] = true;
        sb.append(start).append(" ");
        nodes.get(start).forEach( n -> {
            if(!visit[n]) dfs(nodes, visit, n);
        });
    }

    public static void bfs(List<List<Integer>> nodes, boolean[] visit, int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        visit[start] = true;
        sb.append(start).append(" ");
        queue.add(start);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int n = queue.poll();
                nodes.get(n).forEach(m -> {
                    if(!visit[m]) {
                        visit[m] = true;
                        sb.append(m).append(" ");
                        queue.add(m);
                    }
                });
            }
        }
    }
}
