/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionario.i.e;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ottoalexander
 */
public class DiccionarioIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if (args.length != 1){
            quitError("Tree command word arguments expected");
        } 

        String inputFile = args[0];
        BST ingles = new BST(); 
        BST espanol = new BST(); 
        
        try
        {
            BufferedReader input = new BufferedReader(new FileReader(inputFile));

            //Scans each word from the input and prints it out
            String word = input.readLine();
            while (word != null)
            {
                ingles.insert(word);
                espanol.insert(word);
                word = input.readLine();
            }
            return;

        }catch(FileNotFoundException filenotfoundexception) //Catches file not found exception
        {
            System.out.println("No se encuentra el archivo");
        }
        catch(IOException ioexception) //Catches input/output exception
        {
            System.out.println("Un error ha ocurrido!");
        }
    }
    
     public static void quitError(String msg){
        System.out.println(msg);
        System.out.println("Programa corre");
        System.exit(0);
    }
}
