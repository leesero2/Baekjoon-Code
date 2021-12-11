import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 백준3052번자바2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set set = new HashSet();

        for(int i = 0; i<10; ++i){
            set.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.print(set.size());
    }
}
