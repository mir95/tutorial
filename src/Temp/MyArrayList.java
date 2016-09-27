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
        for (int i = 0; i < this.size; i++) {
            if (objects[i] != null) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < this.size; i++) {

        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        index++;
        ArrayListNode<T> node = new ArrayListNode<>(t);
        objects[index] = node;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public T remove(int index1) {
        T temp = (T)objects[index1];
        for (int i = index1; i < index; i++) {
            objects[i] = objects[i + 1];
        }
        index--;
        objects[index+1]=null;
        return temp;
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
    public boolean removeAll(Collection<?> c) {
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
    public void add(int index, T element) {
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
