/**
 * <h1>Hoja de Trabajo 04</h1>
 * <h2>Abstract List (Clase tipo "Abstracto") </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase sentará los métodos para una lista.
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

public abstract class AbstractList<E> implements IList<E> {
    
   public AbstractList()
   // post: does nothing
   {
   }

   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
  public boolean contains(E value)
  // pre: value is not null
  // post: returns true iff list contains an object equal to value
  {
	    return -1 != indexOf(value);
  }

}