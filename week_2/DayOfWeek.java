package week_2;

public class DayOfWeek {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        y = y - (14 - m) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        m = m + 12 * ((14 - m) / 12) - 2;
        d = (d + x + 31 * m / 12) % 7;
        if (d == 1) System.out.println("Monday");
        else if (d == 2) System.out.println("Tuesday");
        else if (d == 3) System.out.println("Wednesday");
        else if (d == 4) System.out.println("Thursday");
        else if (d == 5) System.out.println("Friday");
        else if (d == 6) System.out.println("Saturday");
        else System.out.println("Sunday");
    }
}
/* switch (d) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
This is how it use switch*/