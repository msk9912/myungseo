package year2023.month0708.day0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bj_6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(br.readLine());
        }

        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
                count++;
                //System.out.println(arr[i]+" "+arr[j]);
            }

        }

        System.out.println(count);
    }
}
