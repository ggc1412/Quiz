package quiz.inflearn.chap_01.no_09;

import java.util.Scanner;

public class Main {
    public int solution(String str) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                answer.append(c);
            }
        }

        return Integer.parseInt(answer.toString());
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
