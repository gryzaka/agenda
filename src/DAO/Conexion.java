package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {  
    protected Connection conexion;
    final String DB_DRIVER="org.mariadb.jdbc.Driver";//org.postgresql.Driver
    final String DB_URL="jdbc:mariadb://localhost:3306/agenda2";//jdbc:postgresql://localhost:5432/Empleados 127.0.0.1
    final String DB_USER="root";
    final String DB_PASS="root";
    
    
   public void conexionOpen() throws Exception {
       try {
           Class.forName(DB_DRIVER);
           conexion=DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
           System.out.println("conexion lograda");
       }catch (Exception e) {  
           throw e;}
   }
   
   public void conexionClose() throws SQLException{
    if(conexion!=null){
        if(!conexion.isClosed()) //if(conexion.isClosed=true)
            conexion.close();
        }
     }
   }
      
       