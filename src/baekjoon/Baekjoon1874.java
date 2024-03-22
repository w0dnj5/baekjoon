package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        for (int i = n; i >= 1; i--) {
            stack1.push(i);
        }

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            while (flag) {
                if (!stack2.isEmpty() && stack2.peek() == number) {
                    stack3.push(stack2.pop());
                    sb.append("-\n");
                    break;
                }
                if (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                    sb.append("+\n");
                } else {
                    flag = false;
                    bw.write("NO");
                }
            }
        }

        if (flag) {
            bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }
}
