package reservas_PCK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReservaMD {

    private Reserva reserva;
    private Connection conn;
    private Statement stmt;
    private ResultSet result;
    private String cadena;

    // constructor
    public ReservaMD(Reserva reserva) {
        this.reserva = reserva;

        // leer el archivo derby.properties
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("src/sql/dbderby.properties"));
            String midburl = props.getProperty("dburl");

            // conexion a la db
            DriverManager.deregisterDriver(new org.apache.derby.jdbc.ClientDriver());
            conn = DriverManager.getConnection(midburl);
            stmt = conn.createStatement();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReservaMD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(ReservaMD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void insertar() {
        try {   // crear primero la consulta de rows de la tabla reserva y crear un secuencial para el codigo en el dp
            PreparedStatement st = conn.prepareStatement("INSERT INTO Reserva (codigo, fechaInicio, fechaFin, habitacion, cedulaCliente) values(?,?,?,?,?)");
            st.setString(1, reserva.getCodigo());
            st.setDate(2, new java.sql.Date(reserva.getFechaInicio().getTime()));
            st.setDate(3, new java.sql.Date(reserva.getFechaFin().getTime()));
            st.setString(4, reserva.getHabitacion().getCodigo());
            st.setString(5, reserva.getCliente().getCedula());
            int a = st.executeUpdate();
            System.out.println("INSERTAR RESERVA EXITOSO");

        } catch (SQLException ex) {
            System.out.println("INSERTAR RESERVA FALLIDO");
            Logger.getLogger(ReservaMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consultar() {
        // agregar codigo aqui para cargar la reserva al objeto dp
        Reserva[] reservas = consultarTodas();
        for(Reserva res : reservas){
            if(res.getCodigo().equals(reserva.getCodigo())){
                reserva.setCodigo(res.getCodigo());
                reserva.setFechaInicio(res.getFechaInicio());
                reserva.setFechaFin(res.getFechaFin());
                reserva.setCliente(res.getCliente());
                reserva.setHabitacion(res.getHabitacion());                
            }
        }
    }

    public void modificar() {
        try {
            PreparedStatement st = conn.prepareStatement("UPDATE Reserva SET fechaInicio=?, fechaFin=?, habitacion=?, cedulaCliente=? WHERE codigo=?");
            st.setDate(1, new java.sql.Date(reserva.getFechaInicio().getTime()));
            st.setDate(2, new java.sql.Date(reserva.getFechaFin().getTime()));
            st.setString(3, reserva.getHabitacion().getCodigo());
            st.setString(4, reserva.getCliente().getCedula());
            st.setString(5, reserva.getCodigo());    
            int a = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void eliminar() {

    }

    public boolean verificarExisteMD() {
        boolean reservaExiste = false;

        cadena = "SELECT codigo FROM Reserva";
        try {
            result = stmt.executeQuery(cadena);
            while (result.next()) {
                if (reserva.getCodigo().equals(result.getString("codigo"))) {
                    reservaExiste = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservaMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reservaExiste;
    }

    public Reserva[] consultarTodas() {
        Reserva[] reservas = new Reserva[consultarLongitud()];
        cadena = "SELECT codigo, fechaInicio, fechaFin, habitacion, cedulaCliente FROM Reserva";
        try {
            result = stmt.executeQuery(cadena);
            stmt = conn.createStatement();
            int i = 0;
            while (result.next()) {
                String codigo = result.getString("codigo");
                Date fechaInicio = result.getDate("fechaInicio");
                Date fechaFin = result.getDate("fechaFin");
                String habitacion = result.getString("habitacion");
                String cedula = result.getString("cedulaCliente");
                reservas[i] = new Reserva(codigo, fechaInicio, fechaFin, habitacion, cedula);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservaMD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return reservas;
    }

    public int consultarLongitud() {
        cadena = "SELECT COUNT(*) AS rowcount FROM Reserva";
        try {
            stmt = conn.createStatement();
            result = stmt.executeQuery(cadena);
            result.next();
            int count = result.getInt("rowcount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(ReservaMD.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }

}
