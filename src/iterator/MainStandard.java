package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainStandard {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        //foreach
        for (String s : list) {
            System.out.println(s);
        }

        //for avec index
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }


        //while
        int i = 0;
        while (i < list.size()) {
            String s = list.get(i);
            System.out.println(s);
            i++;
        }

        //stream
        list.stream().forEach(s -> System.out.println(s));

        //iterable
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        Triplet triplet = new Triplet("a", "b", "c");
        for (String s : triplet) {
            System.out.println(s);
        }
    }
}
