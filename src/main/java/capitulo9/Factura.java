package capitulo9;

public class Factura implements PorPagar{

    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;


    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {

        if(cantidad < 0)
            throw new IllegalArgumentException("Cantidad debe ser mayor o igual a 0");

        if(precioPorArticulo < 0.0)
            throw new IllegalArgumentException("El precio por articulo debe ser mayor a 0.0");

        this.cantidad = cantidad;
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.precioPorArticulo = precioPorArticulo;
    }



    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        if(cantidad < 0)
            throw new IllegalArgumentException("Cantidad debe ser mayor o igual a 0");
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        if(precioPorArticulo < 0.0)
            throw new IllegalArgumentException("El precio por articulo debe ser mayor a 0.0");
        this.precioPorArticulo = precioPorArticulo;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }


    @Override
    public String toString() {
        return "Factura{" +
                "numeroPieza='" + getNumeroPieza() + '\'' +
                ", descripcionPieza='" + getDescripcionPieza() + '\'' +
                ", cantidad=" + getCantidad() +
                ", precioPorArticulo=" + getPrecioPorArticulo() +
                '}';
    }



    // Método requerido para realizar el contrato con la interfaz PorPagar

    @Override
    public double obtenerMontoPago(){
        return getCantidad() * getPrecioPorArticulo(); //Calcula el costo total
    }


}
