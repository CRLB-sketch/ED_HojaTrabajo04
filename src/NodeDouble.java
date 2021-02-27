public class NodeDouble<E> {
    protected E data;
    protected NodeDouble<E> nextElement;
    protected NodeDouble<E> previousElement;

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

    public NodeDouble<E> previous(){
        return previousElement;
    }
    
    public void setNext(NodeDouble<E> nextElement){
        this.nextElement = nextElement;
    }

    public E value(){ // No sé si estará bueno....
        return data;
    }
}
