/**
 * <h1>Hoja de Trabajo 04</h1>
 * <h2>Double Chain (Clase tipo "Interface")</h2>
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

public class DoubleChain<E> extends AbstractList<E> {
    
    // --> Atributos
    protected int count;
    protected NodeDouble<E> head;
    protected NodeDouble<E> tail;

    // --> Constructor
    public DoubleChain()
    // post: constructs an empty list
    {
        head = null;
        tail = null;
        count = 0;
    }

    // --> Métodos
    @Override
    public void addFirst(E value)
    // pre: value is not null
    // post: adds element to head of list
    {
        // construct a new element, making it head
        head = new NodeDouble<E>(value, head, null);
        // fix tail, if necessary
        if (tail == null)
            tail = head;
        count++;
    }

    @Override
    public void addLast(E value)
    // pre: value is not null
    // post: adds new value to tail of list
    {
        // construct new element
        tail = new NodeDouble<E>(value, null, tail);
        // fix up head
        if (head == null)
            head = tail;
        count++;
    }

    @Override
    public E removeLast()
    // pre: list is not empty
    // post: removes value from tail of list
    {
        NodeDouble<E> temp = tail;
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.value();
    }

    // Métodos solo para cumplir con la interface
    public int indexOf(E value) {
        return 0;
    }

    public int size() {
        return count;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public E getFirst() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E getLast() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E removeFirst() {
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
