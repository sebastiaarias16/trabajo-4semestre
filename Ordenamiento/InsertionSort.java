/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] goles = {2, 2, 4, 7, 1, 3, 5, 7};
        int p, j;
        int aux;
        
        System.out.println("Goles iniciales:");

        for (int i = 0; i < goles.length; i++) {
            System.out.print("," + goles[i]);
        }
        
        System.out.println("\n Ordenando..");
        
        for (p = 1; p < goles.length; p++) {
            aux = goles[p];
            j = p - 1;
            while ((j >= 0) && (aux < goles[j])) {
                goles[j + 1] = goles[j];
                j--;
            }
            goles[j + 1] = aux;
        }

        System.out.println("Goles Ordenados (inserción):");

        for (int i = 0; i < goles.length; i++) {
            System.out.print("," + goles[i]);
        }

    }

}
