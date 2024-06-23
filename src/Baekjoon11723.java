package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon11723 {

    public static final Set<Integer> set = new HashSet<>();
    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st;

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            controller(st);
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void controller(StringTokenizer st) throws IOException {
        String command = st.nextToken();
        int x;
        boolean flag;
        switch (command) {
            case "add":
                x = Integer.parseInt(st.nextToken());
                set.add(x);
                break;
            case "remove":
                x = Integer.parseInt(st.nextToken());
                for (int n : set) {
                    if (n == x) {
                        set.remove(n);
                        break;
                    }
                }
                break;
            case "check":
                flag = true;
                x = Integer.parseInt(st.nextToken());
                for (int n : set) {
                    if (n == x) {
                        bw.write("1\n");
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    bw.write("0\n");
                }
                break;
            case "toggle":
                flag = true;
                x = Integer.parseInt(st.nextToken());
                for (int n : set) {
                    if (n == x) {
                        set.remove(x);
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    set.add(x);
                }
                break;
            case "all":
                for (int j = 0; j < 20; j++) {
                    set.add(j + 1);
                }
                break;
            case "empty":
                set.clear();
                break;
        }
    }
}
