/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinariobusqueda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lawdv
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("prueba ok");
        //Defino Arbol desde la clase
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        
        //Lectura del archivo, las palabras estaran aqui
        try(BufferedReader br = new BufferedReader(new FileReader("Frase.txt")))
        {
            //Cada linea como string del texto 
            String linea;
            //While para el ciclo de lecutra 
            while ((linea = br.readLine()) != null)
            {
                //Separo la frase en palabras creo un arreglo de palabras
                String[] palabras = linea.split("\\W+");
                //Busqueda con for 
                for (String palabra : palabras) 
                {
                    if(!palabra.isEmpty())
                    {
                        //Mando las palabras a tolower para igualarlas
                        arbol.insertar(palabra.toLowerCase());
                    }
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        //Mostrar las palabras ordenadas por la frecuencia que s encontro
        arbol.mostrarPorFrecuencia();
    }
    
}
