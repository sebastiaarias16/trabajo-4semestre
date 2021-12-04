/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] goles = {2,2,4,7,1,3,5,7};
        int temporal;
        
        System.out.println("Goles iniciales:");

        for (int i = 0; i < goles.length; i++) {
            System.out.print("," + goles[i]);
        }
        
        System.out.println("\n Ordenando..");
        
        for (int i = goles.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (goles[j] > goles[j + 1]) {
                    temporal = goles[j];
                    goles[j] = goles[j + 1];
                    goles[j + 1] = temporal;
                }           
            }
        }
        
        System.out.println("Goles Ordenados (burbuja):");
        
        for (int i = 0; i < goles.length; i++) {
            System.out.print("," + goles[i]);
        }
        
        System.out.println("");
    }
    
}
