// start in the middle
// move to a random neighboring intersection and do not revist any intersection
// application: model the behavior of solvents and polymers溶剂和聚合物, magnetic materials.
public class SelfAvoiding {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;
        for (int t = 0; t < trials; t++) {
            boolean[][] a = new boolean[N][N];
            int x = N / 2;
            int y = N / 2;// start in the middle by setting the x y the middle number of the matrix/grid

            while (x > 0 && x < N + 1 && y > 0 && y < N - 1) {
                if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) {
                    deadEnds++;
                    break;// this checks whether the intersection to the left/right/above/below has been visited, shorted as boolean a[x][y] == a [x+-][y+-]
                }
                a[x][y] = true;
                double r = Math.random();
                if (r < 0.25) {
                    if (!a[x + 1][y]) x++;
                } else if (r < 0.5) {
                    if (!a[x - 1][y]) x--;
                } else if (r < 0.75) {
                    if (!a[x][y + 1]) y++;
                } else {
                    if (!a[x][y - 1]) y--;
                }
            }// if it's not visited these scenarios, then the particle moves in that direction by updating the coordinate accordingly.
        }
        System.out.println(100*deadEnds/trials + "% dead ends");
    }
}