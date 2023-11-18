import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {
            Queue<Character> queue = new LinkedList<>();
            String input = bufferedReader.readLine().trim();
            boolean flag = false;
            if (input.length() % 2 == 0) {
                for (int j = 0; j < input.length(); j++) {
                    char c = input.charAt(j);
                    if (queue.isEmpty() || queue.peek() == c) {
                        queue.add(c);
                    } else if (c == ')' && queue.peek() != c) {
                        queue.remove();
                    }
                }

                if (queue.isEmpty()) {
                    flag = true;
                }
            }

            if (flag) {
                bufferedWriter.write("YES\n");
            } else {
                bufferedWriter.write("NO\n");
            }

        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
