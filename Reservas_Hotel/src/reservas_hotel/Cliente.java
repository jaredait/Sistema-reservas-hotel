/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservas_hotel;

/**
 *
 * @author ASUS
 */
public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    
    // Constructor
    public Cliente(String cedula, String nombre, String apellido, int edad){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    // Metodos DP
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public String getCedula(){
        return this.cedula;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    // Escribir verificaciones de cedula y de edad
    public boolean verificarDP(){
        
        return false;
    }
    // Escribir sentencia que llame a insertarMD
    public void guardarDP(){
        
    }
}
