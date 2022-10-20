/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lopezalvaro;

import java.util.Date;

/**
 *
 * @author sala4
 */
public class Tarea {

    private boolean habilitada;
    private boolean deshabilitarSiFalla;
    /**
     * @return the habilitada
     */
    public boolean isHabilitada() {
        return habilitada;
    }

    /**
     * @param habilitada the habilitada to set
     */
    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    /**
     * @return the deshabilitarSiFalla
     */
    public boolean isDeshabilitarSiFalla() {
        return deshabilitarSiFalla;
    }

    /**
     * @param deshabilitarSiFalla the deshabilitarSiFalla to set
     */
    public void setDeshabilitarSiFalla(boolean deshabilitarSiFalla) {
        this.deshabilitarSiFalla = deshabilitarSiFalla;
    }
    
    public void ejecutar(){};
    public void doEjecutar(){};
    public Date ultimaEjecucion(){
        return null;
    };
    public void vecesQueSeEjecuto(Date hola,Date hola2){};
    public void vecesQueDioError(Date hola,Date hola2){};
    
}
