package Temp;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by 777 on 21.06.2016.
 */

public class MyLinkedList<T> extends AbstractList<T> {
    //Индекс последнего элемента

    private int size;

    private int index = -1;

    private LinkedListNode<T> last = null;

    public LinkedListNode<T> getFirst() {
        return last.getNext();
    }

    MyLinkedList(){
        objects = new LinkedListNode[10];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
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
    public void add(T o) {
        //Если аррей пустой
        if (index == -1) {
            index++;
        } else {
            index++;
            if (index == objects.length) {
                LinkedListNode[] temp = (LinkedListNode[]) objects;
                objects = new LinkedListNode[temp.length * 2];
                for (int i = 0; i < temp.length; i++) {
                    objects[i] = temp[i];
                }
                ((LinkedListNode)objects[index - 1]).setNext((LinkedListNode) objects[index]);
            }
        }
        objects[index] = new LinkedListNode<>(o);
        last = (LinkedListNode)objects[index];
        last.setNext((LinkedListNode)objects[0]);
        size++;
    }

    void addFirst(T o) {
        if (index == -1) {
            objects[0] = new LinkedListNode<>(o);
            index++;
        } else {
            ((LinkedListNode) objects[0]).setElement(o);
        }
    }

    void addLast(T o) {
        LinkedListNode<T> temp = new LinkedListNode<>(o);
        temp.setNext((LinkedListNode) objects[0]);
        last = temp;
        index++;
        objects[index] = last;
    }

    @Override
    public boolean addAll(ListInterface<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, ListInterface<? extends T> c) {
        return false;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public boolean containsAll(ListInterface<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(ListInterface<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public T getLast() {
        return last.getElement();
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean removeAll(ListInterface<?> c) {
        return false;
    }

    @Override
    public void remove(int index1) {
        for (int i = index1; i < index; i++) {
            objects[i] = objects[i + 1];
        }
    }

    void removeFirst() {
        remove(0);
    }

    public T removeLast() {
        T temp = (T)objects[index];
        index--;
        last = (LinkedListNode) objects[index];
        last.setNext((LinkedListNode) objects[0]);
        return temp;
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
    public ListInterface<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public T get(int index) {
        return (T) ((LinkedListNode)objects[index]).getElement();
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    //Nested class - прочитать
    private class LinkedListNode<T> extends AbstractNode {

        LinkedListNode<T> next;

        LinkedListNode(T el) {
            super(el);
            next = null;
        }

        T getElement() {
            return (T) element;
        }

        void setElement(T element) {
            this.element = element;
        }

        LinkedListNode<T> getNext() {
            return next;
        }

        void setNext(LinkedListNode<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i <= index; i++) {
                stringBuilder.append(((LinkedListNode) objects[i]).getElement()).append(",");
            }
            return stringBuilder.toString();
        }
    }
}