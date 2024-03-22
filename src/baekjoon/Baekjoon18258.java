package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon18258 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> queue = new LinkedList<>();
        while (n != 0) {
            String[] input = bufferedReader.readLine().split(" ");
            String command = input[0];
            if (command.equals("push")) {
                int number = Integer.parseInt(input[1]);
                queue.offer(number);
            } else if (command.equals("pop")) {
                if (!queue.isEmpty()) {
                    bufferedWriter.write(queue.poll() + "\n");
                } else {
                    bufferedWriter.write("-1\n");
                }
            } else if (command.equals("size")) {
                bufferedWriter.write(queue.size() + "\n");
            } else if (command.equals("empty")) {
                if (queue.isEmpty()) {
                    bufferedWriter.write("1\n");
                } else {
                    bufferedWriter.write("0\n");
                }
            } else if (command.equals("front")) {
                if (!queue.isEmpty()) {
                    bufferedWriter.write(queue.peekFirst() + "\n");
                } else {
                    bufferedWriter.write("-1\n");
                }
            } else if (command.equals("back")) {
                if (!queue.isEmpty()) {
                    bufferedWriter.write(queue.peekLast() + "\n");
                } else {
                    bufferedWriter.write("-1\n");
                }
            }
            n--;
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
