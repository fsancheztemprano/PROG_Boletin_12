/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_12_1;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Coche c1 = new Coche("AAA0000", "Opel");
//        Coche c2 = new Coche("AAA0001", "Renault");
//        Coche c3 = new Coche("AAA0002", "BMW");
//        Coche c4 = new Coche("AAA0003", "Seat");
//        Coche c5 = new Coche("AAA0003", "Toyota");
//        Coche c6 = new Coche("AAA0003", "Mercedes");
//        g1.aparcar(c1);
//        g1.aparcar(c2);
//        g1.aparcar(c3);
//        g1.aparcar(c4);
//        g1.aparcar(c5);
//        g1.aparcar(c6);
//        
//        g1.salida(c1, 4, 2);
//        g1.aparcar(c6);

        Garaxe garaxe = new Garaxe(Menu.opcionesGaraxe(), 0);
        opcionesAccion(Menu.opcionesGaraxe(), garaxe);
        
    }
        public static void opcionesAccion(int i, Garaxe g){
        switch(i){
            case 0:
                System.out.println("0");
                Coche coche = new Coche(Menu.introData("matricula"), Menu.introData("marca"));
                g.aparcar(coche);
                break;
            case 1:
                System.out.println("1");
                String matricula = Menu.introData("matricula");
                Coche c = g.encontrarCoche(matricula);
                g.salida(c, 1, 10);
                break;
            default:
                break;
        }
        
    }

}
