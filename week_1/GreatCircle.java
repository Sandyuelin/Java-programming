public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double r = 6371.0;

        double x1Rad = Math.toRadians(x1);
        double y1Rad = Math.toRadians(y1);
        double x2Rad = Math.toRadians(x2);
        double y2Rad = Math.toRadians(y2);

        double dx = x2Rad - x1Rad;
        double dy = y2Rad - y1Rad;


        double a = Math.sin(dx / 2) * Math.sin(dx / 2) + Math.cos(x1Rad) * Math.cos(x2Rad)
                * Math.sin(dy / 2) * Math.sin(dy / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = r * c;
        System.out.println(distance + " kilometers");


    }
}
