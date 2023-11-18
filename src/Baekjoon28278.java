import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon28278 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int command = Integer.parseInt(input[0]);
            if (command == 1) {
                stack.push(Integer.parseInt(input[1]));
                continue;
            }
            if (command == 2) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                    continue;
                }
                bw.write(stack.peek() + "\n");
                stack.pop();
                continue;
            }
            if (command == 3) {
                bw.write(stack.size() + "\n");
                continue;
            }
            if (command == 4) {
                if (stack.isEmpty()) {
                    bw.write("1\n");
                    continue;
                }
                bw.write("0\n");
                continue;
            }
            if (command == 5) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                    continue;
                }
                bw.write(stack.peek() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
