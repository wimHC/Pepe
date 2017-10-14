// DE ESTA CLASE HEREDARA CUPON DE DESCUENTO
package cajaregistradora.Modelo;





public class Producto {

    private int codigo;
    private String descripcion;
    private int valor;
    private int cantidadInv;

    public Producto(int codigo, String descripcion, int valor, int cantidadInv) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.valor = valor;
        this.cantidadInv = cantidadInv;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidadInv() {
        return cantidadInv;
    }

    public void setCantidadInv(int cantidadInv) {
        this.cantidadInv = cantidadInv;
    }
    
    

}