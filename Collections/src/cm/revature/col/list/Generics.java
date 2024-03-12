package cm.revature.col.list;
import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(); // Creating an ArrayList with generic type String

        l.add("hi"); // Adding elements to the ArrayList
        l.add(0, "uu"); // Adding at the first position
        l.add("rear"); // Adding at the end
       // l.add(8); // Error: Cannot add an integer to a List<String>
        l.add("oppie");
        l.add("oppie");
        l.add(3, "red"); // Adding at a specific index
        l.remove(5); // Removing an element at index 5
        System.out.println(l); // Printing the ArrayList

        List<Number> al = new ArrayList<>(); // Creating an ArrayList with generic type Number

        al.add(8); // Adding an integer (Autoboxing: Integer object will be created)
        al.add(3.14); // Adding a double (Autoboxing: Double object will be created)
        al.add(5.5f); // Adding a float (Autoboxing: Float object will be created)

        System.out.println(l); // Printing the ArrayList
    }
    }


