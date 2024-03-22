import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list;
        int n = Integer.parseInt(br.readLine());
        int x;
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // n 개의 수만큼 반복문을 돌린다.
        while(n!=0) {
            list = new ArrayList<>();
            x = Integer.parseInt(st.nextToken());

            // 나누어 떨어지는 i만 list에 추가한다.
            for(int i=2;i<=x;i++) {
                if(x%i==0) {
                    list.add(i);
                }
            }
            // 소수는 1을 제외한 자기 자신 말고는 나눌 수 없으므로 배열의 길이가 1이여야 한다.
            if(list.size()==1) {
                cnt++;
            }
            n--;
        }
        System.out.println(cnt);
    }
}
