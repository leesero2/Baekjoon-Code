public class 백준15596번 {
    public static long sum(int[] a){
        int all = 0;
        for(int i = 0; i<a.length; i++){
            all += a[i];
        }
        return all;
    }

    public static void main(String[] args) {
        int[] a = {};
        long all = sum(a);
        System.out.println(all);
    }
}
