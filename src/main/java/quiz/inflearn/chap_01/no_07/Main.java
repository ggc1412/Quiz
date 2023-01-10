package quiz.inflearn.chap_01.no_07;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "NO";
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reversedStr)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(main.solution(input));
    }
}
