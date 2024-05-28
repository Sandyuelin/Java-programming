public class Fibonacci {
    static long [] memo= new long[100]; // top-down dynamic programming, we store or cache the result of each subproblem
    public static long fibonacci(int n){
        if (n ==0) return 0;
        if (n ==1) return 1;
        if (memo[n] > 0 ) return memo[n];
        memo[n] = fibonacci(n-1) + fibonacci(n-2);
        return memo[n];
    }
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        StdOut.println(fibonacci(n));
    }
}
