/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_12_2;

/**
 *
 * @author fsancheztemprano
 */
public class Ejercicio {

    public static void main(String[] args) {
        Clase1 obj1 = new Clase1(5, 4);
        System.out.print(obj1.modificar(4) + " ");
        Clase1 obj2 = new Clase1(5, 4);
        System.out.print(obj2.modificar(5) + " ");
        obj2 = obj1;
        System.out.println(obj2.modificar(5) + " ");
    }
}

class Clase1 {

    int p1, p2;

    public Clase1(int i, int j) {
        p1 = i;
        p2 = j;
    }

    public int modificar(int i) {
        p1 = p1 + i;
        p2 = p2 + i;
        System.out.print(p2 + " ");
        return p1;
    }
//Comentario nuevo
//Comentario nuevo 2
}
