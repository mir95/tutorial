package Temp;


import java.util.*;

/**
 * Created by 777 on 15.06.2016.
 */
public class tempMain {

    public static void main(String[] args) {

        List<Integer> ArrayList =  ListFacttory.createMyArrayList();
        ArrayList.add(2);
        ArrayList.add(3);
        ArrayList.add(4);
        ArrayList.add(5);
        ArrayList.remove(2);
        ArrayList.isEmpty();
        System.out.println(ArrayList.contains(1));
        doSomething(ArrayList);

        HashMap<String, String> map = new HashMap<>();
        map.put("Столица", "Grozny");
        map.put("место в которое я хочу", "London");
        map.get("Столица");


    }

    private static void doSomething(List<Integer> list){
        ///
    }
}
