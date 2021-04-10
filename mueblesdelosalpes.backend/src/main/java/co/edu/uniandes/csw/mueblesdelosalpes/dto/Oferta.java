package co.edu.uniandes.csw.mueblesdelosalpes.dto;


public class Oferta {



    private long idOferta;


    private String loginUsuarioOfertante;


    private int referenciaMueble;


    private double oferta;


    public Oferta(){

    }

    public Oferta(long idOferta, String loginUsuarioOfertante, int referenciaMueble, double oferta) {
        this.idOferta = idOferta;
        this.loginUsuarioOfertante = loginUsuarioOfertante;
        this.referenciaMueble = referenciaMueble;
        this.oferta = oferta;
    }

    public long getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(long idOferta) {
        this.idOferta = idOferta;
    }

    public String getLoginUsuarioOfertante() {
        return loginUsuarioOfertante;
    }

    public void setLoginUsuarioOfertante(String loginUsuarioOfertante) {
        this.loginUsuarioOfertante = loginUsuarioOfertante;
    }

    public int getReferenciaMueble() {
        return referenciaMueble;
    }

    public void setReferenciaMueble(int referenciaMueble) {
        this.referenciaMueble = referenciaMueble;
    }

    public double getOferta() {
        return oferta;
    }

    public void setOferta(double oferta) {
        this.oferta = oferta;
    }

}