public class Inversions {

    // Return the number of inversions in the permutation a[].
    public static long count(int[] a){
        long inversions = 0;
        for (int i = 0; i<a.length;i++){
            for (int j = i+1; j< a.length;j++){
                if (a[i]> a[j])inversions++;
            }
        }
        return inversions;
    }
    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        int[] permutation = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (k >= right - left) {
                // Place the current element at the leftmost available position
                permutation[left] = i;
                k -= (right - left);
                left++;
            } else {
                // Place the current element at the position to create exactly k inversions
                permutation[(int)(right - k)] = i;
                break;
            }
        }

        // Fill in the remaining elements in the natural order
        for (int i = left; i <= right; i++) {
            permutation[i] = i - left;
        }

        return permutation;
    }

    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);

        int[] permutation = generate(n, k);

        for (int i = 0; i < permutation.length; i++) {
            System.out.print(permutation[i]);
            if (i < permutation.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}