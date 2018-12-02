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
public class Garaxe {

    private int plazasDisponibles;
    private int plazasOcupadas;
    private Coche[] coches;

    public Garaxe(int plazasDisponibles, int plazasOcupadas) {
        this.plazasDisponibles = plazasDisponibles;
        this.plazasOcupadas = plazasOcupadas;
        this.coches = new Coche[plazasDisponibles];
    }

    public int getPlazasDisponibles() {
        return plazasDisponibles;
    }

    public void setPlazasDisponibles(int plazasDisponibles) {
        this.plazasDisponibles = plazasDisponibles;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
        this.plazasOcupadas = plazasOcupadas;
    }

    public boolean aparcar(Coche coche) {
        if (plazasOcupadas < plazasDisponibles) {
            plazasOcupadas++;
            System.out.println("Coche: " + coche.getMarca() + " con matricula: " + coche.getMatricula() + " Aparcado en la plaza:"+plazaLibre());
            coche.setAparcado(true);
            coches[plazaLibre()] = coche;
            return true;
        } else {
            System.out.println("No hay plazas disonibles.");
            return false;
        }
    }

    public int encontrarCoche(Coche coche) {
        int i = 0;
        for (; i <= coches.length; i++) {
            if (coche == coches[i]) {
                break;
            }
        }
        return i;
    }

    public int plazaLibre() {
        int i = 0;
        for (; i <= coches.length; i++) {
            if (coches[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void liberarPlaza(int i) {
        coches[i] = null;
    }

    public float salida(Coche coche, long horas, float dineroRecibido) {
        float devolucion =dineroRecibido - calcPrecio(horas);
        if (coche.isAparcado() && devolucion>=0) {
            plazasOcupadas--;
            int plazaCoche = encontrarCoche(coche);
            liberarPlaza(plazaCoche);

            System.out.println("Coche: " + coche.getMarca() + " con matricula: " + coche.getMatricula() + " Saliendo de la plaza "+plazaCoche );
            System.out.println("Horas: " + horas + "\nPrecio a pagar: " + calcPrecio(horas));
            System.out.println("Dinero recibido: " + dineroRecibido + "\nDinero Devuelto: " + (dineroRecibido - calcPrecio(horas)));
            return devolucion;
        } else {
            System.out.println("Este coche no esta en nuestro aparcamiento o el pago no es suficiente.");
            return -1;
        }
    }

    public float calcPrecio(long horas) {
        if (horas <= 3) {
            return 1.5f;
        } else {
            return (1.5f + ((horas - 3) * 0.2f));
        }
    }
    public Coche encontrarCoche(String matricula){
        for (Coche coche : coches) {
            if (coche != null && coche.getMatricula().equalsIgnoreCase(matricula)) {
                return coche;
            }
        }
        return null;
    }

}
