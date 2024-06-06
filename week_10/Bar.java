import java.util.Arrays;

public class Bar implements Comparable<Bar> {
    // add implements Comparable<Bar> indicates that Bar objects can be compared by value
    private String n;
    private int v;
    private String c;
    // Creates a new bar.
    public Bar(String name, int value, String category){
        if (name != null &&  value >0 && category != null) {
            n = name;
            v = value;
            c = category;
        }
        else throw new IllegalArgumentException();
    }

    // Returns the name of this bar.
    public String getName(){
        return n;
    }

    // Returns the value of this bar.
    public int getValue(){
        return v;
    }

    // Returns the category of this bar.
    public String getCategory(){
        return c;
    }

    // Compare two bars by value.
    public int compareTo(Bar that){
        if (that == null) throw new NullPointerException();
        return Integer.compare(this.v,that.v);
    }

    // Sample client (see below).
    public static void main(String[] args){
        Bar[] bars = new Bar[10];
        bars[0] = new Bar("Beijing", 22674, "East Asia");
        bars[1] = new Bar("Cairo", 19850, "Middle East");
        bars[2] = new Bar("Delhi", 27890, "South Asia");
        bars[3] = new Bar("Dhaka", 19633, "South Asia");
        bars[4] = new Bar("Mexico City", 21520, "Latin America");
        bars[5] = new Bar("Mumbai", 22120, "South Asia");
        bars[6] = new Bar("Osaka", 20409, "East Asia");
        bars[7] = new Bar("São Paulo", 21698, "Latin America");
        bars[8] = new Bar("Shanghai", 25779, "East Asia");
        bars[9] = new Bar("Tokyo", 38194, "East Asia");

        // sort in ascending order by value
        Arrays.sort(bars);

        // Print the sorted bars
        for (Bar bar : bars) {
            System.out.println(bar.getName() + " - " + bar.getValue() + " - " + bar.getCategory());
        }

    }

}