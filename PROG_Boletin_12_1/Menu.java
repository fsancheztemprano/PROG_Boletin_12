/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_12_1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * @author fsancheztemprano
 */
public class Menu {

    public static int startGaraxe() {
        try{
            return Integer.parseInt(JOptionPane.showInputDialog("Nuevo Garaxe.\nIntroduce plazas maximas: "));
        }catch(NumberFormatException e){
            return -1;
        }
        
    }

    public static int opcionesGaraxe(int i) {

        String[] options = {"Entrada", "Salida", "Mapa", "Cerrar"};
        return JOptionPane.showOptionDialog(null, "Plazas Vacias: " + i, "Garaxe", 0, 0, null, options, null);
    }

    public static String introData(String str) {
        return JOptionPane.showInputDialog("Introduce la " + str + ": ");
    }

    public static String introPago(String str) {

        return JOptionPane.showInputDialog(str);
    }

    public static void msg(String str) {
        JOptionPane.showMessageDialog(null, str);
    }
}
