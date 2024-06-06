public class Clock {
    private int hour, minute;


    // Creates a clock whose initial time is h hour and m minute.
    public Clock(int h, int m){
        hour = h;
        minute = m;
        if (hour <0||hour>23||minute <0 || minute >59) throw new IllegalArgumentException("bad data. Hours between 0 and 23, minute between 0 and 59 "+h+" "+m);
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        if (s == null || !s.matches("\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("String must be in the format HH:MM.");
        }
        hour = Integer.parseInt(s.substring(0,1));
        minute = Integer.parseInt(s.substring(3,4));
    }
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString(){
        return String.format("%02d:%02d", hour, minute);
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that){
        Clock a = this;
        if(a.hour > that.hour) return false;
        else if (a.minute >that.minute)return false;
        else if (a.hour < that.minute) return true;
        else return true;
    }

    // Adds 1 minute to the time on this clock.
    public void tic(){
        if ((minute+1) < 60) minute += 1;
    else{
        minute = 60-(minute+1);
        hour+=1;
        if (hour == 24) hour = 0;
    }
    }

    // Adds Δ minute to the time on this clock.
    public void toc(int delta){
        if (delta <0) throw new IllegalArgumentException("delta should be positive or zero");
        else {
            int totalMinutes = this.hour * 60 + this.minute + delta;
            this.hour = (totalMinutes / 60) % 24;
            this.minute = totalMinutes % 60;
        }
    }

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock1 = new Clock(23, 59);
        Clock clock2 = new Clock("12:34");

        System.out.println("Initial Times:");
        System.out.println("Clock1: " + clock1);
        System.out.println("Clock2: " + clock2);

        clock1.tic();
        System.out.println("Clock1 after tic: " + clock1);

        clock2.toc(27);
        System.out.println("Clock2 after toc(27): " + clock2);

        System.out.println("Is Clock1 earlier than Clock2? " + clock1.isEarlierThan(clock2));
    }
}