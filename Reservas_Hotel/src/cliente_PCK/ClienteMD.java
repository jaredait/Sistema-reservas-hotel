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
            System.out.println("INSERTAR CLIENTE EXITOSO");

        } catch (SQLException ex) {
            System.out.println("INSERTAR CLIENTE FALLIDO");
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consultar() {

    }

    public void modificar() {

    }

    public void eliminar() {

    }

    public boolean verificarExisteMD() throws SQLException {
        boolean clienteExiste = false;

        cadena = "select cedula from CLIENTE";
        // intentar encontrar el numero de cedula en la tabla
        try {
            result = stmt.executeQuery(cadena);
            while(result.next()){
                String res = result.getString("cedula");
                if(clientedp.getCedula().equals(res))
                    clienteExiste = true;
            }
        } catch (Exception ex) {
            System.out.println("NO HAY ELEMENTOS EN LA TABLA CLIENTE");
            ex.printStackTrace();
        }
        return clienteExiste;
    }

    public Cliente[] consultarTodos() {

        return new Cliente[0];
    }
}
