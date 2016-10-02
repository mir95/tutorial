package Temp;

import java.util.*;

/**
 * Created by Sermilion on 23/09/2016.
 */
public class MyArrayList<T> extends AbstractList<T>  {

    private int index = -1;

    private int size;

    MyArrayList(){
        objects = new ArrayListNode[10];
    }

    @Override
    public boolean isEmpty() {
//        for (int i = 0; i < objects.length; i++) {
//            if (objects[i] != null) {
//                return false;
//            }
//        }
//        return true;
        return size==0;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < objects.length; i++) {
            if(objects[i]!=null) {
                if (objects[i].element == o) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return objects;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = (int) o; i < objects.length; i++) {
            if(objects[i]==null) {
                objects[i] = objects[i + 1];
                return false;
            }
        }
        return true;
    }

    @Override
    public T remove(int index1) {
        T temp = (T)objects[index1];
        for (int i = index1; i < index; i++) {
            objects[i] = objects[i + 1];
        }
        index--;
        size--;
        objects[index+1]=null;
        return temp;
}

    @Override
    public boolean removeAll(Collection<?> c) {
        for (int i = 0; i < objects.length; i++) {
            if(objects[i]!=null) {
                objects[i] = null;
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public boolean add(T t) {
        size++;
        index++;
        ArrayListNode<T> node = new ArrayListNode<>(t);
        objects[index] = node;
        return true;
    }

    @Override
    public void add(int index, T element) {
        size++;
        ArrayListNode<T> el = new ArrayListNode<>(element);
        objects[index] = el;
        T temp;
        T temp1;
        temp = objects[index].element;
        objects[index].element = (T) el;

        temp1 = objects[index+1].element;
        objects[index+1].element = temp;
        temp = objects[index+2].element;
        objects[index+2].element = temp1;
        temp1 = objects[index+3].element;
        objects[index+3].element = temp;
        temp = objects[index+4].element;
        objects[index+4].element = temp1;

//        for (int i = index; i < objects.length; i++) {
//            temp1 = objects[i+1].element;
//            objects[i+1].element = temp;
//                temp = objects[i+2].element;
//            objects[i+2].element = temp1;
//        }
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    private class ArrayListNode<T> extends AbstractNode {

        ArrayListNode(T el) {
            super(el);
        }

        T getElement() {
            return (T) element;
        }

        void setElement(T element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return element + "";
        }
    }
}
