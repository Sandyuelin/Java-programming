package week_2;

public class BoysGirls {
    public static void main(String[]args) {
        int sum = 0;
        int trials = 100000;
        for (int i = 1; i < trials; i++) {
            int childrenCount = 0;
            while (true) {
                childrenCount++;
                int k = (int) (2 * Math.random());
                if (k == 0)
                    continue;
                else
                    break;
            }
            sum += childrenCount;

        }
        double averageChildren = (double) sum /trials;
        System.out.println(averageChildren);
    }
}
