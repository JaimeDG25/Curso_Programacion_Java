
package com.mycompany.hola.hola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
public class Datos {
    
    public Connection base(){
        String BD="ejemplos";//nombre de la base de datos
        String usuario="root";//el usuario
        String password="";//contraseña
        String host="localhost";//el host 
        String puerto="3306";
        String driver="com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://" + host + ":" + puerto + "/" + BD + "?useSSL=false";

        Connection conexion=null;
        try {
            //intentamos conectar la base de datos con el programa 
            Class.forName(driver);
            conexion=DriverManager.getConnection(url, usuario, password);
            
                    
        } catch (Exception ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    public void table (Acceso perro){

        try {
            Connection gato=base();
            String consulta;
            consulta="INSERT INTO `tabal` (`Nombre`, `Apellido`) VALUES ('"+perro.getNombre()+"', '"+perro.getApellido()+"')";
        Statement s= gato.createStatement();//Guardamos en la base de datos
            s.execute(consulta);
        } catch (Exception e) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
