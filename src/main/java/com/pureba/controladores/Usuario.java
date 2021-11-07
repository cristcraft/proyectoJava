package com.pureba.controladores;

public class Usuario {
    private String cedula;
    private String email;
    private String nombre;
    private String contra;
    

    public void setCedula(String cedula) {
        cedula = this.cedula;
    }
    public void setName(String nombre) {
        nombre = this.nombre;
    }
    public void setemail(String email) {
        email = this.email;
    }
    public void setContra(String contra) {
        contra = this.contra;
    }

    public String getCedula() {
        return cedula;
    }
    public String getName(){
        return nombre;
    }
    public String getemail() {
        return email;
    }
    public String getContra() {
        return contra;
    }
}
