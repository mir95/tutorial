package Temp;

import java.util.*;

/**
 * Created by 777 on 02.10.2016.
 */
public class MyDoubleLinkedList<T> extends AbstractList<T> {

    private int index = -1;

    private int size;

    private DoubleLinkedListNode<T> last = null;

    private DoubleLinkedListNode<T> first = null;

    public T getLast() {
        return last.getElement();
    }

    @Override
    public T get(int index) {
        return (T) ((DoubleLinkedListNode)objects[index]).getElement();
    }

    public DoubleLinkedListNode<T> getFirst() {
        return last.getNext();
    }

    MyDoubleLinkedList(){
        objects = new DoubleLinkedListNode[10];
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
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

    public Object[] toArray() {
        return objects;
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return null;
    }

    @Override
    public void add(T t) {
        //Если аррей пустой
        if (index == -1) {
            index++;
        } else {
            index++;
            if (index == objects.length) {
                DoubleLinkedListNode[] temp = (DoubleLinkedListNode[]) objects;
                objects = new DoubleLinkedListNode[temp.length * 2];
                for (int i = 0; i < temp.length; i++) {
                    objects[i] = temp[i];
                }
                ((DoubleLinkedListNode)objects[index + 1]).setNext((DoubleLinkedListNode) objects[index]);
                ((DoubleLinkedListNode)objects[0]).setPrevious((DoubleLinkedListNode) objects[index--]);
            }
        }
        objects[index] = new DoubleLinkedListNode<>(t);
        last = (DoubleLinkedListNode)objects[index];
        last.setNext((DoubleLinkedListNode)objects[0]);
        first = (DoubleLinkedListNode)objects[0];
        first.getPrevious((DoubleLinkedListNode)objects[index--]);
        size++;
    }

    void addFirst(T o) {
        if (index == -1) {
            objects[0] = new DoubleLinkedListNode<>(o);
            index++;
        } else {
            ((DoubleLinkedListNode) objects[0]).setElement(o);
        }
    }

    void addLast(T o) {
        DoubleLinkedListNode<T> temp = new DoubleLinkedListNode<>(o);
        temp.setNext((DoubleLinkedListNode) objects[0]);
        last = temp;
        index++;
        objects[index] = last;
    }

    @Override
    public void add(int i, T t) {

    }

    @Override
    public boolean addAll(ListInterface<? extends T> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, ListInterface<? extends T> collection) {
        return false;
    }

    @Override
    public boolean removeAll(ListInterface<?> collection) {
        for (int i = 0; i < objects.length; i++) {
            collection = (ListInterface<?>) objects[i];
            if(collection!=null) {
                collection = null;
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = (int) o; i < objects.length; i++) {
            if(objects[i]==null) {
                objects[i] = objects[i + 1];
                last = (DoubleLinkedListNode)objects[index];
                last.setNext((DoubleLinkedListNode)objects[0]);
                first = (DoubleLinkedListNode)objects[0];
                first.getPrevious((DoubleLinkedListNode)objects[index--]);
                return false;
            }
        }
        return true;
    }

    @Override
    public void remove(int in) {
        T temp = (T)objects[in];
        if(temp==objects[0]){
            for (int i = in; i < index; i++) {
                objects[i] = objects[i + 1];
                first = (DoubleLinkedListNode)objects[0];
                first.getPrevious((DoubleLinkedListNode)objects[index--]);
            }}else {
            for (int i = in; i < index; i++) {
                objects[i] = objects[i + 1];
            }}
        last = (DoubleLinkedListNode) objects[index];
        last.setNext((DoubleLinkedListNode) objects[0]);
        size--;
    }

    void removeFirst() {
        remove(0);
        first = (DoubleLinkedListNode)objects[0];
        first.getPrevious((DoubleLinkedListNode)objects[index--]);
    }

    public T removeLast() {
        T temp = (T)objects[index];
        index--;
        last = (DoubleLinkedListNode) objects[index];
        last.setNext((DoubleLinkedListNode) objects[0]);
        return temp;
    }

    @Override
    public boolean containsAll(ListInterface<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(ListInterface<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T set(int i, T t) {
        return null;
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
    public ListIterator<T> listIterator(int i) {
        return null;
    }

    @Override
    public ListInterface<T> subList(int i, int i1) {
        return null;
    }

    private class DoubleLinkedListNode<T> extends AbstractNode {

        DoubleLinkedListNode<T> next;
        DoubleLinkedListNode<T> previous;

        DoubleLinkedListNode(T el) {
            super(el);
            next = null;
            previous = null;
        }

        T getElement() {
            return (T) element;
        }

        void setElement(T element) {
            this.element = element;
        }

        DoubleLinkedListNode<T> getNext() {
            return next;
        }

        void setNext(DoubleLinkedListNode<T> next) {
            this.next = next;
        }

        DoubleLinkedListNode<T> getPrevious(DoubleLinkedListNode<T> object) {
            return previous;
        }

        void setPrevious(DoubleLinkedListNode<T> previous) {
            this.next = previous;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i <= index; i++) {
                stringBuilder.append(((DoubleLinkedListNode) objects[i]).getElement()).append(",");
            }
            return stringBuilder.toString();
        }
    }
}
