package Temp;

import java.util.*;

/**
 * Created by 777 on 15.06.2016.
 */
public class tempMain {

    public static void main(String[] args) {

        ListInterface<Integer> ArrayList = ListFacttory.createMyArrayList();
        ArrayList.add(1);
        ArrayList.add(2);
        ArrayList.add(3);
        ArrayList.add(4);
        ArrayList.add(5);
        ArrayList.add(6);
        ArrayList.add(7);
        ListInterface<Integer> ArrayList1 = ListFacttory.createMyArrayList();
        ArrayList1.add(1);
        ArrayList1.add(2);
        ArrayList1.add(3);
        ArrayList1.add(4);


//        for(Integer i: ArrayList){
//            System.out.println(i);
//        }

//        ArrayList.get(0).compareTo(ArrayList.get(1));

        ArrayList.removeAll(ArrayList1);

//        ArrayList.add(2,0);
        System.out.println(ArrayList.size());
        ArrayList.remove(new Integer(2));
        System.out.println(ArrayList.size());
        System.out.println(ArrayList.contains(44));
        doSomething(ArrayList);

        Set set = new HashSet();
        set.add(1);
        set.add(1);
        set.add(2);
        ArrayList a = new ArrayList(set);
        a.add(2);

        HashMap<String, String> map = new HashMap<>();
        map.put("Столица", "Grozny");
        map.put("место в которое я хочу", "London");
        map.get("Столица");


    }

    private static void doSomething(ListInterface<Integer> list) {
        ///
    }
}
