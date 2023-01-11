package quiz.inflearn.chap_02.no_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            int tmp = i;
            int rev = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                rev = rev * 10 + t;
                tmp = tmp / 10;
            }

            if (isPrime(rev)) {
                answer.add(rev);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        main.solution(n, arr).forEach(i -> System.out.print(i + " "));
    }
}
