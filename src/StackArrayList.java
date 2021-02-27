/**
 * <h1> Hoja de Trabajo 04 </h1>
 * <h2> StackArrayList (Clase tipo "Generica") </h2>
 * <h3> Extraído de: Ejemplos de Canvas de A&ED </h3>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase tendrá será un ArrayList, esta proporcionará las bases necesarias
 * para llevar a cabo esta misma.
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * 
 * @author [Cristian Laynez, Elean Rivas]
 * @version 1.0
 * @since 2021-Febrero-26
 **/    

import java.util.ArrayList;

public class StackArrayList<E> implements IStack<E>
{
	/////////////////////////////////////////////////
	// --> Atributos	
	protected ArrayList<E> data;

	/////////////////////////////////////////////////
	// --> Constructor	
	public StackArrayList() {
		data = new ArrayList<E>();
	}

	/////////////////////////////////////////////////
	// --> Métodos	

	/** 
	 * Este método hará push a este ArrayList.
	 * 
	 * @param item	Representará el dato que se ingresará.
	 */
	@Override
	public void push(E item) {
		data.add(item);
	}
	
	/**
	* Este método removerá el dato de "encima".
	*
	* @return E		El dato eliminado.
	*/
	@Override
	public E pop() {
		return data.remove(size()-1);
	}
	
	/** 
	 * Este método obtendrá el ultimo dato ingresado.
	 * 
	 * @return E	El ultimo dato del Array.
	 */
	@Override
	public E peek() {
		return data.get(size() - 1);
	}
		  	
	/** 
	 * Se verificará si esta vacio o no.
	 * 
	 * @return boolean	Si tiene 0 o no.
	 */
	@Override
	public boolean empty() {
		return size() == 0;
	}

	/** 
	 * Se regresará el tamaño del Array.
	 * 
	 * @return int	El tamaño del Array.
	 */
	@Override
	public int size() {
		return data.size();
	}
	
	/**
	* Este método nos servirá para obtener
	* un dato en específico.
	*
	* @param pos  	La posicion del dato.
	* @return E		El dato escogido.        
	*/
	@Override
	public E obtain(int pos){
		return data.get(pos);
	}

	/**
	 * Para limpiar el ArrayList.
	 */
	@Override
	public void clean(){
		data.clear();
	}
}