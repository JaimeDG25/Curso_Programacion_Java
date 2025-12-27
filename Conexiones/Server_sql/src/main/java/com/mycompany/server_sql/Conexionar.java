
package com.mycompany.server_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexionar {

        Connection conectar = null;
        
        String usuario="El_sujeto" ;
        String contraseña="root";
        String bd="Intentosql";
        String ip="localhost";
        String puerto="1433";
        
    public Connection ejercer(){
        
        try {
            String cadena="jdbc:sqlserver://localhost:"+puerto+"/"+bd;
            conectar= DriverManager.getConnection(cadena,usuario,contraseña);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e) {
            System.out.println("El error al conectar en "+e.toString());
            JOptionPane.showMessageDialog(null,"Error al conectar en :"+e.toString());
        }   
        return conectar;
    }
}

        

