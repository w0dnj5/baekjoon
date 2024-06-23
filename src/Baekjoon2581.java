package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Baekjoon2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int cnt;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        // n이상 m이하 사이의 모든 소수가 범위
        for(int i=m;i<=n;i++) {
            cnt = 0;
            for(int j=2;j<=i;j++) {
                if(i%j==0) {
                    cnt++;
                }
            }
            // 소수는 자기 자신 말고는 나누어지지 않으므로 개수가 1일때만 리스트에 추가해준다.
            if(cnt==1) {
                list.add(i);
            }
        }
        // 소수들의 총 합을 구해준다.
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            sum+=(int)itr.next();
        }

        // 소수가 없으면 소수들의 합도 0
        if(sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
