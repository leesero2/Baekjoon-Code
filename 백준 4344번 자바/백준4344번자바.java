import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준4344번자바 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine()); //입력횟수를 입력받음

        for(int i = 0; i<count; i++) { //입력받은 횟수만큼 반복
            float result;
            int sum = 0;
            double a = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int sub = Integer.parseInt(st.nextToken());
            int score[] = new int[sub];


            for(int j =0; j<sub; j++) { //첫 입력한 횟수를 지정
                score[j] = Integer.parseInt(st.nextToken()); // 지정한 과목갯수만큼 입력
                sum += score[j]; //총합에 각 과목 값을 저장
            }

            result = sum / sub; //총 과목합을 과목갯수만큼 나눈걸 result에 저장

            for(int v = 0; v<sub; v++){
                if(score[v] > result){
                    a++;
                }
            }
            double result2 = a / sub;
            System.out.println(String.format("%.3f", result2*100)+"%"); // 출력

        }


        }
    }

