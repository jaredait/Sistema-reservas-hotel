/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_PCK;

/**
 *
 * @author ASUS
 */
public class Cliente {
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private String email;
    
    // Constructores sobrecargados
    public Cliente(int cedula, String nombre, String apellido, int edad){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Cliente(){}
    
    // Metodos DP
    public void setCedula(int cedula){
        this.cedula = cedula;
    }
    public int getCedula(){
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
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}
