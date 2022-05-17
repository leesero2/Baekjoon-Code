package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준2480번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        int gift;
        int high = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > high){
                high = arr[i];
            }
        }

        if(a == b && b == c) { //3개가 같은경우
            gift = 10000 + (a * 1000);
            System.out.println(gift);
        }else if(a == b){ //2개가 같은경우
            gift = 1000 + (a * 100);
            System.out.println(gift);
        }else if(a == c){ //2개가 같은경우
            gift = 1000 + (a * 100);
            System.out.println(gift);
        }else if(b == c){ //2개가 같은경우
            gift = 1000 + (b * 100);
            System.out.println(gift);
        }else if(a != b && b != c && a != c){ //3개가 다 다를경우
            gift = high;
            System.out.println(gift*100);
        }
    }
}
