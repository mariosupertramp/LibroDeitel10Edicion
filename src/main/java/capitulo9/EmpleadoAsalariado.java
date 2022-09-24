package capitulo9;

public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if(salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario debe se mayor a 0.0");

        this.salarioSemanal = salarioSemanal;
    }


    private void setSalarioSemanal(double salarioSemanal){

        if(salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario debe se mayor a 0.0");

        this.salarioSemanal = salarioSemanal;
    }


    public double getSalarioSemanal() {
        return salarioSemanal;
    }


    // Implementa el método de la interfaz PorPagar que era abstracto en la superclase Empleado (cambió el nombre de ingresos a PorPagar que es más generico para clases dispares)
    @Override
    public double obtenerMontoPago(){
        return getSalarioSemanal();
    }


    @Override
    public String toString() {
        return "EmpleadoAsalariado{" + super.toString() +
                "salarioSemanal=" + getSalarioSemanal() +
                '}';
    }



}
