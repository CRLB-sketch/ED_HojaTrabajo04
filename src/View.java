/**
 * <h1> Hoja de Trabajo 04 </h1>
 * <h2> View (Clase tipo "Vista") </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase será la vista del programa. En esta tendremos los mensajes del programa
 * y podrá recibir los inputs de los usuarios.
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * 
 * @author [Cristian Laynez, Elean Rivas]
 * @version 1.0
 * @since 2021-Febrero-26
 **/    

import java.util.Scanner;

public class View {

    /////////////////////////////////////////////////
    // --> Atributos
    private Scanner scan;

    /////////////////////////////////////////////////
    // --> Contructor
    public View(){
        scan = new Scanner(System.in);
    }

    /////////////////////////////////////////////////
    // --> Metodos
    /** 
     * Para mostrar el menu y poder obtener la desición del usuario.
     * 
     * @return String   La desición tomada por el usuario.
     */
    public String menu(){
        System.out.println("*** ADT Calculadora ***");
        System.out.println("Menu: ");
        System.out.println("1. Leer archivo predeterminado 1");
        System.out.println("2. Leer archivo predeterminado 2");
        System.out.println("3. Leer otro archivo");
        System.out.println("4. Salir");
        
        String option = scan.nextLine();
        return option;
    }

    /**
     * Cuando se selecciona una opción inválida
     */
    public void invalid(){
        System.out.println("-> Opción Invalida");
    }

    
    /** 
     * Para solicitar el nombre de un archivo.
     * 
     * @return String   El url escrito/solicitado.
     */
    public String askFile(){
        System.out.println("Ingrese el nombre del archivo que desee leer");
        System.out.println("--------------------------------------------");
        System.out.println("Ejemplos: ");
        System.out.println("[E0] -> nombrearchivo.txt");
        System.out.println("[E1] -> src\\nombrearchivo.txt");
        System.out.println("[E2] -> D:\\Funalito\\Archivos\\nombrearchivo.txt");
        System.out.println("Nota: Este ultimo puede variar depende de tu directorio");
        System.out.println("--------------------------------------------");
        
        String file = scan.nextLine();
        return file;
    }

    
    /** 
     * Para solicitar por el tipo de pila deseado.
     * 
     * @return String   La opcion final.
     */
    public String askTypeStack(){
        System.out.println("Selecciona el tipo de pila que desee usar: ");
        System.out.println("1. ArrayList");
        System.out.println("2. List");
        System.out.println("3. Vector");
        System.out.println("Otro. No sé cual usar :(");

        String type = scan.nextLine();
        return type;
    }
    
    /** 
     * Para mostrar información de un método.
     * 
     * @param information   La información dada.
     */
    public void dialogueText(String information){
        System.out.println(information);
    }

    /**
     * Para mostrar el formato infix.
     * 
     * @param infix Para solicitar el infix
     */
    public void formatInfix(String infix){
        System.out.println("Infix: " + infix);
    }

    /**
     * Por sí el documento tiene letras
     */
    public void errorLetter(){
        System.out.println("\n-> El archivo incluye letras, solo debe contener numeros y operadores.\n");
    }

    /**
     * Por si ocurrío algo inesperado o desconocido :(
     */
    public void errorUnknow(){
        System.out.println("\n-> Error desconocido :(\n");
    }
    
    /** 
     * Mostrará el resultado de la operación dada.
     * 
     * @param operation     La operación del archivo.
     * @param final_number  El resultado final.
     */
    public void result(String operation, double final_number){
        System.out.println("\nPostfix: " + operation);
        System.out.println("Resultado: " + final_number + "\n");
    }

    /**
     * Mensaje para terminar con el programa
     */
    public void farewell(){
        System.out.println("Saliendo...");
    }

}
