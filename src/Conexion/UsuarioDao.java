
package Conexion;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class UsuarioDao {
    
    private String mensaje = "";
    PreparedStatement ps;
    ResultSet rs;
    Conexiones c= new Conexiones();
    Connection con;
    
    
    
    
    
   public String agregarUsuario(Connection con,Usuario usu){
       
       PreparedStatement pst = null ;
       String sql = "INSERT INTO C##DONACLARITA.USUARIO (USUARIO_ID,NOMBRES,APELLIDOS,NOMBRE_USUARIO,PASSWORD,TIPO_USUARIO,SEGUNDO_NOMBRE,SEGUNDO_APELLIDO,TELEFONO,RUT,DIRECCION,FECHA_NACIMIENTO,FECHA_CREACION) "
                  + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
       try {
           pst= con.prepareStatement(sql);
           pst.setInt(1, usu.getId());
           pst.setString(2, usu.getNombre1());
           pst.setString(3, usu.getApellido1());
           pst.setString(4, usu.getUsuario());
           pst.setString(5, usu.getContraseña2());
           pst.setString(6, usu.getTipoUsuario());
           pst.setString(7, usu.getNombre2());
           pst.setString(8, usu.getApellido2());
           pst.setInt(9, usu.getNumeroContacto());
           pst.setString(10, usu.getRut());
           pst.setString(11, usu.getDireccion());
           pst.setString(12, usu.getFechaNaciemiento());
           pst.setString(13, usu.getFechaCreacion());
           mensaje = "GUARDADO CORRECTAMENTE";
           pst.execute();
           pst.close();
           
           
           
       } catch (SQLException e) {
           
           mensaje = " NO SE PUDO GUARDAR CORRECTAMENTE \n "+ e.getMessage();
       }
       
       return mensaje;
       
   }
   public String ModificarUsuario(Connection con,Usuario usu){
       PreparedStatement pst = null ;
       String sql = "UPDATE C##DONACLARITA.USUARIO SET  NOMBRES = ?,APELLIDOS = ?,NOMBRE_USUARIO = ?,PASSWORD = ?,TIPO_USUARIO = ?,SEGUNDO_NOMBRE = ?,SEGUNDO_APELLIDO = ?,TELEFONO = ?,RUT = ?,DIRECCION = ?,FECHA_NACIMIENTO = ?,FECHA_CREACION = ? "
               +"WHERE USUARIO_ID = ?";
       try {
           pst= con.prepareStatement(sql);
           
           pst.setString(1, usu.getNombre1());
           pst.setString(2, usu.getApellido1());
           pst.setString(3, usu.getUsuario());
           pst.setString(4, usu.getContraseña2());
           pst.setString(5, usu.getTipoUsuario());
           pst.setString(6, usu.getNombre2());
           pst.setString(7, usu.getApellido2());
           pst.setInt(8, usu.getNumeroContacto());
           pst.setString(9, usu.getRut());
           pst.setString(10, usu.getDireccion());
           pst.setString(11, usu.getFechaNaciemiento());
           pst.setString(12, usu.getFechaCreacion());    
           pst.setInt(13, usu.getId());
           mensaje = "ACTUALIZADO CORRECTAMENTE";
           pst.execute();
           pst.close();
           
           
           
       } catch (SQLException e) {
           
           mensaje = " NO SE PUDO MODIFICAR CORRECTAMENTE \n "+ e.getMessage();
       }
       return mensaje;
       
   }
   public String EliminarUsuario(Connection con,String rut){
       PreparedStatement pst = null ;
       String sql = "DELETE FROM C##DONACLARITA.USUARIO WHERE RUT = ?";
       try {
           pst= con.prepareStatement(sql);
           pst.setString(1,rut);
           
           
           mensaje = "ELIMINADO CORRECTAMENTE";
           pst.execute();
           pst.close();
           
           
           
       } catch (SQLException e) {
           
           mensaje = " NO SE PUDO ELIMINAR CORRECTAMENTE \n "+ e.getMessage();
       }
       return mensaje;
       
   }
   
   /*public ArrayList<Usuario> mostrarTodo(){
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        String sql = "select * from C##DONACLARITA.USUARIO";

        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
                Usuario u=new Usuario();
                
                u.setRut(rs.getString(2));
                u.setNombre1(rs.getString(2));
                u.setNombre2(rs.getString(2));
                u.setApellido1(rs.getString(2));
                u.setApellido2(rs.getString(2));
                //u.setFechaNaciemiento(rs.getString(2));
                u.setDireccion(rs.getString(2));
                u.setNumeroContacto(0);
                u.setUsuario(rs.getString(2));
                u.setContraseña1(rs.getString(2));
                u.setContraseña2(rs.getString(2));
                u.setTipoUsuario(rs.getString(2));
                //u.setFechaCreacion(rs.getString(2));
                
            }
        } catch (Exception e){
            
        }
        
        return lista;
    }*/
    public void listarEmpleado(Connection con,JTable tabla){
        
        DefaultTableModel model ;
        String[] columnas = {"USUARIO_ID","NOMBRES","APELLIDOS","NOMBRE_USUARIO","PASSWORD","TIPO_USUARIO","SEGUNDO_NOMBRE","SEGUNDO_APELLIDO","TELEFONO","RUT","DIRECCION","FECHA_NACIMIENTO","FECHA_CREACION"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT * FROM C##DONACLARITA.USUARIO ORDER BY USUARIO_ID";
        String [] filas = new String[13];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {

                for (int i = 0; i < 13; i++) {
                    filas[i] = rs.getString(i+1);
                    
                }
                model.addRow(filas);
                    
                
                
            }
            tabla.setModel(model);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
                
    }
}
