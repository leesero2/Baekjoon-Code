package while문;

import java.io.*;
import java.util.StringTokenizer;

public class 백준10952번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+b;

            if(sum != 0){
                bw.write(sum+"\n");
            }else{
                bw.flush();
                bw.close();
                break;
            }

        }

    }
}
