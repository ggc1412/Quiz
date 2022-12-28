package quiz.string.no_01;

import java.util.Scanner;

public class Main {
    public int solution(String str, char t) {
        int answer = 0;

        String upperCaseStr = str.toUpperCase();
        char upperCaseT = Character.toUpperCase(t);

        char[] chars = upperCaseStr.toCharArray();
        for (char c : chars) {
            if (c == upperCaseT) {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(main.solution(str, c));
    }
}
