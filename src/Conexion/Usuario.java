
package Conexion;

import java.sql.Date;

public class Usuario {
    int id;
    String rut;
    String nombre1;
    String nombre2;
    String apellido1;
    String apellido2;
    String fechaNaciemiento;
    String direccion;
    int numeroContacto;
    String usuario;
    String contraseña1;
    String contraseña2;
    String tipoUsuario;
    String FechaCreacion;

    public Usuario() {
    }

    public Usuario(int id,String rut, String nombre1, String nombre2, String apellido1, String apellido2, String fechaNaciemiento, String direccion, int numeroContacto, String usuario, String contraseña1, String contraseña2, String tipoUsuario, String FechaCreacion) {
        this.id = id;
        this.rut = rut;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNaciemiento = fechaNaciemiento;
        this.direccion = direccion;
        this.numeroContacto = numeroContacto;
        this.usuario = usuario;
        this.contraseña1 = contraseña1;
        this.contraseña2 = contraseña2;
        this.tipoUsuario = tipoUsuario;
        this.FechaCreacion = FechaCreacion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    public void setFechaNaciemiento(String fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña1() {
        return contraseña1;
    }

    public void setContraseña1(String contraseña1) {
        this.contraseña1 = contraseña1;
    }

    public String getContraseña2() {
        return contraseña2;
    }

    public void setContraseña2(String contraseña2) {
        this.contraseña2 = contraseña2;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", rut=" + rut + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", fechaNaciemiento=" + fechaNaciemiento + ", direccion=" + direccion + ", numeroContacto=" + numeroContacto + ", usuario=" + usuario + ", contrase\u00f1a1=" + contraseña1 + ", contrase\u00f1a2=" + contraseña2 + ", tipoUsuario=" + tipoUsuario + ", FechaCreacion=" + FechaCreacion + '}';
    }
    
    
    
    
    
    
}
