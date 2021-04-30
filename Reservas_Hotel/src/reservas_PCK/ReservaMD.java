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

    }

    public void modificar() {

    }

    public void eliminar() {

    }

    public boolean verificarExisteMD() {
        return false;
    }

    public Reserva[] consultarTodas() {
        return new Reserva[0];
    }
    
    public int consultarLongitud(){
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
