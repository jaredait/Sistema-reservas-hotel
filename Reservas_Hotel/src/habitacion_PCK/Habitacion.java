
package habitacion_PCK;

public class Habitacion {
    private HabitacionMD habitacionmd;
    private String codigo;
    private String tipo;
    private int capacidad;
    private String estado;
    
    // constructor
    public Habitacion(){
        habitacionmd = new HabitacionMD(this);
    }

    public Habitacion(String codigo, String tipo, int capacidad, String estado) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.estado = estado;
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
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    
    // metodos que se comunican con el MD
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
