/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j.garcia
 */
public class Principal {
    public static void main(String[] args) {
        ArbolBinario AB = new ArbolBinario();
        

        AB.Insertar(52);
        AB.Insertar(22);
        AB.Insertar(42);
        AB.Insertar(72);
        AB.Insertar(56);
        AB.Insertar(12);
        AB.Insertar(5);
        System.out.println("LA RAIZ ES: " + AB.Raiz());
        
        System.out.println("");
        System.out.println("la cantidad de nodos es "+AB.cantidadNodos());
       
        System.out.println("cantidad de hojas = "+AB.cantidadNodosHoja());
        
        System.out.println("la altura del arbol es = "+AB.retornarAltura());
        System.out.println(" ");
        AB.menorValor();
        AB.mayorValor();
        AB.imprimirNivel();
        
        
        
        
//        AB.InOrden(AB.raiz);
//        System.out.println("*******************");
//        AB.PreOrden(AB.raiz);
//        System.out.println("*******************");
//        AB.PostOrden(AB.raiz);
//        System.out.println("*******************");
//        System.out.println(AB.BuscarNodo(12));
//        AB.Eliminar(52);      
//        System.out.println("*******************");
//        System.out.println("LA RAIZ ES: "+AB.Raiz());
//        AB.PostOrden(AB.raiz);


    }
}
