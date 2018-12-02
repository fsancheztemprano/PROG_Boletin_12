/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_12_1;

import java.util.GregorianCalendar;

/**
 * @author fsancheztemprano
 */
public class Coche {
    private String matricula;
    private String marca;
    private boolean aparcado = false;
    private long entrada;

    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
        entrada = System.currentTimeMillis();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAparcado() {
        return aparcado;
    }

    public void setAparcado(boolean aparcado) {
        this.aparcado = aparcado;
    }

    public long getEntrada() {
        return entrada;
    }

}
