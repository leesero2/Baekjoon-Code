package 백준문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준1315번 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//전역변수로 선언 (check함수에서도 사용하기위함)
    public static void main(String[] args) throws IOException {

        int count = 0;
        int A = Integer.parseInt(br.readLine());//입력 횟수를 지정할 변수 및 입력
        for(int i = 0; i<A; ++i){ //입력받은 정수만큼 for문을 반복
            if(check()){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check() throws IOException{ //그룹단어를 체크할 함수를 생성
        boolean[] check = new boolean[26]; //배열의 크기는 알파뱃갯수의의26개만큼 선언
        int pre = 0; //반복문에서 문자를 꺼내올때 앞선 문자와 연속되는지 아닌지를 구문하기 위한 변수
        String str = br.readLine();//문자열 입력받기 위한 함수


        for(int i = 0; i<str.length(); ++i){ //입력만든 문자열 크기만큼 for문을 반복
            int now = str.charAt(i); //지금 단어가 str.charAt(i)번째로 지정

            if(pre != now){ //pre의 문자와 해당 문자가 다르다면
                if(!check[now - 'a']){ //해당문자가 중복된 문자인지 여부를 검사
                    check[now - 'a'] = true;
                    pre = now;
                }else{ //문자가 같다면 리턴값을 false로 반환
                    return false;
                }
            }
        }

     return true;
    }
}
