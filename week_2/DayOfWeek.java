public class DayOfWeek {

    enum Day {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    public static void main(String[] args) {
        Day day = Day.MON;  // You can change this to any day of the week

        switch (day) {
            case MON:
                System.out.println("This is tough.");
                break;
            case TUE:
                System.out.println("This is getting better.");
                break;
            case WED:
                System.out.println("Half way there.");
                break;
            case THU:
                System.out.println("I can see the light.");
                break;
            case FRI:
                System.out.println("Now we are talking.");
                break;
            case SAT:
            case SUN:
                System.out.println("Day off!");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
