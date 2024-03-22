package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int length = Integer.parseInt(input[0]);
            int index = Integer.parseInt(input[1]);

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Queue<int[]> queue = new ArrayDeque<>();
            int[] find = null;
            for (int j = 0; j < length; j++) {
                int[] number = new int[]{Integer.parseInt(st.nextToken()), j};
                if (j == index) {
                    find = number;
                }
                queue.offer(number);
            }
            List<int[]> result = new ArrayList<>();
            while (!queue.isEmpty()) {
                int[] tmp = queue.poll();
                boolean flag = true;
                for (int[] arr : queue) {
                    if (tmp[0] < arr[0]) {
                        flag = false;
                        queue.offer(tmp);
                        break;
                    }
                }
                if (flag) {
                    result.add(tmp);
                }
            }

            for (int j = 0; j < length; j++) {
                int[] tmp = result.get(j);
                if (tmp[0] == find[0] && tmp[1] == find[1]) {
                    bw.write(j + 1 + "\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
