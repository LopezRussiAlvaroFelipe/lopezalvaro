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
public class Resultado {
private Date fecha;
    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public boolean ejecutoConError(){
    return true;
    }
    public boolean ejecutoOld(){
    return true;
    }
    public void ejecutoConAdvertencia(){};
}
