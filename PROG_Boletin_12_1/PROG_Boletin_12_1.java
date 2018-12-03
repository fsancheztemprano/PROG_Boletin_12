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
        int plazas;
        do{
            plazas=Menu.startGaraxe();
        }while(plazas<1);
        Garaxe garaxe = new Garaxe(plazas, 0);
        do {
            opcionesAccion(Menu.opcionesGaraxe(garaxe.getPlazasLibres()), garaxe);
        } while (true);

    }

    public static void opcionesAccion(int i, Garaxe g) {
        switch (i) {
            case 0:
                if(g.getPlazasLibres()<=0){
                    Menu.msg("Aparcamiento lleno!");
                    break;
                }
                String matricula;
                do{
                    matricula = Menu.introData("matricula");
                }while(matricula==null || matricula.equals(""));
                if(g.encontrarCoche(matricula)!=null){
                    Menu.msg("Este coche ya esta aparcado.");
                    break;
                }
                String marca;
                do{
                    marca = Menu.introData("marca");
                }while(marca==null || marca.equalsIgnoreCase(""));
                Coche coche = new Coche(matricula, marca);
                g.aparcar(coche);
                break;
            case 1:
                do {
                    do {
                        matricula = Menu.introData("matricula");
                    } while (matricula == null || matricula.equals(""));
                    Coche c = g.encontrarCoche(matricula);
                    if (c == null) {
                        Menu.msg("Coche con matricula: " + matricula + " no esta aparcado aqui.");
                        break;
                    }
                    long tiempo = c.calcHoras();
                    float devolucion;
                    do {
                        String ipago;
                        do{
                            ipago = Menu.introPago("Factura\nMatricula: " + c.getMatricula() + "\nTiempo aparcado: " + c.timeString() + "\nA pagar: " + g.calcPrecio(tiempo) + " €");
                        }while(ipago ==null ||ipago.equals(""));
                        float pago=Float.parseFloat(ipago);
                        devolucion = g.salida(c, tiempo, pago);
                    } while (devolucion < 0);
                    Menu.msg("Pago completo.\nDevolucion: " + devolucion);
                } while (g.encontrarCoche(matricula) != null);
                break;
            case 2:
                Menu.msg(g.mapa());
                break;
            case 3:
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
