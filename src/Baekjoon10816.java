package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x;

        for(int i=0;i<n;i++) {
            x = Integer.parseInt(st.nextToken());
            // map 안에 x라는 키가 없다면 value 1을 가진 key x를 넣어준다. (개수가 1개라는 뜻)
            if(!map.containsKey(x)) {
                map.put(x, 1);
            }
            else { // 이미 map 안에 x 키가 있다면 x 키의 value 개수 한 개를 늘려준다.
                map.put(x, map.get(x)+1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int y;

        for(int i=0;i<m;i++) {
            y = Integer.parseInt(st.nextToken());
            if(!map.containsKey(y)) { // 맵 안에 키가 없다면 0을 출력
                bw.write("0");
            }
            else { // 있다면 개수를 출력
                bw.write(String.valueOf(map.get(y)));
            }
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}

// map의 key가 숫자 종류이고 value가 개수로 생각하면 된다.
