/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajaregistradora;

import java.util.ArrayList;



/**
 *
 * @author alumno
 */
public class CajaRegistradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        ArrayList<cajaregistradora.Modelo.Producto> Lproductos = new ArrayList<cajaregistradora.Modelo.Producto>();
    ArrayList<cajaregistradora.Modelo.Producto> Linventario = new ArrayList<cajaregistradora.Modelo.Producto>();
    ArrayList<cajaregistradora.Modelo.Cliente> Lcliente = new ArrayList<cajaregistradora.Modelo.Cliente>();
    ArrayList<cajaregistradora.Modelo.CuponDescuento> Lcupon = new ArrayList<cajaregistradora.Modelo.CuponDescuento>();

   cajaregistradora.Controlado.Controler conexion = new cajaregistradora.Controlado.Controler();
   
   conexion.conectar();
   

                
               
        
        cajaregistradora.vista.Inicio vista =new cajaregistradora.vista.Inicio();
        vista.setVisible(true);


        // TODO code application logic here
    }
    
}
