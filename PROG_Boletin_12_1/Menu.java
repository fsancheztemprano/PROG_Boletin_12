/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_12_1;

import javax.swing.JOptionPane;

/**
 * @author fsancheztemprano
 */
public class Menu {
    public static int startGaraxe() {
        return Integer.parseInt(JOptionPane.showInputDialog("Nuevo Garaxe.\nIntroduce plazas maximas: "));
    }

    public static int opcionesGaraxe() {

        String[] options = {"Entrada", "Salida", "Cerrar"};
        return JOptionPane.showOptionDialog(null, "Action:", "Titulo", 0, 0, null, options, null);
    }

    public static String introData(String str) {
        return JOptionPane.showInputDialog("Introduce la " + str + ": ");
    }

    public static float introPago(String str) {

        return Float.parseFloat(JOptionPane.showInputDialog(str));
    }

    public static void msg(String str) {
        JOptionPane.showMessageDialog(null, str);
    }


}
