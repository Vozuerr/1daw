/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author scasal
 */
public class Persona {
    

    private String dni;
    private Calendar fecha;
    private String provincia;
    private String direccion;
    private int codigopostal;
    private String nombrecompleto;

    public Persona(String dni, String nombrecompleto, Calendar fecha, String provincia, String direccion, int codigopostal) {
        this.dni = dni;
        this.nombrecompleto = nombrecompleto;
        this.fecha = fecha;
        this.provincia = provincia;
        this.direccion = direccion;
        this.codigopostal = codigopostal;
    }
    
    public Persona(String dni, String nombre, String apellido1, String apellido2, Calendar fechan, String provincia, String direccion, int codigopostal){
        this.dni = dni;
        this.nombrecompleto = nombre;
        this.nombrecompleto = apellido1;
        this.nombrecompleto = apellido2;
        this.fecha = fechan;
        this.provincia = provincia;
        this.direccion = direccion;
        this.codigopostal = codigopostal;
    }
    
    public Persona(String dni, String nombre, String apellidos, Calendar fecha, String provincia, String direccion, int codigopostal){
        this.dni = dni;
        this.nombrecompleto = nombre;
        this.nombrecompleto = apellidos;
        this.fecha = fecha;
        this.provincia = provincia;
        this.direccion = direccion;
        this.codigopostal = codigopostal;
    }
    
    public Persona(String dni, String nombre, String apellido1, String apellido2, String fecha, String provincia, String direccion, int codigopostal){
        this.dni= dni;
        this.nombrecompleto = nombre;
        this.nombrecompleto = apellido1;
        this.nombrecompleto = apellido2;
        this.provincia = provincia;
        this.direccion = direccion;
        this.codigopostal = codigopostal;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            cal.setTime(sdf.parse(fecha));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getDNI() {
        return dni;
    }
    
    public String getNombrecompleto() {
        return nombrecompleto;
    }
    
    public String getFecha() {
        
    }
    public static void main(String[] args) {
        
    }
}