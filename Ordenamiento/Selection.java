/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection;

/**
 *
 * @author valentina
 */
public class Selection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] goles = {2, 2, 4, 7, 1, 3, 5, 7};
        int i, j, menor, pos, tmp;

        System.out.println("Goles iniciales:");

        for (i = 0; i < goles.length; i++) {
            System.out.print("," + goles[i]);
        }

        System.out.println("\n Ordenando..");

        for (i = 0; i < goles.length - 1; i++) {
            menor = goles[i];
            pos = i;
            for (j = i + 1; j < goles.length; j++) {
                if (goles[j] < menor) {
                    menor = goles[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = goles[i];
                goles[i] = goles[pos];
                goles[pos] = tmp;
            }
        }

        System.out.println("Goles Ordenados (selección):");

        for (i = 0; i < goles.length; i++) {
            System.out.print("," + goles[i]);
        }

        System.out.println("");
    }

}
