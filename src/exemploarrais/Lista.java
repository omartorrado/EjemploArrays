/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrais;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezrivas
 */
public class Lista {

    int[] dorsais = new int[4];
    String[] nome = new String[11];

    public int[] cargarArray(int[] dorsais) {
        for (int i = 0; i < dorsais.length; i++) {
            dorsais[i] = i + 3;
//                nomes[i] = pedirNomes();

        }
        return dorsais;
    }

    public void visualizar(int[] dorsais) {
        System.out.println("DORSAL   NOME \n");
        for (int i = 0; i < dorsais.length; i++) {
            System.out.println(dorsais[i] + "-->" + nome[i]);
        }

    }

    public String pedirNomes() {
        String auxNomes;
        auxNomes = JOptionPane.showInputDialog("nome ;");
        return auxNomes;
        //tamén return JOptionPane.showInputDialog("nome :");
    }
    public int[] ordenar(int[]dorsais){
    int aux;
    for(int i=0;i<dorsais.length-1;i++)
        for(int j=i+1;j<dorsais.length;j++)
            if(dorsais[i]<dorsais[j]){
                aux=dorsais[i];
                dorsais[i]=dorsais[j];
                dorsais[j]=aux;
            }
    return dorsais;
    
    }

}
