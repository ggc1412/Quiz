package quiz.inflearn.chap_01.no_05;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (!Character.isAlphabetic(charArray[start]))  start++;
            else if(!Character.isAlphabetic(charArray[end])) end--;
            else {
                char temp = charArray[end];
                charArray[end] = charArray[start];
                charArray[start] = temp;
                start++;
                end--;
            }
        }
        answer = String.valueOf(charArray);
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(main.solution(input));
    }
}
