package reservas_PCK;

import java.time.LocalDateTime;
import java.util.ArrayList;
import habitacion_PCK.*;
import cliente_PCK.*;
import java.util.Date;

public class Reserva {

    // atributos
    private String codigo;
    private Date fechaInicio;
    private Date fechaFin;
    private Cliente cliente;
    private Habitacion habitacion;
    private ReservaMD reservamd;

    // constructor
    public Reserva() {
        reservamd = new ReservaMD(this);
        cliente = new Cliente();
        habitacion = new Habitacion();
    }

    // metodos
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;

    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean verificarExisteDP() {
        return reservamd.verificarExisteMD();
    }

    public void insertarDP() {
        codigo = "R" + String.valueOf(reservamd.consultarLongitud());
        reservamd.insertar();
    }

    public void consultarDP() {
        reservamd.consultar();
    }

    public void modificarDP() {
        reservamd.modificar();
    }

    public void eliminarDP() {
        reservamd.eliminar();
    }

    public Reserva[] consultarTodas() {
        return reservamd.consultarTodas();
    }
}
