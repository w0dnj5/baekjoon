package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon5430 {

    public static boolean FLAG;
    public static boolean ERROR;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            FLAG = false;
            ERROR = false;
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");

            Deque<Integer> numbers = new ArrayDeque<>();
            while(st.hasMoreTokens()) {
                numbers.offer(Integer.parseInt(st.nextToken()));
            }

            for(int k = 0; k < p.length(); k++) {
                switch (p.charAt(k)) {
                    case 'R' :
                        R();
                        break;
                    case 'D' :
                        D(numbers);
                        break;
                }
            }

            System.out.println(ERROR ? "error" : getResult(numbers));
        }
    }

    public static void R() {
        FLAG = !FLAG;
    }

    public static void D(Deque<Integer> numbers) {
        if(numbers.isEmpty()) {
            ERROR = true;
            return;
        }
        if(FLAG) {
            numbers.pollLast();
            return;
        }
        numbers.pollFirst();
    }

    public static String getResult(Deque<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        while(!numbers.isEmpty()) {
            result.add(FLAG ? numbers.pollLast() : numbers.pollFirst());
        }
        return result.toString().replaceAll(" ", "");
    }
}