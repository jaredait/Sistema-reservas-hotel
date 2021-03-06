package cliente_PCK;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    private ClienteMD clientemd;
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private String email;
    
    // Constructores sobrecargados
    public Cliente(){
        try {
            clientemd = new ClienteMD(this);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public Cliente(String cedula, String nombre, String apellido, int edad, int telefono, String email){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
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
    // metodos que se comunican con ClienteMD
    public boolean verificarExisteDP() throws SQLException{
        return clientemd.verificarExisteMD();
    }

    public void insertarDP() {
        clientemd.insertar();
    }

    public void consultarDP() throws SQLException {
        clientemd.consultar();
    }

    public void modificarDP() {
        clientemd.modificar();
    }

    public void eliminarDP() {
        clientemd.eliminar();
    }

    public Cliente[] consultarTodosDP() throws SQLException {
        return clientemd.consultarTodos();
    }


}
