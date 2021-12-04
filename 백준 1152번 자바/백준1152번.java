import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준1152번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        System.out.println(st.countTokens());
        //countTokens()는 현재 가져올 수 있는 토큰 수를 말함.
        //nextToken()를 호출한 후에는 1씩 감소가 됨.
    }
}
