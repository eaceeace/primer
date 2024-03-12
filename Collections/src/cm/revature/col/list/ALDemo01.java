package cm.revature.col.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ALDemo01 {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>(); // Creating an ArrayList with generic type Object

        l.add("hi"); // Adding elements to the ArrayList
        l.add(0, "uu"); // Adding at the first position
        l.add("rear"); // Adding at the end
        l.add(8); // Adding an integer (Autoboxing: Integer object will be created)
        l.add("oppie");
        l.add("oppie");
        l.add(3, "red"); // Adding at a specific index
        l.remove(5); // Removing an element at index 5


        System.out.println("Size of the list: " + l.size()); // Getting the size of the list
        System.out.println("Elements in the list: " + l); // Displaying the elements in the list

        // Using traditional for-loop for retrieval
        System.out.println("Retrieving elements using traditional for-loop:");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        // Using Iterator for retrieval
        System.out.println("Retrieving elements using Iterator:");
        Iterator<Object> lItr = l.iterator();
        while (lItr.hasNext()) {
            System.out.println(lItr.next());
        }

        // Using for-each loop for retrieval
        System.out.println("Retrieving elements using for-each loop:");
        for (Object element : l) {
            System.out.println(element);
        }
    }
}
