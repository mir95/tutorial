package Temp;

import java.util.List;

/**
 * Created by Sermilion on 23/09/2016.
 */
//Factory Method
class ListFacttory {

    public static MyArrayList createMyArrayList(){
        return new MyArrayList<>();
}

    public static MyLinkedList createMyLinkedList(){
        return new MyLinkedList();
    }

    public static MyDoubleLinkedList createMyDoubleLinkedList(){
        return new MyDoubleLinkedList();
    }

    static List getMyDoubleLinkedList(){
//        return new DoubleLinkedList();
        return null;
    }

}
