public class RandomWalkers {
    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);
        int trails = Integer.parseInt(args[1]);
        int sum = 0;
        double average = 0;

        for (int i= 1; i<= trails; i++) {
            int steps = 0;
            int x = 0;
            int y = 0;
            while (Math.abs(x) + Math.abs(y) != r) {
                double direction = Math.random();
                if (direction > 0 && direction < 0.25) {
                    y++;
                } else if (direction > 0.25 && direction < 0.5) {
                    x++;
                } else if (direction > 0.5 && direction < 0.75) {
                    y--;
                } else {
                    x--;
                }
                steps++;
            }
            average += steps; // inside the for loop, outside the while

        }
        average /= trails ;
        System.out.println("average number of steps" + " = "+ average);

    }

}
