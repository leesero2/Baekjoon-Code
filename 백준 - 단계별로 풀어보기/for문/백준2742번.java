package for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2742번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i<a; i++){
            System.out.println(a-i);
        }
    }
}
