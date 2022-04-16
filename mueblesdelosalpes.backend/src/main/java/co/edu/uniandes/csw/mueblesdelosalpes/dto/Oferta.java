/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniandes.csw.mueblesdelosalpes.dto;

/**
 *
 * @author cristian-patino
 */
public class Oferta {
    
    private int idOferta;
    private String loginUsuarioOfertante;
    private long referenciaMueble;
    private double oferta;

    public Oferta(int idOferta, String loginUsuarioOfertante, long referenciaMueble, double oferta) {
        this.idOferta = idOferta;
        this.loginUsuarioOfertante = loginUsuarioOfertante;
        this.referenciaMueble = referenciaMueble;
        this.oferta = oferta;
    }

    public Oferta() {
    }

    
    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public String getLoginUsuarioOfertante() {
        return loginUsuarioOfertante;
    }

    public void setLoginUsuarioOfertante(String loginUsuarioOfertante) {
        this.loginUsuarioOfertante = loginUsuarioOfertante;
    }

    public long getReferenciaMueble() {
        return referenciaMueble;
    }

    public void setReferenciaMueble(long referenciaMueble) {
        this.referenciaMueble = referenciaMueble;
    }

    public double getOferta() {
        return oferta;
    }

    public void setOferta(double oferta) {
        this.oferta = oferta;
    }
    
    
}
