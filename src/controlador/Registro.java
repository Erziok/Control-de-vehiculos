/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Vehiculo;

/**
 *
 * @author Eduardo
 */

//Mensaje de prueba github

public class Registro {
    
    public void agregar(Vehiculo v){
            try {
                Statement s = (Statement) Conexion.connect().createStatement();
                String query1="insert into vehiculo (codigo,num_motor,tipo_veh,marca,modelo,anno,color,precio,estado,revision) value ('"+v.getCodigo()+"','"+v.getNum_motor()+"','"+v.getTipo_veh()+"','"+v.getMarca()+"','"+v.getModelo()+"','"+v.getAnno()+"','"+v.getColor()+"','"+v.getPrecio()+"','"+v.getEstado()+"','"+v.getRevision()+"')";
                s.executeUpdate(query1);
                JOptionPane.showMessageDialog(null, "Agregado");
            } catch (SQLException ex) {
                Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No agregado");
            }             
        }
    
    public void eliminar(Vehiculo v){
            try {
                Statement s = (Statement) Conexion.connect().createStatement();
                String query1="DELETE FROM vehiculo WHERE codigo="+v.getCodigo();
                s.executeUpdate(query1);
                JOptionPane.showMessageDialog(null, "Eliminado");
            } catch (SQLException ex) {
                Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No eliminado");
            }
        }
    
    public void modificar(Vehiculo v){
        try {
            Statement s = (Statement) Conexion.connect().createStatement();
            String query1="UPDATE vehiculo set num_motor='"+v.getNum_motor()+"',tipo_veh='"+v.getTipo_veh()+"',marca='"+v.getMarca()+"',modelo='"+v.getModelo()+"',anno='"+v.getAnno()+"',color='"+v.getColor()+"',precio='"+v.getPrecio()+"',estado='"+v.getEstado()+"',revision='"+v.getRevision()+"'";
            s.executeUpdate(query1);
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}