import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준1065번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));
    }
    public static int arithmetic_sequence(int num){
        int cnt = 0;//한수를 카운팅 하기위한 변수

        if(num < 100){
            return num; //한수가 100자리 미만일땐 어차피 그값이 한수의 갯수라서 return으로 값을 반환
        }
        else{
            cnt = 99; //100이상일때는 어차피 최소 값이 99개라 cnt를 99로 초기화
            if(num == 1000){ //만약 입력값이 1000일경우 어차피 999개라
                num = 999; //입력값을 999로 초기화
            }

            for(int i = 100; i <=num; ++i){ //100~1000자리의 사이라서 int i 를 100으로 초기화
                int hun = i/100; //백의자리
                int ten = (i/10) % 10;//십의 자리
                int one = i % 10;//일의 자리

                if((hun - ten) == (ten - one)){ //각각 빼서 값이 같다면 한수이므로
                    cnt++; //카운트 증감
                }
            }
        }
        return cnt; //카운트값을 반환
    }
}
