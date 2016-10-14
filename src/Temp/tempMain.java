package Temp;

import CompareToIteratorEquals.User;

import java.util.*;

/**
 * Created by 777 on 15.06.2016.
 */
public class tempMain {

    public static void main(String[] args) {

        MyArrayList<User> users = new MyArrayList<>();

        User user1 = new User();
        user1.setAge(15);
        user1.setName("Boss");

        User user2 = new User("Boss", 15);

        users.add(user1);
        users.add(user2);

        User[] usersArray = new User[2];
        usersArray[0] = user1;
        usersArray[1] = user2;


        System.out.println(String.format("User 1 equals 2 is: \t%s",user1.equals(user2)));
//        System.out.println(String.format("User 1 compareTo 2 is: \t%s",user1.compareTo(user2)));

        for(User user : usersArray){
            System.out.println(user);
        }

//        for(int i=0; i<usersArray.length; i++){
//            System.out.println(usersArray[i]);
//        }


//        ListInterface<Integer> ArrayList = ListFacttory.createMyArrayList();
//        ArrayList.add(1);
//        ArrayList.add(2);
//        ArrayList.add(3);
//        ArrayList.add(4);
//        ArrayList.add(5);
//        ArrayList.add(6);
//        ArrayList.add(7);
//        ListInterface<Integer> ArrayList1 = ListFacttory.createMyArrayList();
//        ArrayList1.add(1);
//        ArrayList1.add(2);
//        ArrayList1.add(3);
//        ArrayList1.add(4);
//
//
////        for(Integer i: ArrayList){
////            System.out.println(i);
////        }
//
////        ArrayList.get(0).compareTo(ArrayList.get(1));
//
//        ArrayList.removeAll(ArrayList1);
//
////        ArrayList.add(2,0);
//        System.out.println(ArrayList.size());
//        ArrayList.remove(new Integer(2));
//        System.out.println(ArrayList.size());
//        System.out.println(ArrayList.contains(44));
//        doSomething(ArrayList);
//
//        Set set = new HashSet();
//        set.add(1);
//        set.add(1);
//        set.add(2);
//        ArrayList a = new ArrayList(set);
//        a.add(2);
//
//        HashMap<String, String> map = new HashMap<>();
//        map.put("Столица", "Grozny");
//        map.put("место в которое я хочу", "London");
//        map.get("Столица");


    }

    private static void doSomething(ListInterface<Integer> list) {
        ///
    }
}
