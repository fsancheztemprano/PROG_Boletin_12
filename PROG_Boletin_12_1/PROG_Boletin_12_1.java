/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_12_1;

/**
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

        Garaxe garaxe = new Garaxe(Menu.startGaraxe(), 0);
        do {
            opcionesAccion(Menu.opcionesGaraxe(), garaxe);
        } while (0 == 0);

    }

    public static void opcionesAccion(int i, Garaxe g) {
        switch (i) {
            case 0:
                Coche coche = new Coche(Menu.introData("matricula"), Menu.introData("marca"));
                g.aparcar(coche);
                break;
            case 1:
                String matricula = null;
                do {
                    matricula = Menu.introData("matricula");
                    Coche c = g.encontrarCoche(matricula);
                    long salida = System.currentTimeMillis();
                    long tiempo = calcHoras(c.getEntrada(), salida);
                    float devolucion;
                    do {
                        float pago = Menu.introPago("Factura\nMatricula: " + c.getMatricula() + "\nTiempo aparcado: " + timeString(c.getEntrada(), salida) + "\nA pagar: " + g.calcPrecio(tiempo) + " €");
                        devolucion = g.salida(c, tiempo, pago);
                    } while (devolucion < 0);
                    Menu.msg("Pago completo.\nDevolucion: " + devolucion);
                } while (g.encontrarCoche(matricula) != null);
                break;
            case 2:
                System.exit(0);
                break;
            default:
                break;
        }

    }

    public static String timeString(long entrada, long salida) {
        String horas = String.valueOf((salida - entrada) / 3600000);
        String minutos = String.valueOf(((salida - entrada) % 3600000) / 60000);
        String segundos = String.valueOf((((salida - entrada) % 3600000) % 60000) / 1000);
        return horas + ":" + minutos + ":" + segundos;
    }

    public static long calcHoras(long entrada, long salida) {
        return (salida - entrada) / 3600000;
    }

}
