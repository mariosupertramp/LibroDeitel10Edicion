package capitulo9;

public class EmpleadoPorComision extends Empleado{

    private double ventasBrutas;
    private double tarifaComision;


    //constructor con 5 argumentos
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas , double tarifaComision) {

        super(primerNombre,apellidoPaterno,numeroSeguroSocial);

        if(tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException( "La tarifa de comision debe ser > 0.0 y < 1.0");

        if(ventasBrutas < 0.0)
            throw new IllegalArgumentException( "Las ventas deben ser mayor a 0.0");

        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }


    public void setVentasBrutas(double ventasBrutas) {

        if(ventasBrutas <= 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        this.ventasBrutas = ventasBrutas;
    }

    public double getVentasBrutas(){
        return ventasBrutas;
    }

    public void setTarifacomision(double tarifaComision){

        if(tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException( "La tarifa de comision debe ser > 0.0 y < 1.0");

        this.tarifaComision = tarifaComision;
    }

    public double getTarifaComision(){

        return tarifaComision;
    }


    // Calcula los ingresos

    @Override
    public double obtenerMontoPago(){
        return getTarifaComision() * getVentasBrutas();
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision{" + super.toString() +
                ", ventasBrutas=" + getVentasBrutas() +
                ", tarifaComision=" + getTarifaComision() +
                '}';
    }



}