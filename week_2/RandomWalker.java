public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        System.out.println("(" + x + ", " + y + ")");

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
            System.out.println("(" + x + ", " + y + ")");

        }
        System.out.println("steps" + "= " + steps);

    }
}
