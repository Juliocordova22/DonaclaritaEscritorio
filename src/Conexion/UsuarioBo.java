/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author pc
 */
public class UsuarioBo {
    
     private String mensaje = "";
     private UsuarioDao edao = new UsuarioDao();
    
    public String agregarUsuario(Usuario usu){
        Connection con= Conexiones.conectar();
        try {
            mensaje = edao.agregarUsuario(con, usu);
        } catch (Exception e) {
            
            mensaje = mensaje + " " +e.getMessage();
        }finally{
            try {
                if (con != null){
                    
                    con.close();
                }
            } catch (Exception e) {
                mensaje = edao.agregarUsuario(con, usu);
            }
        }
       return mensaje;
       
   }
   public String ModificarUsuario(Usuario usu){
       
      Connection con= Conexiones.conectar();
        try {
            mensaje = edao.ModificarUsuario(con, usu);
        } catch (Exception e) {
            
            mensaje = mensaje + " " +e.getMessage();
        }finally{
            try {
                if (con != null){
                    
                    con.close();
                }
            } catch (Exception e) {
                mensaje = edao.agregarUsuario(con, usu);
            }
        }
       return mensaje;
       
   }
   public String EliminarUsuario(Usuario usu,String rut){
       
      Connection con= Conexiones.conectar();
        try {
            mensaje = edao.EliminarUsuario(con, rut);
        } catch (Exception e) {
            
            mensaje = mensaje + " " +e.getMessage();
        }finally{
            try {
                if (con != null){
                    
                    con.close();
                }
            } catch (Exception e) {
                mensaje = edao.agregarUsuario(con, usu);
            }
        }
       return mensaje;
       
   }
   
   public void listarUsuario(JTable tabla){
       
       Connection con= Conexiones.conectar();
       edao.listarEmpleado(con, tabla);
         try {
             con.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
      
       
   }
    
}
