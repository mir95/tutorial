package Temp;


import java.util.*;

/**
 * Created by 777 on 15.06.2016.
 */
public class tempMain {

    public static void main(String[] args) {

        List<Integer> ArrayList =  ListFacttory.createMyArrayList();
        ArrayList.isEmpty();
        System.out.println(ArrayList.isEmpty());
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
