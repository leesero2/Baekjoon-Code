import java.io.*;

public class 백준3052번자바 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[42]; //42로 나눴을 때 나머지는 42보다 작을 수 밖에 없으므로 0~41까지 배열을 할당하고 나머지가 발생하면 해당 자리 숫자에 카운트

        for(int i=0; i<arr.length; i++) { // 배열 0으로 초기화
            arr[i]=0;
        }

        for(int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());

            int remainder = num%42; // 42로 나눴을때 나머지를 받는 변수
            arr[remainder]++; //나머지가 발생하여 해당 자리 1증가
        }
        int count = 0;
        for(int i=0; i<arr.length; i++) { // 서로 다른 나머지 값을 카운팅
            if(arr[i]!=0) {
                count++;
            }
        }
        bw.write(count + "\n"); // 출력
        bw.flush();
    }
}
