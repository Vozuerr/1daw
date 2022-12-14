/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author scasal
 */
public class Perro {

    private String nombrep;
    private String raza;
    private String chip;
    private int edad;
    private Persona dueño;
    private boolean pelo;
    private double tamaño;

    public Perro(String nombrep, String raza, String chip, Persona dueño, boolean pelo, double tamaño) {
        this.nombrep = nombrep;
        this.raza = raza;
        this.chip = chip;
        this.dueño = dueño;
        this.pelo = pelo;
        this.tamaño = tamaño;
        this.edad = 0;
    }
    
    public String getNombrep() {
        return nombrep;
    }
    
    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }
    
    public String getChip() {
        return chip;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public int getEdad() {
        return edad;
    }

    public double getTamaño() {
        return tamaño;
    }
    
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    
    public Persona getDueño() {
        return dueño;
    }
  
    public boolean getPelo() {
        return pelo;
    }
    
    public static void ladrar(){
        System.out.println("Guau");
    }
}
