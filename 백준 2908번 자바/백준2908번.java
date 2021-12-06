package 백준문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준2908번 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //StringBuilder은 문자열을 바꿔주는 reverse() 함수를 내장함. 정수형으로 받았지만 StringBuilder를 써야하기때문에 String.valueof로 형을 변환시킴.
        int a = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));
        int b = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));

        System.out.print(a > b ? a:b); //비교휴 값을 선정

    }
}
