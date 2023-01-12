package Com.Project.ArraylistCompare_Exemple;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListCompare {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        List<String> list1 = Arrays.asList("A", "B", "C", "D", "E");

//        Collections.sort(l1);
//        Collections.sort(list);
        System.out.println(l1.equals(list));//false
        System.out.println(list.equals(list1));//true
        System.out.println(l1.equals(list1));//false

//Step--2 // Compare two list - find out the Additional element:

//        List<String> list2 = Arrays.asList("A", "B", "C", "D", "E");
//        List<String> list3 = Arrays.asList("A", "B", "C", "D", "G");
////        list2.remove(list3);
////        System.out.println(list2);//[A,B,C,D,E]
//            list2.removeAll(list3);
//            System.out.println(list2);
//        ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
//        ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "H"));
//        l4.removeAll(l5);
//        System.out.println(l4);//[F]

//Step--3//Find out the missing element:

//        ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
//        ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
//        l6.removeAll(l7);//False

//Step--4//Find out the common element
        ArrayList<String> l8 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l9 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "H"));
        l8.retainAll(l9);
        System.out.println(l8);//[A,B,C,D]
        System.out.println(l9);//[A,B,C,D,H]
    }
}
