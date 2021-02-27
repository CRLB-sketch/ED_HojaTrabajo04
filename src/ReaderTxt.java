/**
 * <h1> Hoja de Trabajo 04 </h1>
 * <h2> ReaderTxt </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase se encargará de leer los archivos txt para obtener su información
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * 
 * @author [Cristian Laynez, Elean Rivas]
 * @version 1.0
 * @since 2021-Febrero-26
 **/    

import java.io.*;

public class ReaderTxt {

    /////////////////////////////////////////////////
    // --> Atributos
    private BufferedReader bf;

    /////////////////////////////////////////////////
    // --> Métodos

    /** 
     * Método para leer el archivo ingresado
     * 
     * @param file      Para solicitar la dirección del archivo.
     * @return String   Para retornar el texto del archivo
     *                  o la información.
     */
    public String readFile(String file){
        String text = "";
        
        try {

            bf = new BufferedReader(new FileReader(file));
            String temp = "";
            String bfRead;

            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }

            text = temp;

        } catch (Exception e) {
            text = "error";
        }

        return text;
    }

}
