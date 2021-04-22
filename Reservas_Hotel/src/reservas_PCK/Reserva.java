package reservas_PCK;

import java.time.LocalDateTime;
import java.util.ArrayList;
import habitacion_PCK.*;
import cliente_PCK.*;

public class Reserva {

    // atributos
    private String codigo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private ArrayList<Habitacion> habitaciones;
    private Cliente cliente;
    private Habitacion habitacionAux;
    //private ReservaMD reservamd;

    // constructor
    public Reserva() {
        //reservam = new ReservaMD(this);
    }

    // metodos
    public void setCodigo() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;

    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean verificarExisteDP() {
        return false;
    }

    public void insertarDP() {

    }

    public void consultarDP() {

    }

    public void modificarDP() {

    }
    
    public void eliminarDP(){
        
    }
}
