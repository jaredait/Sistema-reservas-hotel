package reservas_PCK;

import java.time.LocalDateTime;
import java.util.ArrayList;
import habitacion_PCK.*;
import cliente_PCK.*;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public Reserva(String codigo, Date fechaInicio, Date fechaFin, String codigoH, String cedulaC){
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        
        habitacion.setCodigo(codigoH);
        habitacion.consultarDP();
        
        cliente.setCedula(cedulaC);
        try {
            cliente.consultarDP();
        } catch (SQLException ex) {
            Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
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
