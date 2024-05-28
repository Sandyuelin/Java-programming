public class TrinomialDP {
    public static long trinomial(int n, int k) {
        // Handle negative k by symmetry: T(n, k) = T(n, -k)
        if (k < 0) k = -k;

        // Create the DP table with sufficient size
        long[][] t = new long[n + 1][2 * n + 1];

        // Initialize the base case
        t[0][n] = 1;

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = -i; j <= i; j++) {
                int index = n + j; // shift index to avoid negative array indices
                t[i][index] = (j - 1 >= -i + 1 ? t[i - 1][n + (j - 1)] : 0) +
                        t[i - 1][n + j] +
                        (j + 1 <= i - 1 ? t[i - 1][n + (j + 1)] : 0);
            }
        }

        // Return the result
        return t[n][n + k];
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(trinomial(n, k));
    }
}
