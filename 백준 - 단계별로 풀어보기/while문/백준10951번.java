package while문;

import java.io.*;
import java.util.*;

public class 백준10951번 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        int a = 0;
        int b = 0;
        while((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a+b));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
