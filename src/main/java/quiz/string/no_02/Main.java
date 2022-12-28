package quiz.string.no_02;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (char c : str.toCharArray()) {
            if(Character.isLowerCase(c)) answer.append(Character.toUpperCase(c));
            else answer.append(Character.toLowerCase(c));
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

