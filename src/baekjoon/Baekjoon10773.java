package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Long> stack = new Stack<>();
        int k = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            if (n == 0) {
                stack.pop();
                continue;
            }
            stack.push((long) n);
        }

        bufferedWriter.write(stack.stream().mapToLong(value -> value).sum() + "\n");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
