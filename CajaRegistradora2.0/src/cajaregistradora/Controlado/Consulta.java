/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajaregistradora.Controlado;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import cajaregistradora.Modelo.Producto;
import cajaregistradora.Modelo.Cliente;
import cajaregistradora.Modelo.CuponDescuento;
/**
 *
 * @author Felipe
 */
public class Consulta {
    
    
    
    cajaregistradora.Controlado.Controler mysql = new cajaregistradora.Controlado.Controler();
    
    Connection cn = mysql.conectar();
    
    private String sSQL = "";
    public Integer totalRegistros; /*mide cantidad de registros*/
      
    
    
    public DefaultTableModel mostrarProducto(String buscar) {

        DefaultTableModel modelo;

        String[] titulos
                = {"Codigo", "Descripcion",
                    "Valor", "CantInventario"};

        String[] registros = new String[4];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT * FROM `producto` WHERE `CodigoProducto` LIKE '%" + buscar +"%'" ;
                
                
                
        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("codigoProducto");
                registros[1] = rs.getString("descripcion");
                registros[2] = rs.getString("valor");
                registros[3] = rs.getString("cntinventario");
                

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
  
        
    }
    
    
    
    public Producto verificarproducto (int cod) {
        
        String buscar=cod+"";
          
        
String[] titulos
                = {"Codigo", "Descripcion",
                    "Valor", "CantInventario"};
                
        String[] registros = new String[4];
        totalRegistros = 0;
        
                sSQL = "SELECT * FROM `producto` WHERE `CodigoProducto` LIKE " + buscar  ;
        
                
                
        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("codigoProducto");
                registros[1] = rs.getString("descripcion");
                registros[2] = rs.getString("valor");
                registros[3] = rs.getString("cntinventario");
                

                totalRegistros = totalRegistros + 1;
                
            }
            Producto obj =new Producto(Integer.parseInt(registros[0]),registros[1],Integer.parseInt(registros[2]),Integer.parseInt(registros[3]));
            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            
            return null;
        }
  
        
        
        
                
        }
        
        
public Cliente verificaCliente (String rut) {      
        
String[] titulos
                = {"Nombre", "Rut",
                    "Descuento",};
                
        String[] registros = new String[3];
        totalRegistros = 0;
        
                sSQL = "SELECT * FROM `cliente` WHERE `rut` LIKE " + rut  ;     
                
                
        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("Nombre");
                registros[1] = rs.getString("Rut");
                registros[2] = rs.getString("Descuento");
               
                

                totalRegistros = totalRegistros + 1;
                
            }
            Cliente cli=new Cliente(registros[0],registros[1],Integer.parseInt(registros[2]));
            return cli;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
            
            return null;
        }
  
        
}
    
  public CuponDescuento verificaCupon (String codigo) {      
        
String[] titulos
                = {"CodigoCupon", "Codigoproducto",
                    "DescuentoCupon",};
                
        String[] registros = new String[3];
        totalRegistros = 0;
        
                sSQL = "SELECT * FROM `cupon` WHERE `CodigoCupon` LIKE " + codigo  ;     
                
                
        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("CodigoCupon");
                registros[1] = rs.getString("Codigoproducto");
                registros[2] = rs.getString("DescuentoCupon");
               
                

                totalRegistros = totalRegistros + 1;
                
            }
            
            CuponDescuento cpo = new CuponDescuento(Integer.parseInt(registros[0]),Integer.parseInt(registros[1]),Integer.parseInt(registros[2]));
            return cpo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cupon no encontrado");
            
            return null;
        }
  
        
}  
    
    
    
      
        
    
    
    
}

    
    
    
    
    
    
