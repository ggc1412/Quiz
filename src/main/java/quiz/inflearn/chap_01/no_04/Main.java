package quiz.inflearn.chap_01.no_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int count, String[] strArray) {
        ArrayList<String> answer = new ArrayList<>();
        for (String str : strArray) {
            String tmp = new StringBuilder(str).reverse().toString();
            answer.add(str);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] strArray = new String[count];
        for (int i = 0; i < count; i++) {
            strArray[i] = sc.next();
        }

        for (String x : main.solution(count, strArray)) {
            System.out.println(x);
        }
    }
}
