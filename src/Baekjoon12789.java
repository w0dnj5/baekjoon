package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon12789 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> firstLine = new Stack<>();
        Stack<Integer> secondLine = new Stack<>();

        int n = Integer.parseInt(bufferedReader.readLine());
        String[] arr = bufferedReader.readLine().split(" ");
        for (int i = n - 1; i > -1; i--) {
            firstLine.push(Integer.parseInt(arr[i]));
        }

        int count = 1;

        while (!firstLine.isEmpty()) {
            if (firstLine.peek() != count) {
                if (!secondLine.isEmpty() && secondLine.peek() == count) {
                    secondLine.pop();
                    count++;
                    continue;
                }
                secondLine.push(firstLine.pop());
                continue;
            }
            firstLine.pop();
            count++;
        }

        while (!secondLine.isEmpty()) {
            if (secondLine.peek() != count) {
                break;
            }
            secondLine.pop();
            count++;
        }

        if (secondLine.isEmpty()) {
            bufferedWriter.write("Nice\n");
        } else {
            bufferedWriter.write("Sad\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
