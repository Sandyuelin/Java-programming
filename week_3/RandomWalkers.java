public class RandomWalkers {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // number of cells, coordinate
        int n = Integer.parseInt(args[1]); // number of people in the city
        int[] steps = new int[n]; // Array to store steps taken by each walker
        int sum = 0;

        for (int t = 0; t < n; t++) {
            boolean[][] a = new boolean[N][N];
            int x = N / 2;
            int y = N / 2;
            int step = 0;

            // Keep moving until all cells are touched
            while (!allCellsTouched(a, N)) {
                a[x][y] = true;
                double r = Math.random();
                if (r < 0.25) x++;
                else if (r < 0.5) x--;
                else if (r < 0.75) y++;
                else y--;
                step++;
            }
            steps[t] = step; // Store steps taken by this walker
            sum += step;
        }

        // Calculate and print statistics
        double averageSteps = (double) sum / n;
        System.out.println("Average number of steps taken: " + averageSteps);
    }

    // Function to check if all cells are touched
    public static boolean allCellsTouched(boolean[][] a, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!a[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
