

package proyecto;

import DAO.Conexion;


public class Proyecto{


    public static void main(String[] args) {
        
        //comentario de prueba
        Conexion n= new Conexion();
        try{n.conexionOpen();
        }    catch(Exception e){
            System.out.println(e);
        }
    }
    
}
