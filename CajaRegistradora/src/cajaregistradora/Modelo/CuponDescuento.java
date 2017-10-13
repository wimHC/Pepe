
package cajaregistradora.Modelo;

public class CuponDescuento {
    
    private int CodigoCupon;
    private int CodigoProducto;
    private int Descuento;

    public CuponDescuento(int CodigoCupon, int CodigoProducto, int Descuento) {
        this.CodigoCupon = CodigoCupon;
        this.CodigoProducto = CodigoProducto;
        this.Descuento = Descuento;
    }

    public int getCodigoCupon() {
        return CodigoCupon;
    }

    public void setCodigoCupon(int CodigoCupon) {
        this.CodigoCupon = CodigoCupon;
    }

    public int getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }

    
    
}
