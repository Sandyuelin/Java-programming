public class Main {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        Bird b2 = new Bird();
        Bird b3 = new Bird(1, "lele");
        b1.spec = new Species();
        System.out.println(b3.name);

        // Create a FOOD object
        FOOD f1 = new FOOD();
        f1.name = "Seeds";
        f1.weight = 5;

        // Assign f1 to b1's food attribute
        b1.food = f1;

        // Call methods on Bird objects
        b1.eat(); // Now this will work as b1 has food assigned
        b2.fly(10); // Call fly with a distance argument
    }
}

class Bird {
    String name;
    FOOD food;  // Added food attribute
    int age;
    Species spec;

    Bird() {
        this(0,"");
        // Constructor logic can be added if needed
    }
    Bird (int age, String name){
        this.name = name;
        this.age = age;// use the key this to tell the variable is an attribute of the class
    }

    void fly(int distance) {
        System.out.println("This bird is flying " + distance + " meters.");
    }

    void eat() {
        if (food != null) {
            System.out.println("The bird is eating " + food.weight + " grams of " + food.name + ".");
        } else {
            System.out.println("No food available.");
        }
    }
}

class FOOD {
    String name;
    int weight;
}

class Species {
    // Species attributes and methods can be defined here
}
