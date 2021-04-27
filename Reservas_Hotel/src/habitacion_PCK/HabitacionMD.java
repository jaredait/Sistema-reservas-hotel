package habitacion_PCK;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

public class HabitacionMD {

    private Habitacion habitaciondp;
    private Connection conn;
    private Statement stmt;
    private ResultSet result;
    private String cadena;

    // constructor
    public HabitacionMD(Habitacion habitaciondp) {
        this.habitaciondp = habitaciondp;

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
            Logger.getLogger(VentanaHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(VentanaHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // metodos con sentencias sql
    public void insertarMD() {
        try {
            PreparedStatement st = conn.prepareStatement("INSERT INTO Habitacion(codigo, tipo, capacidad, estado)values(?,?,?,?)");
            st.setString(1, habitaciondp.getCodigo());
            st.setString(2, habitaciondp.getTipo());
            st.setInt(3, habitaciondp.getCapacidad());
            st.setString(4, habitaciondp.getEstado());
            int a = st.executeUpdate();
            System.out.println("INSERTAR HABITACION EXITOSO");
        } catch (SQLException ex) {
            System.out.println("INSERTAR HABITACION FALLIDO");
            Logger.getLogger(HabitacionMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consultarMD() {

    }

    public void modificarMD() {

    }

    public void eliminarMD() {

    }

    // verifica si la habitacion existe en la db mediante la consulta del codigo de habitacion
    public boolean verificarExisteMD() {

        return false;
    }

    public Habitacion[] consutltarTodasMD() {
        return new Habitacion[0];
    }

}
