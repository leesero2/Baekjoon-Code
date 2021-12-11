import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준1157번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26]; //알파벳 갯수가 26까지 있으니 26크기의 배열을 생성
        String s = br.readLine(); //버퍼로 입력값을 받음
        for(int i = 0; i<s.length(); i++){ //입력 크기만큼 for문 반복
            if(65 <= s.charAt(i) && s.charAt(i) <= 90){ //아스키코드로 65는 A, 90은 Z이므로 대문자값이 들어온다면
                arr[s.charAt(i) - 65]++; //해당 문자열에 - 65를해서 배열에 저장 ex) arr[B-65]++ = arr[1]++ = arr[1]은 값이 1
            }else{//대문자값이 아니라면 소문자로 받아들임
                arr[s.charAt(i) - 97]++; //arr[c - 97]++ = arr[2]++ = arr[2] = 1
            }
        }


        int max = -1; //최대값을 초기화
        char ch = '?'; //중복되는 값이 있으면 ? 출력 변수
        for(int i = 0; i<26; i++){ //알파벳 갯수만큼 반복
            if(arr[i]>max){
                max = arr[i];
                ch = (char)(i+65); //ch는 char변수니까 char로 형변환을 시켜주고 값을 대입
            }else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}

