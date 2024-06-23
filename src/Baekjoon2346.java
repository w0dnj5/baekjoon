package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Baekjoon2346 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deque.offer(new int[]{i + 1, Integer.parseInt(st.nextToken())});
        }

        int[] arr = deque.pollFirst();
        System.out.print(1 + " ");
        while (!deque.isEmpty()) {
            if (arr[1] > 0) {
                for (int i = 1; i < arr[1]; i++) {
                    deque.offerLast(deque.pollFirst());
                }
                arr = deque.pollFirst();
            } else {
                for (int i = 1; i < -arr[1]; i++) {
                    deque.offerFirst(deque.pollLast());
                }
                arr = deque.pollLast();
            }
            System.out.print(arr[0] + " ");
        }
    }
}

