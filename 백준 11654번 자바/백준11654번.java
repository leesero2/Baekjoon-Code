import java.io.IOException;

public class 백준11654번 {
    public static void main(String[] args) throws IOException {
        int a = System.in.read();//System.in은 byte값으로 문자 한개를 읽으면서 그에 해당하는 아스키코드 값을 저장함.
        //주의할점은 꼭 예외처리를 해야함. 버퍼이기 때문.
        System.out.println(a);
    }
}
//System.in.read는 자바에서 입력을 담당
//System.out.print는 자바에서 출력을 담당