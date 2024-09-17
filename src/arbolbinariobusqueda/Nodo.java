/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinariobusqueda;

/**
 *
 * @author lawdv
 */
public class Nodo {
    String palabra;
    int frecuencia;
    Nodo izquierda, derecha;
    
    public Nodo(String palabra){
        this.palabra = palabra;
        this.frecuencia = 1;
        this.izquierda = null;
        this.derecha = null;
    }
}
