/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import bd.Conexion;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Vehiculo {
    private int codigo;
    private String num_motor;
    private String tipo_veh;
    private String marca;
    private String modelo;
    private int anno;
    private String color;
    private int precio;
    private String estado;
    private String revision;

    public Vehiculo() {
    }

    public Vehiculo(int codigo, String num_motor, String tipo_veh, String marca, String modelo, int anno, String color, int precio, String estado, String revision) {
        this.codigo = codigo;
        this.num_motor = num_motor;
        this.tipo_veh = tipo_veh;
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.color = color;
        this.precio = precio;
        this.estado = estado;
        this.revision = revision;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        try {
            if(codigo < 10000){
                this.codigo = codigo;
            }
            else{
                JOptionPane.showMessageDialog(null, "El código debe tener 4 dígitos");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el código");
        }
    }

    public String getNum_motor() {
        return num_motor;
    }

    public void setNum_motor(String num_motor) {
        try {
            if(num_motor.length() > 10 && num_motor.length() < 12){
                this.num_motor = num_motor;
            }
            else{
                JOptionPane.showMessageDialog(null, "Formato de número no válido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el número de motor");
        }
    }

    public String getTipo_veh() {
        return tipo_veh;
    }

    public void setTipo_veh(String tipo_veh) {
        try {
            if(!tipo_veh.equals("Seleccionar")){
                this.tipo_veh = tipo_veh;
            }
            else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opción válida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el tipo de vehículo");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        try {
            if(!marca.equals("Seleccionar")){
                this.marca = marca;
            }
            else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opción válida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar la marca");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        try {
            if(modelo.length() > 0){
                this.modelo = modelo;
            }
            else{
                JOptionPane.showMessageDialog(null, "El modelo no puede quedar en blanco");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el modelo");
        }
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        try {
            if(anno < 2019 || anno > 1900){
                this.anno = anno;
            }
            else{
                JOptionPane.showMessageDialog(null, "Formato de año no válido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el año");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        try {
            if(!color.equals("Seleccionar")){
                this.color = color;
            }
            else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opción válida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el color");
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio > 1000000){
            this.precio = precio;
        }
        else{
            System.out.println("El precio debe ser mayor a $1.000.000");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(!estado.equals("Seleccionar")){
            this.estado = estado;
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar una opción válida");
        }
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        if(!revision.equals("Seleccionar")){
            this.revision = revision;
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar una opción válida");
            this.revision = null;
        }
    }
    
    public boolean validar(){
        if (codigo != 0 && num_motor != null && tipo_veh != null && marca != null && modelo != null && anno != 0 && color != null && precio != 0 && estado != null && revision != null) {
            return false;
        }
        else{
            return true;
        }
    }

}
