/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinariobusqueda;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lawdv
 */
public class ArbolBinarioBusqueda {
    //importo la clase 
    private Nodo raiz;
    
    public void insertar(String palabra)
    {
        raiz = insertarRecursivo(raiz, palabra);
    }
    private Nodo insertarRecursivo(Nodo nodo, String palabra)
    {
        if(nodo == null)
        {
            return new Nodo(palabra);
        }
        if (palabra.compareToIgnoreCase(nodo.palabra) == 0)
        {
            nodo.frecuencia++;
        }
        else if (palabra.compareToIgnoreCase(nodo.palabra) < 0)
        {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, palabra);
        }
        else 
        {
            nodo.derecha = insertarRecursivo(nodo.derecha, palabra);
        }
        return nodo;
    }
    
    public void mostrarPorFrecuencia()
    {
        Map<String, Integer> frecuenciaMap = new HashMap<>();
        llenarMapaFrecuencia(raiz, frecuenciaMap);
        
        frecuenciaMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
    private void llenarMapaFrecuencia(Nodo nodo, Map<String, Integer> frecuenciaMap)
    {
        if(nodo != null)
        {
            llenarMapaFrecuencia(nodo.izquierda, frecuenciaMap);
            frecuenciaMap.put(nodo.palabra, nodo.frecuencia);
            llenarMapaFrecuencia(nodo.derecha, frecuenciaMap);
        }
    }
}
