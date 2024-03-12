abstract class Vegetables {
    String name;
    String colour;

    abstract public String toString();
}

class Potato extends Vegetables {
    public Potato(String a, String b) {
        name = a;
        colour = b;
    }

    public String toString() {
        return name + "" + colour;
    }
}

/*
 * public class Lab_7_1 {
 * public static void main(String[] args) {
 * Potato p1 = new Potato("Potato", "yellow");
 * Potato p2 = new Potato("potato", "yellow");
 * System.out.print(p2);
 * }
 * }
 */
class Tomato extends Vegetables {
    public Tomato(String a, String b) {
        name = a;
        colour = b;
    }

    public String toString() {
        return name + "" + colour;
    }
}

class Brinjle extends Vegetables {
    public Brinjle(String a, String b) {
        name = a;
        colour = b;
    }

    public String toString() {
        return name + "" + colour;
    }
}

/*
 * public class Lab_7_1 {
 * public static void main(String[] args) {
 * Tomato t1 = new Tomato("Tomato", "red");
 * Tomato t2 = new Tomato("Tomato", "red");
 * System.out.print(t2);
 * }
 * }
 */
public class Lab_7_1 {
    public static void main(String[] arg) {
        Vegetables p = new Potato("Potato", "brown");
        Vegetables t = new Tomato("Tomato", "red");
        Vegetables b = new Brinjle("Brinjle", "purple");
        System.out.println(p.toString());
        System.out.println(t.toString());
        System.out.println(b.toString());
    }
}

// public static final (type)....in full code value can't change
// abstract may make constructor
// interface can't make constructor