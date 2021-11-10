import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준1546번자바 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine()); //과목 숫자를 카운트 변수로 저장
        float[] score = new float[count]; //과목 점수를 배열로 저장
        float best = 0; //최고값 변수를 선언후 초기화
        float sum = 0; //총합 값을 저장
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i<count; i++){
            score[i] = Integer.parseInt(st.nextToken());//입력받은 횟수만큼 점수를 버퍼에 저장
            if(score[i] >= best){
                best = score[i]; //최고의 점수를 best 변수에 저장
            }
        }

        for(int j = 0; j<count; j++){
            sum += score[j] / best * 100;
        }
        System.out.println(sum/count);

    }
}
