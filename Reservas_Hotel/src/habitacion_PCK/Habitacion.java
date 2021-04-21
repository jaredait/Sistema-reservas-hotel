
package habitacion_PCK;

public class Habitacion {
    private HabitacionMD habitacionmd;
    public String codigo;
    public String tipo;
    public int capacidad;
    
    // constructor
    public Habitacion(String codigo, String tipo, int capacidad){
        this.codigo = codigo;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }
    public Habitacion(){
        habitacionmd = new HabitacionMD(this);
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
    public boolean verificarDP(){
        
    return false;
    }
    
     public boolean verificarExisteDP(){
        return habitacionmd.verificarExisteMD();
    }

    public void insertarDP() {
        habitacionmd.insertarMD();
    }

    public void consultarDP() {
        habitacionmd.consultarMD();
    }

    public void modificarDP() {
        habitacionmd.modificarMD();
    }

    public void eliminarDP() {
        habitacionmd.eliminarMD();
    }

    public Habitacion[] consultarTodosDP() {
        return habitacionmd.consutltarTodasMD();
    }
}
