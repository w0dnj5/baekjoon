package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {
            Stack<Character> stack = new Stack<>();
            String input = bufferedReader.readLine().trim();
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                if (c == '(') {
                    stack.add(c);
                } else if (stack.isEmpty()) {
                    stack.add(c);
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                bufferedWriter.write("YES\n");
            } else {
                bufferedWriter.write("NO\n");
            }

        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
