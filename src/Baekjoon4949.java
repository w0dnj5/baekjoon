import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            String input = bufferedReader.readLine();
            if (input.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        stack.push(c);
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        stack.push(c);
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty()) {
                bufferedWriter.write("yes\n");
            } else {
                bufferedWriter.write("no\n");
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
