
package Clases;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class Conectar {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/carpetasci";

    public Conectar() {
        conn = null;
        
         
            try {
            
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
            System.out.println("Conexion establecida");
            }
            
            }catch(Exception e){
            
                //System.out.println("Error al conectar " + e);
                //JOptionPane.showConfirmDialog(null,"Realmente decea Eliminar la carpeta \n","Confirmar",JOptionPane.ERROR_MESSAGE);
               JOptionPane.showMessageDialog(null,"No se ha podido conectar con la base de datos\nPor favor activar los servicios del XAMPP\nPuede seguir las instrucciones del manual de usuario","Conexion Fallida",JOptionPane.ERROR_MESSAGE);
               
               Manual form = new Manual();
                form.setVisible(true);
                form.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        
    }
    
    public Connection getConnection(){
        
        return conn;
    
    }
    
    public void desconectar(){
        conn = null;
        if(conn == null){
            System.out.println("Coneccion terminada.... " );
        }
    }
    
    
    
}
