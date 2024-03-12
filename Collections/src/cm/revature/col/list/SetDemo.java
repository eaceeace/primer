package cm.revature.col.list;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

    public class SetDemo {
        public static void main(String[] args) {
            Set<String> set = new HashSet<>(); // Creating a HashSet is random [uu, red, hi, rear, oppie]
           // Set<String> set = new TreeSet<>();         // Treeset follows ascending order //[hi, oppie, rear, red, uu]
            // Set<String> set = new LinkedHashSet<>();//LinkedHashset follows the insertion order //[hi, uu, rear, oppie, red]

            set.add("hi"); // Adding elements to the HashSet
            set.add("uu"); // Adding at the first position (no specific position in a Set)
            set.add("rear"); // Adding at the end (no specific position in a Set)
            set.add("8"); // Adding a string "8"
            set.add("oppie");
            set.add("oppie");
            set.add(null);
            set.add(null);
            set.add("red"); // Adding "red" (no specific position in a Set)
            set.remove("8"); // Removing an element

            System.out.println(set);

            System.out.println("Size of the set: " + set.size()); // Getting the size of the set
            System.out.println("Elements in the set: " + set); // Displaying the elements in the set

            // Using Iterator for retrieval
            System.out.println("Retrieving elements using Iterator:");
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            // Using for-each loop for retrieval
            System.out.println("Retrieving elements using for-each loop:");
            for (String element : set) {
                System.out.println(element);
            }
        }
    }


