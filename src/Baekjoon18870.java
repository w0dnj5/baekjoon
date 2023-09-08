import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        // 입력 받은 배열
        int[] origin = new int[n];
        // 정렬 하려는 배열
        int[] sorted = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 두 배열에 값을 넣어준다.
        for(int i=0;i<n;i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬 하려는 배열을 정렬시켜준다.
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        // 작은 값부터 순서대로 넣어준 후 value에 rank 부여 (key가 없을 때만 입력하므로 중복을 피할 수 있다.)
        int rank = 0;
        for(int k : sorted) {
            if(!map.containsKey(k)) {
                map.put(k, rank);
                rank++;
            }
        }
        // 원본 배열을 키를 통해 해당 값의 rank를 순서대로 불러온다.
        for(int k : origin) {
            bw.write(map.get(k) + " ");
        }
        bw.flush();
        bw.close();
    }
}
