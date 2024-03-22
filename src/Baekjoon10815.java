import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
public class Baekjoon10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 값을 입력 받아서 상근이가 가지고 있는 카드 숫자를 key로 value를 1로 지정해준다.
        for(int i=0;i<n;i++) {
            int x = Integer.parseInt(st.nextToken());
            map.put(x, 1);
        }
        // 배열에 확인할 값을 넣어준다.
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine()," ");

        for(int i=0;i<m;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 키 유무를 체크 한 뒤 있으면 value를, 없으면 0을 출력한다.
        for(int i=0;i<m;i++) {
            int x = arr[i];
            if(map.containsKey(x)) {
                bw.write(map.get(x) + " ");
            } else {
                bw.write(0 + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}