/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajaregistradora.Controlado;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;



public class Controler {
   
    /// conecxion bd
    
    public String db = "almac"; // comentar
    public String url = "jdbc:mysql://localhost/" + db;//3306
    public String user = "root";
    public String pass = "root";

    /*
    public String db = "u467116707_caja";
    public String url = "jdbc:mysql://sql58.hostinger.es/phpmyadmin/index.php?db=u467116707_caja&lang=es&token=da88022c088297c2a2b341447d1c23a8&phpMyAdmin=4d27f77a29e2ce2bb9c2f2a6f484dd369d20a59c:3306/" + db;//3306  7190
    public String user = "u467116707_pipe";
    public String pass = "felipe12345";
    
    */
    

 
    

    public Connection conectar() {
        Connection link = null;

        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            
            link = DriverManager.getConnection(this.url, this.user, this.pass);
                System.out.print("pase por aqui");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);

        }

        return link;
    }
    
    
   
    
    
    
    
    
    
}
