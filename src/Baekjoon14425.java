import java.io.*;
import java.util.*;

public class Baekjoon14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        String tmp;
        // HashSet이면 시간초과가 뜬다. (TreeSet은 뻔하겠죠?)
        // LinkedHashSet에 집합에 포함되있는 문자열을 넣어준다.
        Set<String> set = new LinkedHashSet<>();
        for(int i=0;i<n;i++) {
            set.add(br.readLine());
        }
        // 검사 대상을 배열안에 넣어준다.
        String[] arr = new String[m];
        for(int i=0;i<m;i++) {
            arr[i] = br.readLine();
        }
        // 배열에서 한 개씩 꺼내서 검사를 진행해준다.
        Iterator<String> it;
        for(int i=0;i<m;i++) {
            it = set.iterator();
            tmp = arr[i];
            while(it.hasNext()) {
                if(tmp.equals(it.next())) { // 포함하고 있다면 1 증가시켜준다.
                    cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
