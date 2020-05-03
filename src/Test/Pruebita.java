/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Conexion.*;
import java.util.Date;



/**
 *
 * @author pc
 */
public class Pruebita {
    
    UsuarioBo ebo = new UsuarioBo();
    Usuario usu = new Usuario();
    String mensaje = "";
    
    
    
    Date date = new Date();
    
    
   public void insertar(){
       //usu.setId(14);
       usu.setRut("146843935");
       usu.setApellido1("Cordova");
       usu.setApellido2("nasdaasdasasdsd");
       usu.setNombre1("Julio");
       usu.setNombre2("nas");
       usu.setDireccion("Avenizfasdasdzxf");
       usu.setNumeroContacto(551465123);
       usu.setFechaNaciemiento("03/octubre/1997");
       usu.setTipoUsuario("2");
       usu.setContraseña1("123");
       usu.setContraseña2("123");
       usu.setFechaCreacion("20/abril/2020");
       usu.setUsuario("pruebacordova@gmail.cl");
       mensaje = ebo.agregarUsuario(usu);
       System.out.println(mensaje);
       
       
   }
   
   public void modificar(){
       usu.setId(14);
       usu.setApellido1("Casfdadasdsad");
       usu.setApellido2("nasdaasdasasdsd");
       usu.setNombre1("pruebademodifico");
       usu.setNombre2("nasdsaasdd");
       usu.setRut("13245692");
       usu.setDireccion("Alameda123");
       usu.setNumeroContacto(551465123);
       usu.setFechaNaciemiento("03/octubre/1997");
       usu.setTipoUsuario("2");
       usu.setContraseña1("123");
       usu.setContraseña2("123");
       //usu.setFechaCreacion("20/abril/2020");
       usu.setUsuario("asfsshoasdasdwa1");
       mensaje = ebo.ModificarUsuario(usu);
       System.out.println(mensaje);
       
       
   }
   
   public void eliminar(){
       
       mensaje = ebo.EliminarUsuario(usu, "216526295");
       System.out.println(mensaje);
       
       
   }
    public static void main(String[] args) {
        Pruebita prub = new Pruebita();
        prub.insertar();
        //prub.modificar();
        //prub.eliminar();
    }
    
}
