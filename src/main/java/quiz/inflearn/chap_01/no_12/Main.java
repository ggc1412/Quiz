package quiz.inflearn.chap_01.no_12;

import java.util.Scanner;

public class Main {
    public String solution(int count, String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String s = str.substring(i * 7, (i + 1) * 7).replace('#', '1').replace('*', '0');
            char c = (char) Integer.parseInt(s, 2);
            answer.append(c);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String str = sc.next();

        System.out.println(main.solution(count, str));
    }
}
