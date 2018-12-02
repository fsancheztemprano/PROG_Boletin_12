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

        Garaxe garaxe = new Garaxe(Menu.startGaraxe(), 0);
        do {
            opcionesAccion(Menu.opcionesGaraxe(), garaxe);
        } while (0 == 0);

    }

    public static void opcionesAccion(int i, Garaxe g) {
        switch (i) {
            case 0:

                String matricula = Menu.introData("matricula");
                if(g.encontrarCoche(matricula)!=null){
                    Menu.msg("Este coche ya esta aparcado.");
                    break;
                }
                String marca = Menu.introData("marca");
                Coche coche = new Coche(matricula, marca);
                g.aparcar(coche);
                break;
            case 1:
                do {
                    matricula = Menu.introData("matricula");
                    Coche c = g.encontrarCoche(matricula);
                    if (c==null)break;
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
