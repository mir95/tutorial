package Temp;

/**
 * Created by 777 on 12.07.2016.
 */
public interface ListInterface<T> {

    void add(T o);

    T get(int index);

    int size();

    void remove(int index);


}
