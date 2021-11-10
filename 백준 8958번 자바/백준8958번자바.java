import java.io.*;
import java.util.ArrayList;

public class 백준8958번자바 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(br.readLine());
        }

        for (int a = 0; a < n; a++) {
            int count = 0; // O가 연속으로 나온 점수 저장
            int result = 0; // 점수 총 합산

        // List 요소의 길이만큼 반복
        for(int b=0; b< arrayList.get(a).length(); b++) {
            // List 내부 요소에서 b번째에 있는 문자 반환 후 비교
            if(arrayList.get(a).charAt(b) == 'O') {
                // O일 경우 count가 증가
                count++;
            }else {
                // O가 아닐 경우 count값 0으로 초기화
                count = 0;
            }
            // 위의 연산을 통해 나온 모든 count값의 합 = 점수 총 합산
            result += count;
        }
        // 출력값 저장
        bw.write(Integer.toString(result)+"\n");
    }
    // 출력
        bw.flush();
    }
}
