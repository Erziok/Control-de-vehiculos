/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Conexion {
    
    public static Connection connect() throws SQLException{
        String url="jdbc:mysql://localhost:3306/transporte";
        String user="root";
        String pass="";
        
        Connection con = (Connection) DriverManager.getConnection(url, user, pass);
        try {
            System.out.println("Conectado");
            return con;
        } catch (Exception e) {
            System.out.println("No conectado");
            JOptionPane.showMessageDialog(null, "Conexión fallida");
            return con;
        }
        
    }
    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Conexion.connect();
    }


}
