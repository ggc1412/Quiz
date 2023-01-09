package quiz.inflearn.chap_01.no_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer="";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for(String x : s){
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(main.solution(str));
    }
}
