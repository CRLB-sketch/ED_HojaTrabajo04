/**
 * <h1> Hoja de Trabajo 04</h1>
 * <h2> Node </h2>
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

public class Node<E>
{
   protected E data; // value stored in this element
   protected Node<E> nextElement; // ref to next

   public Node(E v, Node<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   public Node(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   
   /** 
    * @return Node<E>
    */
   public Node<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

   
   /** 
    * @param next
    */
   public void setNext(Node<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   
   /** 
    * @return E
    */
   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   
   /** 
    * @param value
    */
   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}

// Referencia de archivos cargados de Canvas Algoritmos y Estrucutaras de Datos