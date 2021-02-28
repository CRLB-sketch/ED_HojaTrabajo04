/**
 * <h1> Hoja de Trabajo 04 </h1>
 * <h2> Controller (Clase tipo "Controlador") </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase ejecutará toda la lógica correspondiente del programa.
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * 
 * @author [Cristian Laynez, Elean Rivas]
 * @version 1.0
 * @since 2021-Febrero-26
 **/    

import java.lang.NumberFormatException;
 
public class Controller {
    
    /////////////////////////////////////////////////
    // --> Atributos
    private ADTCalculator adtCalc;
    private ReaderTxt rTxt;
    private View view;
    private boolean out;

    /////////////////////////////////////////////////
    // --> Contructor
    public Controller(){
        rTxt = new ReaderTxt();
        view = new View();
        out = false;
    }

    /////////////////////////////////////////////////
    // --> Metodos

    /**
     * Método para llevar a cabo la lógica del menu principal
     */
    public void main_menu(){

        do {
            
            String option = view.menu();

            switch (option) {

                // Leer archivo predeterminado
                case "1":
                    String file1 = rTxt.readFile("src\\defaultTxt.txt");
                    
                    if(file1.equals("error")){
                        view.dialogueText(file1);
                    }
                    else{ // Por sí se leyo correctamente el archivo
                        selectTypeStack();
                        makeOperation(file1);
                    }
                
                    break;

                // Leer otro archivo ajeno
                case "2":
                    String file_choiced = view.askFile();
                    String file2 = rTxt.readFile(file_choiced);

                    if(file2.equals("error")){
                        view.dialogueText(file2);
                    }
                    else{ // Por sí se leyo correctamente el archivo
                        selectTypeStack();
                        makeOperation(file2);
                    }

                    break;

                // Salir/Terminar el programa
                case "3":
                    out = true;
                    view.farewell();                                        
                    break;
                    
                // Opción inválida
                default:
                    view.invalid();
                    break;
            }

        } while (!out);
    }

    /**
     * Método que nos ayudará a definir el tipo de lista solicitado
     */
    private void selectTypeStack(){

        String opStack = view.askTypeStack();

        switch (opStack) {
            case "1":
                adtCalc = new ADTCalculator( StackFactory.create("ArrayList") );
                view.dialogueText("--> Se utilizará un ArrayList" );
                break;

            case "2":
                adtCalc = new ADTCalculator( StackFactory.create("List") );
                view.dialogueText("--> Se utilizará una List" );
                break;

            case "3":
                adtCalc = new ADTCalculator( StackFactory.create("Vector") );
                view.dialogueText("--> Se utilizará un Vector" );
                break;
        
            default:
                adtCalc = new ADTCalculator( StackFactory.create("ArrayList") );
                view.dialogueText("--> Entonces usaremos un ArrayList" );
                break;
        }
    }
    
    /** 
     * Este método tendrá toda la logíca para llevar a 
     * cabo la operación.
     * 
     * @param operation La operación del archivo
     */
    private void makeOperation(String operation){
        
        double final_answer = 0;
        String[] the_operation = operation.split(" ");

        try {
            for(String op: the_operation){
    
                if(!adtCalc.isOperator(op)){ // Si es numero
                    adtCalc.pushNum(op);
                }
                else{ // Si es operador                
                    final_answer = adtCalc.resolver(op);
                }
            }
            
            adtCalc.clean(); // Para limpiar los datos 
    
            // Mostrar los resultados finales
            view.result(operation, final_answer);                    
        } 
        catch (NumberFormatException e) {
            view.errorLetter();
        }
        catch(Exception e){
            view.errorUnknow();
        }
    }           
}
