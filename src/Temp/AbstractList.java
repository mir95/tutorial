package Temp;

import java.util.List;

/**
 * Created by 777 on 12.07.2016.
 */
abstract class AbstractList<T> implements List<T> {

    AbstractNode<T>[] objects;

    AbstractList(){

    }

    @Override
    public T get(int index) {
        return (T) objects[index];
    }

    @Override
    public int size() {
        return objects.length;
    }
}
