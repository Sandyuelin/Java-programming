public class BouncingBall {
    public static void main(String[] args) {
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();
        // the graphics are drawn to an off-screen buffer first
        // after StdDraw.show(), the content of offscreen buffer is displayed on the screen
        double rx = 0.480, ry = 0.860; // position
        double vx = 0.015, vy = 0.023; // velocity
        double radius = 0.05;

        while (true) {
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;
            // the loop continuously updates the position of teh ball absed on its velocity within each iteration of the loop
            rx = rx + vx;
            ry = ry + vy;
            StdDraw.clear(StdDraw.LIGHT_GRAY);

            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);

            // copy offscreen buffer to onscreen
            StdDraw.show();

            // pause for 20 ms
            StdDraw.pause(20);
        }
    }
}
