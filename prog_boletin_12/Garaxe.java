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
            return true;
        }else{
            System.out.println("No hay plazas disonibles.");
            return false;
        }
        
        
    }

}

