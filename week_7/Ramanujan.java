public class Ramanujan {

    // Return true if n is a Ramanujan number, and false otherwise.
    public static boolean isRamanujan(long n) {
        int limit = (int) Math.cbrt(n) + 1;

        for (int a = 1; a < limit; a++) {
            double t = n - Math.pow(a, 3);
            if (t < 0) continue;

            int b = (int) Math.round(Math.cbrt(t));
            if (Math.pow(b, 3) == t) {
                for (int c = a + 1; c < limit; c++) {
                    double q = n - Math.pow(c, 3);
                    if (q < 0) continue;

                    int d = (int) Math.round(Math.cbrt(q));
                    if (Math.pow(d, 3) == q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Takes a long integer command-line argument n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Ramanujan <number>");
            return;
        }

        long n = Long.parseLong(args[0]);
        boolean result = isRamanujan(n);
        System.out.println(result);
    }
}