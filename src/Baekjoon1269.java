import java.io.*;
import java.util.Set;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baekjoon1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Set<Integer> set1 = new HashSet<>();
        for(int i=0;i<a;i++) {
            set1.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<b;i++) {
            set2.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> set3 = new HashSet<>(set1);
        set3.removeAll(set2);

        Set<Integer> set4 = new HashSet<>(set2);
        set4.removeAll(set1);

        bw.write(String.valueOf(set3.size() + set4.size()));
        bw.flush();
        bw.close();
    }
}
