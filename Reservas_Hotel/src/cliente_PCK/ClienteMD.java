package cliente_PCK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ClienteMD {
    private Cliente clientedp;
    private Connection conn;
    private Statement stmt;
    private RuleSet result;
    private String cadena;
    
    // constructor
    public ClienteMD(Cliente clientedp) throws FileNotFoundException, IOException, SQLException{
        this.clientedp = clientedp;
        // leer el archivo derby.properties
        Properties props = new Properties();
        props.load(new FileInputStream("src/squl/dbderby.properties"));
        String midburl = props.getProperty("dburl");
        
        // conexion a la db
        DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
        conn = DriverManager.getConnection(midburl);        
    }
    
    public void insertar(){
        
    }
    
    public void consultar(){
        
    }
    
    public void modificar(){
        
    }
    
    public void eliminar(){
        
    }
    
    public boolean verificarExisteMD(){
        
        return false;
    }
    
    public Cliente[] consultarTodos(){
        
        return new Cliente[0];
    }
}
