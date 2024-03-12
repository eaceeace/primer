package cm.revature.col.list;
import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> emp= new HashMap();
/* <KEY= INTEGER, VALE= STRING>
 KEYS OF MAP IS ALWAYS A SET. IT SHOULD BE DISTINCT AND UNIQUE
        TREEMAP IIS SORTED {180=uva, 181=ROja, 182=pooja, 184=rkuva} */
        emp.put(183,"uva");
        emp.put(181,"tarinish");
        emp.put(182,"pooja");
        emp.put(181,"ROja");
        emp.put(184,"rkuva");
        System.out.println(emp);
        // how to make map iterable
        Set<Integer> empID = emp.keySet();// first abrtract keys of the map. keyset returns the set of keys . by the set of keys we can use the get method
        System.out.println(empID);
        for(Integer i :empID)
            System.out.println(i+" " +emp.get(i));// using key access the value
    }
}
