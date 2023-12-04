import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Baekjoon2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);
        // 평균
        long sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        int average = Math.round((float) sum / n);
        bw.write(average + "\n");
        // 중간값
        bw.write(numbers[(n - 1) / 2] + "\n");
        // 최빈값
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : numbers) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        int count = -1;
        for (int i : map.keySet()) {
            if (map.get(i) > count) {
                count = map.get(i);
                list.clear();
                list.add(i);
            } else if (map.get(i) == count) {
                list.add(i);
            }
        }
        Collections.sort(list);

        if (list.size() < 2) {
            bw.write(list.get(0) + "\n");
        } else {
            bw.write(list.get(1) + "\n");
        }
        // 범위
        bw.write(numbers[n - 1] - numbers[0] + "\n");
        bw.flush();
        bw.close();
    }
}
