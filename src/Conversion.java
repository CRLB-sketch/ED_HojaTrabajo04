/**
 * <h1>Hoja de Trabajo 04</h1>
 * <h2> Conversion </h2>
 * 
 * ADT Calculadora
 * 
 * Clase encargada de realizar la transformaicón de notacion intfix a postfix
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
 * 
 **/

public class Conversion{

    private SimpleChain<String> simpleC;

    public Conversion() {
        simpleC = new SimpleChain<>();
    }

    /***
     *
     * @param file1 el dato en formato intfix a convertir
     * @return  el dato en formato outfix
     */
    public String intToPost(String file1){
        String output = "";
        String[] infixLetters = file1.split("");
        int n = file1.length();
        int cont = 0;

        for (String i : infixLetters){

            // Para detectar si es un operador
            if (isOp(i)){
                simpleC.addFirst(i);
            }
            // Detectar si tiene un parentesis "("
            else if (isOrd(i)){
                int size =simpleC.size();
                for (int x=0;x<size;x++){
                    if (simpleC.getFirst().equals("(")){
                        simpleC.removeFirst();
                    }else {
                        output += simpleC.removeFirst()+" ";
                    }
                }
            }
            // Si es numero se agregará 
            else {
                output += i + " ";
            }

            cont++;

            // Por sí ya llegamos al final
            if (cont==n){
                int size= simpleC.size();
                for (int x=0;x<size;x++)
                output+=simpleC.removeFirst()+" ";
            }
        }

        return output;
    }


    /***
     *
     * @param op el dato
     * @return
     */
    private boolean isOp(String op){
        return switch (op) {
            case "+" -> true;
            case "-" -> true;
            case "/" -> true;
            case "*" -> true;
            case "^" -> true;
            case "(" -> true;
            default -> false;
        };
    }

    /***
     *
     * @param op
     * @return
     */
    private boolean isOrd(String op){
        return switch (op){
            case ")" -> true;
            default -> false;
        };
    }

}
