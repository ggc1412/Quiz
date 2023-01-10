package quiz.inflearn.chap_01.no_06;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if (str.indexOf(str.charAt(i)) == i) {
                answer.append(str.charAt(i));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(main.solution(input));
    }
}
