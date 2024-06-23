package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Person person = new Person(st.nextToken(), st.nextToken());
            persons.add(person);
        }

        for (int i = 0; i < n; i++) {
            Person person = persons.get(i);
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (person == persons.get(j)) {
                    continue;
                }
                if (person.compareTo(persons.get(j)) < 0) {
                    rank++;
                }
            }
            person.setRank(rank);
        }

        for (Person person : persons) {
            bw.write(person.getRank() + " ");
        }
        bw.flush();
        bw.close();
    }

    static class Person implements Comparable<Person> {

        private int weight;
        private int height;
        private int rank;

        Person(String weight, String height) {
            this.weight = Integer.parseInt(weight);
            this.height = Integer.parseInt(height);
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        @Override
        public int compareTo(Person o) {
            if (this.weight - o.weight > 0 && this.height - o.height > 0) {
                return 1;
            }
            if (this.weight - o.weight < 0 && this.height - o.height < 0) {
                return -1;
            }
            return 0;
        }
    }
}
