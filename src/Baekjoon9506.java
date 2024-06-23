package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baekjoon9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list;
        boolean flag = true;
        int n;
        int sum;
        int size;

        while(flag) {
            n = Integer.parseInt(br.readLine());
            // 마지막 -1가 들어오면 반복문을 종료시켜준다.
            if(n==-1) {
                flag = false;
            }
            else {
                // sum값과 약수들을 담는 list들을 새로운 케이스가 들어올 떄마다 초기화 시켜준다.
                sum = 0;
                list = new ArrayList<>();
                // 약수들을 구해준다.
                for(int i=1;i*i<=n;i++) {
                    if(n%i==0) {
                        list.add(i);
                        if(i*i!=n) {
                            list.add(n / i);
                        }
                    }
                }
                // 구한 약수들 정렬
                Collections.sort(list);
                size = list.size();
                // 약수의 마지막 수인 n을 제외한 값들을 모두 더해준다.
                for(int i=0;i<size-1;i++) {
                    sum = sum + list.get(i);
                }
                // 완전수이면 n = 약수 + 약수 + ... 양식으로 출력
                if(sum == n) {
                    System.out.print(n + " = ");
                    for(int i=0;i<size-1;i++) {
                        System.out.print(list.get(i));
                        if(i < size-2) {
                            System.out.print(" + ");
                        }
                    }
                    System.out.println();
                }
                // 완전수가 아니면 n is NOT perfect. 출력
                else {
                    System.out.println(n + " is NOT perfect.");
                }
            }
        }
    }
}
