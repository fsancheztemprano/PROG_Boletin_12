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

    public Garaxe(int plazasDisponibles, int plazasOcupadas) {
        this.plazasDisponibles = plazasDisponibles;
        this.plazasOcupadas = plazasOcupadas;
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
    
    public boolean aparcar(Coche coche){
        if(plazasOcupadas < plazasDisponibles){
            plazasOcupadas++;
            System.out.println("Coche: " + coche.getMarca() + " con matricula: " + coche.getMatricula() + " Aparcado!");
            coche.setAparcado(true);
            return true;
        }else{
            System.out.println("No hay plazas disonibles.");
            return false;
        }
    }
    
    public boolean salida(Coche coche, int horas, float dineroRecibido){
        if(coche.isAparcado()){
            plazasOcupadas--;
            System.out.println("Coche: " + coche.getMarca() + " con matricula: " + coche.getMatricula() + " Saliendo!");
            System.out.println("Horas: " + horas + "\nPrecio a pagar: "+calcPrecio(horas));
            System.out.println("Dinero recibido: " + dineroRecibido + "\nDinero Devuelto: "+(dineroRecibido-calcPrecio(horas)) );
            return true;
        }else{
            System.out.println("Este coche no esta en nuestro aparcamiento.");
            return false;
        }
    }
    public float calcPrecio(int horas){
        if (horas <= 3 )return 1.5f;
        else return (1.5f+((horas-3)*0.2f));
    }

}

