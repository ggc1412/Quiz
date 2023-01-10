package quiz.inflearn.chap_01.no_08;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "NO";
        String replaceStr = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reversedStr = new StringBuilder(replaceStr).reverse().toString();

        if(reversedStr.equals(replaceStr)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(main.solution(str));
    }
}
