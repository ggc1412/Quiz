package quiz.inflearn.chap_01.no_11;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = str.toCharArray();
        int count = 0;
        char b = charArray[0];

        for (char c : charArray) {
            if (b == c) {
                count++;
            } else {
                // 정보 넣기
                answer.append(b);
                if (count > 1) {
                    answer.append(count);
                }
                // 초기화
                b = c;
                count = 1;
            }
        }
        // 정보 넣기
        answer.append(b);
        if (count > 1) {
            answer.append(count);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
