package year2023.month0910.day1012.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//괄호
public class Bj_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;
        String[] subtraction = br.readLine().split("-");

        for(int i = 0; i < subtraction.length; i++) {
            int temp = 0;

            String[] addition = subtraction[i].split("\\+");

            for(int j = 0; j < addition.length; j++) {
                temp += Integer.parseInt(addition[j]);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
