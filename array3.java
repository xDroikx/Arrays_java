package Arreglos;

import javax.swing.*;
public class array3 {
    public static void main (String args []){
        String [] paises = new String[8];
        for(int i = 0; i<8; i ++){
            paises[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1));

        }
        for (String elemento:paises){
            System.out.println(("Pais " + elemento));
        }
    }
}