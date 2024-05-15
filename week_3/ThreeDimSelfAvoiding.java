
public class ThreeDimSelfAvoiding {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;
        int totalPathlength= 0;
        for (int t = 0; t < trials; t++) {
            boolean[][][] a = new boolean[N][N][N];
            int x = N / 2;
            int y = N / 2;// start in the middle by setting the x y the middle number of the matrix/grid
            int z = N / 2;
            int pathLength = 0;

            while (x > 0 && x < N - 1 && y > 0 && y < N - 1 && z>0 && z< N-1) {
                if (a[x - 1][y][z] && a[x + 1][y][z] && a[x][y - 1][z] && a[x][y + 1][z] && a[x][y][z-1] && a[x][y][z+1]) {
                    deadEnds++;
                    break;// this checks whether the intersection to the left/right/above/below has been visited, shorted as boolean a[x][y] == a [x+-][y+-]
                }
                a[x][y][z] = true;
                double r = Math.random();
                if (r < 1/6.0) {
                    if (!a[x + 1][y][z]) x++;
                } else if (r < 1/3.0) {
                    if (!a[x - 1][y][z]) x--;
                } else if (r < 0.5) {
                    if (!a[x][y + 1][z]) y++;
                } else if (r< 2/3.0) {
                    if (!a[x][y - 1][z]) y--;
                } else if (r< 5/6.0){
                    if (!a[x][y][z+1]) z++;
                }else {
                    if (!a[x][y][z-1]) z--;
                }
                pathLength++;
            }
            totalPathlength += pathLength;// if it's not visited these scenarios, then the particle moves in that direction by updating the coordinate accordingly.
        }
        double average = (double) totalPathlength / trials;
        System.out.println("Average path length: " + average);
        System.out.println(100*deadEnds/trials + "% dead ends");
    }
}