package Temp;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Sermilion on 30/09/2016.
 */
interface Collections {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    Iterator iterator() ;

    Object[] toArray();

    boolean add(Object o) ;

    boolean remove(Object o) ;

    boolean addAll(Collection c) ;

    boolean removeIf(Predicate filter) ;

    void clear();

    Spliterator spliterator() ;

    Stream stream() ;

    Stream parallelStream();

    boolean retainAll(Collection c);

    boolean removeAll(Collection c);

    boolean containsAll(Collection c);

    Object[] toArray(Object[] a);
}
