package for문;

import java.io.*;
import java.util.StringTokenizer;

public class 자바15552번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i<a; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
