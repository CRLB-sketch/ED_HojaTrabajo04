/**
 * <h1>Hoja de Trabajo 04</h1>
 * <h2> Stack Factory </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase creará el tipo de lista solicitada.
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

public class StackFactory {

    
    /** 
     * @param type              Nombre del tipo de pila.
     * @return IStack<String>   Retornará un objeto tipo IStack
     */
    // Para crear la pila solicitada
    public static IStack<String> create(String type){

        switch (type) {
            case "ArrayList":
                return new StackArrayList<>();

            case "List":
                return new StackList<>();

            case "Vector":
                return new StackVector<>();
        
            default:
                return null;
        }
        
    }
}
