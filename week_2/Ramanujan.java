package week_2;

public class Ramanujan {
    public static void main(String[] args){
        long i = Long.parseLong(args[0]);
        for (int a = 0;a < i; a++){
            double t = i - Math.pow(a, 3);
            int b = (int)Math.pow(t,1.0/3.0);
            for ( double m = b ;Math.pow(m,3) == t;) {
                for (int c = a+1; c < i;c++){
                    double q = i -Math.pow(c,3);
                    int d = (int)Math.pow(q, 1.0/3.0);
                    for (double n = d ;Math.pow(n,3)== q;) {
                        System.out.println(a + b + c + d);
                    }

                }
            }

        }
    }
}
