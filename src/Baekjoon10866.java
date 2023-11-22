import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Baekjoon10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        int number;
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            switch (command) {
                case "push_front":
                    number = Integer.parseInt(input[1]);
                    deque.offerFirst(number);
                    break;
                case "push_back":
                    number = Integer.parseInt(input[1]);
                    deque.offerLast(number);
                    break;
                case "pop_front":
                    bw.write((!deque.isEmpty() ? deque.pollFirst() : -1) + "\n");
                    break;
                case "pop_back":
                    bw.write((!deque.isEmpty() ? deque.pollLast() : -1) + "\n");
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    bw.write((deque.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "front":
                    bw.write((!deque.isEmpty() ? deque.peekFirst() : -1) + "\n");
                    break;
                case "back":
                    bw.write((!deque.isEmpty() ? deque.peekLast() : -1) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
