package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준2525번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int h = Integer.parseInt(st.nextToken()); //시간 버퍼
        int m = Integer.parseInt(st.nextToken()); //분 버퍼
        int cookT = Integer.parseInt(br.readLine()); //요리시간
        int ph = 0;
        int pm = 0;

        if(cookT+m>=1){
            ph = (cookT+m)/60; //시간
            pm = (cookT+m)%60; //분
        }

        if((h+ph)>23){
            System.out.println((h+ph-24)+" "+ pm);
        }else if((h+ph)<=23){
            System.out.println((h+ph)+" "+ pm);
        }
    }
}
