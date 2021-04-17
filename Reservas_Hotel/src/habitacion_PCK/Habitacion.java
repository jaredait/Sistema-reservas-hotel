
package habitacion_PCK;

public class Habitacion {
    public String codigo;
    public String tipo;
    public int capacidad;
    
    // constructor
    public Habitacion(String codigo, String tipo, int capacidad){
        this.codigo = codigo;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }
    
    // metodos
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public Habitacion verificarDP(){
        
    }
}
