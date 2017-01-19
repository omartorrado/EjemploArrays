/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrais;

/**
 *
 * @author dfernandezrivas
 */
public class ExemploArrais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[5];

        Lista obxlista = new Lista();
        numeros = obxlista.cargarArray(numeros);
        obxlista.visualizar(numeros);
        System.out.println();

    }

}
