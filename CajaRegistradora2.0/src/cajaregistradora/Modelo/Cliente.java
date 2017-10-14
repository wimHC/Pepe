
package cajaregistradora.Modelo;

public class Cliente {
    private String Nombre;
    private String Rut;
    private int DescuentoCliente;

    public Cliente(String Nombre, String Rut, int DescuentoCliente) {
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.DescuentoCliente = DescuentoCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public int getDescuentoCliente() {
        return DescuentoCliente;
    }

    public void setDescuentoCliente(int DescuentoCliente) {
        this.DescuentoCliente = DescuentoCliente;
    }
    
    
    
    
    
}
