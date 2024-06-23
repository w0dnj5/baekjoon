package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Baekjoon1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set0 = new TreeSet<>();
        Set<String> set1 = new TreeSet<>();
        for(int i=0;i<n;i++) {
            set0.add(br.readLine());
        }

        for(int i=0;i<m;i++) {
            set1.add(br.readLine());
        }

        set0.retainAll(set1);
        bw.write(set0.size() + "\n");
        Iterator<String> it = set0.iterator();
        while(it.hasNext()) {
            bw.write(it.next() + "\n");
        }
        bw.flush();
        bw.close();
    }
}
