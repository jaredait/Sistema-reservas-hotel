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
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consultarMD() {
        Habitacion[] habitaciones = consutltarTodasMD();
        for (Habitacion temp : habitaciones) {
            if (habitaciondp.getCodigo().equals(temp.getCodigo())) {
                habitaciondp.setTipo(temp.getTipo());
                habitaciondp.setCapacidad(temp.getCapacidad());
                habitaciondp.setEstado(temp.getEstado());
            }
        }
    }

    public void modificarMD() {
                try {
            PreparedStatement st = conn.prepareStatement("UPDATE Habitacion SET tipo=?, capacidad=?, estado=? where codigo=?");
            st.setString(1, habitaciondp.getTipo());
            st.setInt(2, habitaciondp.getCapacidad());
            st.setString(3, habitaciondp.getEstado());
            st.setString(4, habitaciondp.getCodigo());
            
            int a = st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(HabitacionMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarMD() {
        try {
            PreparedStatement st = conn.prepareStatement("DELETE FROM Habitacion WHERE codigo=?");
            st.setString(1, habitaciondp.getCodigo());
            int a = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // verifica si la habitacion existe en la db mediante la consulta del codigo de habitacion
    public boolean verificarExisteMD() {
        boolean habitacionExiste = false;

        cadena = "SELECT codigo FROM habitacion";
        try {
            result = stmt.executeQuery(cadena);
            while (result.next()) {
                if (habitaciondp.getCodigo().equals(result.getString("codigo"))) {
                    habitacionExiste = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return habitacionExiste;
    }

    public Habitacion[] consutltarTodasMD() {
        int count = 0;
        Habitacion[] habitaciones = null;
        try {
            // obtener el numero de filas para dimensionar el arreglo de retorno  
            cadena = "SELECT COUNT(*) AS rowcount FROM HABITACION";
            stmt = conn.createStatement();
            result = stmt.executeQuery(cadena);
            result.next();
            count = result.getInt("rowcount");

            habitaciones = new Habitacion[count];

            cadena = "SELECT codigo, tipo, capacidad, estado FROM Habitacion";
            result = stmt.executeQuery(cadena);
            int i = 0;
            while (result.next()) {
                String codigo = result.getString("codigo");
                String tipo = result.getString("tipo");
                int capacidad = result.getInt("capacidad");
                String estado = result.getString("estado");
                habitaciones[i] = new Habitacion(codigo, tipo, capacidad, estado);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return habitaciones;
    }

}
