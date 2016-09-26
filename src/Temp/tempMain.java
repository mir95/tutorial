package Temp;


import java.util.*;

/**
 * Created by 777 on 15.06.2016.
 */
public class tempMain {

    public static void main(String[] args) {

        List<Integer> linkedList =  ListFacttory.createMyArrayList();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.remove(2);
        doSomething(linkedList);

        HashMap<String, String> map = new HashMap<>();
        map.put("Столица", "Grozny");
        map.put("место в которое я хочу", "London");
        map.get("Столица");


    }

    private static void doSomething(List<Integer> list){
        ///
    }
}
