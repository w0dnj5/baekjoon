import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Baekjoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();
        int number = 0;
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            switch (command) {
                case "push":
                    number = Integer.parseInt(input[1]);
                    queue.offer(number);
                    break;
                case "pop":
                    bw.write((!queue.isEmpty() ? queue.poll() : -1) + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write((queue.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "front":
                    bw.write((!queue.isEmpty() ? queue.peek() : -1) + "\n");
                    break;
                case "back":
                    bw.write((!queue.isEmpty() ? number : -1) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
