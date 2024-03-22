import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.List;
public class Baekjoon2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = 0;
        int a;
        int b;
        int c;
        int sum;

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for(int i=0;i<n;i++) {
            a = list.get(i);
            for(int j=i+1;j<n;j++) {
                b = list.get(j);
                for(int k=j+1;k<n;k++) {
                    c = list.get(k);
                    sum = a + b + c;
                    if(sum <= m && sum > r) {
                        r = sum;
                    }
                }
            }
        }

        System.out.println(r);
    }
}
