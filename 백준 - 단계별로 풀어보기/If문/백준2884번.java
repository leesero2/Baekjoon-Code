package If문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준2884번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if(M-45<0){
            if(H>0){
                H = H - 1;
                M = M + 15;
            }else if(H==0){
                H = 23;
                M = M + 15;
            }
        }
        System.out.println(H +" "+ M);
    }
}
//결과는 잘 나오는데 왜 안된다고 하는지 모르겠다.