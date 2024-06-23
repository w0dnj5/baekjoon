package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        // split() 메소드로 배열로 만들어준다.
        String[] arr = br.readLine().split(" ");
        int x = Integer.parseInt(arr[0]);
        //최소값: 배열에 i번째 값이 x 보다 작으면 x에 i번째 값을 대입.
        for(int i=1;i<n;i++) {
            int y = Integer.parseInt(arr[i]);
            if(x > y) {
                x = y;
            }
        }
        sb.append(x);

        // 다시 배열의 첫 번째 값으로 초기화
        x = Integer.parseInt(arr[0]);

        //최대값: 배열에 i번째 값이 x 보다 크면 x에 i번째 값을 대입.
        for(int i=1;i<n;i++) {
            int y = Integer.parseInt(arr[i]);
            if(x < y) {
                x = y;
            }
        }
        sb.append(" ");
        sb.append(x);

        System.out.println(sb.toString());

        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        String z;

        for(int i=0;i<n-1;i++) {
            for(int j=i;j<n;j++) {
                if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[j])) {
                    z = arr[i];
                    arr[i] = arr[j];
                    arr[j] = z;
                }
            }
        }
        System.out.println(arr[0] + " " +  arr[n-1]);
        */
    }
}

// 정렬 알고리즘으로 풀어봤다... (정렬하면 최소값이 맨 앞 최댓값이 맨 뒤로 오니깐...)
// 하지만 이렇게 풀면 시간 초과가 뜬다...
