public class ColorHSB {
    private final int hue;
    private final int saturation;
    private final int brightness;

    // Creates a color with hue h, saturation s, and brightness b.
    public ColorHSB(int h, int s, int b) {
        if (h < 0 || h > 359 || s < 0 || s > 100 || b < 0 || b > 100) {
            throw new IllegalArgumentException("Hue must be between 0 and 359, and saturation and brightness must be between 0 and 100.");
        }
        hue = h;
        saturation = s;
        brightness = b;
    }

    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {
        return "(" + hue + ", " + saturation + ", " + brightness + ")";
    }

    // Is this color a shade of gray?
    public boolean isGrayscale() {
        return (saturation == 0 || brightness == 0);
    }

    // Returns the squared distance between the two colors.
    public int distanceSquaredTo(ColorHSB that) {
        if (that == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }

        int hueDiff = Math.min((hue - that.hue) * (hue - that.hue), (360 - Math.abs(hue - that.hue)) * (360 - Math.abs(hue - that.hue)));
        int satDiff = (saturation - that.saturation) * (saturation - that.saturation);
        int briDiff = (brightness - that.brightness) * (brightness - that.brightness);
// using multiplication operator instead of Math.pow to keep everything as integers and avoid type incompatibility issues

        return (hueDiff + satDiff + briDiff);
    }

    // Sample client (see below).
    public static void main(String[] args) {
        int h = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        if (h < 0 || h > 359 || s < 0 || s > 100 || b < 0 || b > 100)
            throw new IllegalArgumentException("Hue must be between 0 and 359, and saturation and brightness must be between 0 and 100.");
        ColorHSB targetColor = new ColorHSB(h, s, b);
        if (targetColor.isGrayscale()) {
            System.out.println("Grey" + targetColor.toString());
        } else {
            int minimum = 149600;

            String colorData;
            String colorNearest = "";
            String colorNearestData = "";
            while (!StdIn.isEmpty()) {

                String col = StdIn.readString();
                int h2 = StdIn.readInt();
                int s2 = StdIn.readInt();
                int b2 = StdIn.readInt();

                ColorHSB that = new ColorHSB(h2, s2, b2);
                int minimumCurrent = targetColor.distanceSquaredTo(that);

                colorData = that.toString();

                if (minimumCurrent < minimum) {

                    minimum = minimumCurrent;
                    colorNearest = col;
                    colorNearestData = colorData;

                }
            }
            System.out.println(colorNearest + " " + colorNearestData);
        }

    }

}