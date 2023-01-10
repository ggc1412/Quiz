package quiz.inflearn.chap_01.no_10;

import java.util.Scanner;

public class Main {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        char[] charArray = str.toCharArray();
        int count = 1000;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                count = 0;
                answer[i] = count;
            } else {
                count++;
                answer[i] = count;
            }
        }

        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == c) {
                count = 0;
            } else {
                count++;
                answer[i] = Math.min(answer[i], count);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for (int i : main.solution(str, c)) {
            System.out.print(i + " ");
        }
    }
}
