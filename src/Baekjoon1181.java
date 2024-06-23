package src;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i=0;i<n;i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    for(int i=0;i<o1.length();i++) {
                        if(o1.charAt(i)!=o2.charAt(i)) {
                            return o1.charAt(i) - o2.charAt(i);
                        }
                    }
                    return 0;
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });

        bw.write(arr[0] + "\n");
        for(int i=0;i<n-1;i++) {
            if(!arr[i].equals(arr[i+1])) {
                bw.write(arr[i+1] + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
