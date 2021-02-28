/**
 * <h1> Hoja de Trabajo 04</h1>
 * <h2> Node Double (Clase tipo "Interface")</h2>
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

public class NodeDouble<E> {

    // --> Atributos
    protected E data;
    protected NodeDouble<E> nextElement;
    protected NodeDouble<E> previousElement;

    // --> Constructuores
    public NodeDouble(E v, NodeDouble<E> next, NodeDouble<E> previous) {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public NodeDouble(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }

    // --> Métodos
    /** 
     * @return NodeDouble<E>
     */
    public NodeDouble<E> previous(){
        return previousElement;
    }
    
    
    /** 
     * @param nextElement
     */
    public void setNext(NodeDouble<E> nextElement){
        this.nextElement = nextElement;
    }

    public E value(){ // No sé si estará bueno....
        return data;
    }
}
