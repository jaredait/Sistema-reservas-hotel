package cliente_PCK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.resources.cldr.uz.CalendarData_uz_Latn_UZ;

public class ClienteMD {

    private Cliente clientedp;
    private Connection conn;
    private Statement stmt;
    private ResultSet result;
    private String cadena;

    // constructor
    public ClienteMD(Cliente clientedp) throws FileNotFoundException, IOException, SQLException {
        this.clientedp = clientedp;
        // leer el archivo derby.properties
        Properties props = new Properties();
        props.load(new FileInputStream("src/sql/dbderby.properties"));
        String midburl = props.getProperty("dburl");

        // conexion a la db
        DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
        conn = DriverManager.getConnection(midburl);
        stmt = conn.createStatement();
    }

    public void insertar() {
        try {
            PreparedStatement st = conn.prepareStatement("insert into CLIENTE(cedula, nombre, apellido, edad, telefono, email)values(?,?,?,?,?,?)");
            st.setString(1, clientedp.getCedula());
            st.setString(2, clientedp.getNombre());
            st.setString(3, clientedp.getApellido());
            st.setInt(4, clientedp.getEdad());
            st.setInt(5, clientedp.getTelefono());
            st.setString(6, clientedp.getEmail());
            int a = st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consultar() throws SQLException {
        Cliente[] clientes = consultarTodos();

        for (Cliente temp : clientes) {
            if (clientedp.getCedula().equals(temp.getCedula())) {
                clientedp.setNombre(temp.getNombre());
                clientedp.setApellido(temp.getApellido());
                clientedp.setEdad(temp.getEdad());
                clientedp.setTelefono(temp.getTelefono());
                clientedp.setEmail(temp.getEmail());
            }
        }
    }

    public void modificar() {
        try {
            PreparedStatement st = conn.prepareStatement("UPDATE Cliente SET nombre=?, apellido=?, edad=?, telefono=?, email=? where cedula= ?");
            st.setString(1, clientedp.getNombre());
            st.setString(2, clientedp.getApellido());
            st.setInt(3, clientedp.getEdad());
            st.setInt(4, clientedp.getTelefono());
            st.setString(5, clientedp.getEmail());
            st.setString(6, clientedp.getCedula());
            int a = st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar() {
        try {
            PreparedStatement st = conn.prepareStatement("DELETE FROM Cliente WHERE cedula=?");
            st.setString(1, clientedp.getCedula());
            int a = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean verificarExisteMD() throws SQLException {
        boolean clienteExiste = false;

        cadena = "select cedula from CLIENTE";
        // intentar encontrar el numero de cedula en la tabla
        try {
            result = stmt.executeQuery(cadena);
            while (result.next()) {
                String res = result.getString("cedula");
                if (clientedp.getCedula().equals(res)) {
                    clienteExiste = true;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return clienteExiste;
    }

    public Cliente[] consultarTodos() throws SQLException {
        // obtener el numero de filas para dimensionar el arreglo de retorno
        stmt = conn.createStatement();
        result = stmt.executeQuery("SELECT COUNT(*) AS rowcount FROM CLIENTE");
        result.next();
        int count = result.getInt("rowcount");

        Cliente[] arrClientes = new Cliente[count];
        cadena = "select cedula, nombre, apellido, edad, telefono, email from CLIENTE";
        try {
            result = stmt.executeQuery(cadena);
            int i = 0;
            while (result.next()) {
                String cedula = result.getString("cedula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                int edad = result.getInt("edad");
                int telefono = result.getInt("telefono");
                String email = result.getString("email");
                arrClientes[i] = new Cliente(cedula, nombre, apellido, edad, telefono, email);
                i++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return arrClientes;
    }
}
