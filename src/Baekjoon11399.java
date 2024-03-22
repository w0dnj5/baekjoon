import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] persons = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            persons[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(persons);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                sum += persons[j];
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
        bw.close();
    }
}
