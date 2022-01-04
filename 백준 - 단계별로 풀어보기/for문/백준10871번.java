package for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준10871번 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //br에서 입력받은 문자열들을 분리한다

        int N = Integer.parseInt(st.nextToken()); //N과 X는 Tokenizer를 이용해서 값을 입력받는다
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder(); //새로 객체를 생성하지 않고 기존 데이터에 이어쓰기 하는 방식이라 속도도 빠르고, 부하가 적음

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++)
        {
            int value = Integer.parseInt(st.nextToken());
            if(value < X)
            {
                sb.append(value).append(' ');
            }
        }
        System.out.println(sb);
    }
}