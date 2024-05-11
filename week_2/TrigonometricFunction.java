package week_2;

public class TrigonometricFunction {
    public static void main (String[] args) {
        double x = Double.parseDouble (args[0]);
        x = x % (2 * Math.PI);
        double t = 1;
        double sum = 0;
        for (int i = 1; t!= 0.0; i++){
            t *= (x/i);// t *= means t = t*(x/i)
            if (i % 4 == 1) sum += t; // sum += means sum = sum + t
            if (i % 4 == 3) sum -= t;

        }
        System.out.println(sum);

    }
}
