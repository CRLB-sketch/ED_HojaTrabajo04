/**
 * <h1> Hoja de Trabajo 04 </h1>
 * <h2> IList (Clase tipo "Interface") </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * 
 * @author [Cristian Laynez, Elean Rivas]
 * @version 1.0
 * @since 2021-Febrero-26
 **/    

import java.util.ListIterator;
 
public interface IList<E> {

    public int size();

    public boolean isEmpty();
    
    public void addFirst(E value);

    public int indexOf(E value);
    
    public void addLast(E value);
    
    public E getFirst();

    public boolean contains(E value);
    
    public E removeFirst();
    
}

// Referencia de archivos cargados de Canvas Algoritmos y Estrucutaras de Datos