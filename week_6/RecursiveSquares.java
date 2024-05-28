public class RecursiveSquares {

    // plot a square, centered on (x, y) of the given side length
    // with a light gray background and black border
    public static void drawSquare(double x, double y, double size) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, size / 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, size / 2);
    }

    // plot an order n recursive squares pattern
    // centered on (x, y) of the given side length
    public static void draw(int n, double x, double y, double size) {
        if (n == 0) return;

        drawSquare(x, y, size);

        // ratio to determine the size of smaller squares
        double ratio = 2.2;
        double newSize = size / ratio;

        // coordinates for smaller squares
        double halfSize = size / 2;
        draw(n - 1, x - halfSize , y - halfSize, newSize);    // lower left
        draw(n - 1, x - halfSize , y + halfSize, newSize);    // upper left
        draw(n - 1, x + halfSize , y - halfSize, newSize);    // lower right
        draw(n - 1, x + halfSize , y + halfSize, newSize);    // upper right
    }

    // read in an integer command-line argument n and plot an order n recursive
    // squares pattern
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double x = 0.5, y = 0.5;   // center of square
        double size = 0.5;         // side length of square
        draw(n, x, y, size);
    }
}
