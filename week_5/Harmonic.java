public class Harmonic {
    public static double harmonic(int n){ // signature gives a name to the method and to each parameter variable
        double sum = 0.0;
        for (int i = 1; i<= n; i++)
            sum += 1.0/i;
        return sum;
    }// curly braces
    public static void main(String[] args){
        for (int i = 0; i< args.length; i++){
            int arg = Integer.parseInt(args[i]);
            double value = harmonic(arg);// function call, a method call is an expression
            StdOut.println(value);
        }
    }
}
