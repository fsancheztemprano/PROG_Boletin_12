/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_12;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Extras_3_Garaxe {
    
    public static void main(String[] args) {
        Garaxe g1 = new Garaxe(3, 0);
        Coche c1 = new Coche("AAA0000", "Opel");
        Coche c2 = new Coche("AAA0001", "Renault");
        Coche c3 = new Coche("AAA0002", "BMW");
        Coche c4 = new Coche("AAA0003", "Seat");
        g1.aparcar(c1);
        g1.aparcar(c2);
        g1.aparcar(c3);
        g1.aparcar(c4);
        
    }
}
