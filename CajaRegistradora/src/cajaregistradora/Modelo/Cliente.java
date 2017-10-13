
package cajaregistradora.Modelo;

public class Cliente {
    private String Nombre;
    private String RUT;
    private int DescuentoCliente;

    public Cliente(String Nombre, String RUT, int DescuentoCliente) {
        this.Nombre = Nombre;
        this.RUT = RUT;
        this.DescuentoCliente = DescuentoCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public int getDescuentoCliente() {
        return DescuentoCliente;
    }

    public void setDescuentoCliente(int DescuentoCliente) {
        this.DescuentoCliente = DescuentoCliente;
    }
    
    
    
    
    
}
