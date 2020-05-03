



package Conexion;

//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*; 
import javax.swing.JOptionPane;

public class Conexiones {
    
    private static Connection con = null;
        
    public static Connection conectar(){
    try
    { 
        Class.forName ("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@donaclarita.brauliolledo.io:1525:XE","c##donaclarita","gO02jvP4t1t9e");
            con.setAutoCommit(false);
        
            if(con != null){
                System.out.println("Conexion exitosa");
            
            }else{
                System.out.println("Conexion es ERRONEA");
            }
         
    }catch(ClassNotFoundException |SQLException e)
    { 
        JOptionPane.showMessageDialog(null, "Conexion erronea");
    }  
        
        return con;
    }
    
    public void desconexion(){
        try {
            con.close();
        } catch (Exception e) {
            
            System.out.println("Errore al desconectar " + e.getMessage());
        }
    
    }
    
    
}
