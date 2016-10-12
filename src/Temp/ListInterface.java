package Temp;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by 777 on 12.07.2016.
 */
public interface ListInterface<T> extends Iterable<T>{

    void add(T o);

    T get(int index);

    int size();

    void remove(int index);

    boolean isEmpty();

    boolean contains(Object o);

    Iterator<T> iterator();

    Object[] toArray();

    <T1> T1[] toArray(T1[] a);

    boolean remove(Object o);

    boolean removeAll(ListInterface<?> c);

    boolean containsAll(ListInterface<?> c);

    boolean addAll(ListInterface<? extends T> c);

    boolean addAll(int index, ListInterface<? extends T> c);

    boolean retainAll(ListInterface<?> c);

    void clear();

    T set(int index, T element);


    void add(int index, T element);

    int indexOf(Object o);

    int lastIndexOf(Object o);

    ListIterator<T> listIterator();

    ListIterator<T> listIterator(int index);

    ListInterface<T> subList(int fromIndex, int toIndex);



}
