public class PQfunctionsle {
    public static int cube(int i){
        return i*i*i;// compact i = balabala return into one line
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i <= N; i++)
            StdOut.println(i + " " + cube(i));
    }
}
