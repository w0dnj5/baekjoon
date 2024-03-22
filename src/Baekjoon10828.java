import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon10828 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            switch (command) {
                case "push":
                    stack.push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    if (!stack.isEmpty()) {
                        bw.write(stack.pop() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case "top":
                    if (!stack.isEmpty()) {
                        bw.write(stack.peek() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
