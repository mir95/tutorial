package Temp.Map;

import Temp.MyArrayList;
import org.javatuples.Pair;
import org.omg.CORBA.Object;

/**
 * Created by Sermilion on 30/09/2016.
 */


public abstract class MyAbstractMap implements MyMapInterface {

    MyArrayList<Pair<Object,Object>> entrySet;

    public int size() {
        return entrySet.size();
    }

    public Object put(Object key, Object value){
        Pair<Object, Object> entry = new Pair<Object, Object>(key, value);
        entrySet.add(entry);
        return null;
    }

    public boolean isEmpty(){
        return entrySet.size() == 0;
    }


}
