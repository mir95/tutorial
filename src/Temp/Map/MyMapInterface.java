package Temp.Map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by Sermilion on 30/09/2016.
 */
interface MyMapInterface<K,V> {

    int size();

    boolean isEmpty();

    boolean containsKey(Object key);

    boolean containsValue(Object value);

    Object get(Object key);

    Object put(K key, V value);

    Object remove(Object key);

    void putAll(Map m);

    void clear();

    Set keySet();

    Collection values();

    Set<Map.Entry> entrySet();
}
