package quiz.inflearn.chap_02.no_05;

import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int cnt = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                cnt++;
                for (int j = i; j <= n; j = j + i) {
                    arr[j] = 1;
                }
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(main.solution(n));
    }
}
