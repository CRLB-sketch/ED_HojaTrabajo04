/**
 * <h1>Hoja de Trabajo 04</h1>
 * <h2>Simple Chain (Clase tipo "Interface")</h2>
 * 
 * ADT Calculadora Postfix
 * 
 * <p>
 * Algoritmos Estructuras de datos - Universidad del Valle de Guatemala
 * </p>
 * 
 * Creado por:
 * 
 * @author [Cristian Laynez, Elean Rivas]
 * @version 1.0
 * @since 2021-Febrero-26
 **/

import java.util.ListIterator;

public class SimpleChain<E> extends AbstractList<E> {

    protected int count; // list size
    protected Node<E> head; // ref. to first element

    public SimpleChain()
    // post: generates an empty list
    {
        head = null;
        count = 0;
    }

    @Override
    public int size()
    // post: returns number of elements in list
    {
        return count;
    }

    @Override
    public void addFirst(E value)
    // post: value is added to beginning of list
    {
        // note order that things happen:
        // head is parameter, then assigned
        head = new Node<E>(value, head);
        count++;
    }

    @Override
    public E removeFirst()
    // pre: list is not empty
    // post: removes and returns value from beginning of list
    {
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }

    @Override
    public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return head.value();
    }

    @Override
    public void addLast(E value)
    // post: adds value to end of list
    {
        // location for new value
        Node<E> temp = new Node<E>(value, null);
        if (head != null) {
            // pointer to possible tail
            Node<E> finger = head;
            while (finger.next() != null) {
                finger = finger.next();
            }

            finger.setNext(temp);
        } else
            head = temp;

        count++;

    }

    @Override
    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff value is found in list
    {
        Node<E> finger = head;

        while (finger != null && !finger.value().equals(value)) {
            finger = finger.next();
        }
        return finger != null;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public E getLast() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E removeLast() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E remove(E value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(E value) {
        // TODO Auto-generated method stub

    }

    @Override
    public E remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E get() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(E value) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int lastIndexOf(E value) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public E get(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E set(int i, E o) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(int i, E o) {
        // TODO Auto-generated method stub

    }

    @Override
    public E remove(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListIterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
