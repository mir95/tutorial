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
        return size()==0;
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
        for (int i = 0; i < objects.length; i++) {
            if(objects[i]!=null){
                if(objects[i].element.equals(o)) {
                    for(int j=i; j<objects.length-1; j++){
                            objects[j] = objects[j + 1];
                    }
                }
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
        if(c instanceof List){
            for (int i = 0; i < objects.length; i++) {
                for(int j = 0; j<c.size(); j++){
                    if(objects[i]!=null){
                        ArrayListNode a = (ArrayListNode) ((List)c).get(j);
                        if(objects[i].element.equals(a.getElement())){
                            remove(a.getElement());
                        }
                    }
                }
            }
        }else if(c instanceof Map){

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
        for(int i=0; i<objects.length; i++){
            objects[i]=null;
        }
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
        ArrayListNode temp1;
        ArrayListNode temp2;
        ArrayListNode<T> newNode = new ArrayListNode<>(element);

        temp1 = (ArrayListNode) objects[index];
        objects[index] = newNode;

        for (int i = 1; i < size-1; i++) {
            temp2 = (ArrayListNode) objects[index+i];
            objects[index+i] = temp1;
            temp1 = temp2;
        }
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
