/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j.garcia
 */
public class NodoArbol {
    int dato;
    NodoArbol izq, der;
    
    public NodoArbol(int d){
        dato=d;
        izq=der=null;
    }
    
    public String toString(){
        return "el dato es "+dato;
    }
}
