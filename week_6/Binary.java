public class Binary {
    public static String convert(int N){
        if (N==1) return "1";// base case
        return convert(N/2)+(N%2); // make sure it can have convergence guarantee
    }
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        System.out.println(convert(N));
    }
}
// example of recursion
