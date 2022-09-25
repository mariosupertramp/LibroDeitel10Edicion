package capitulo9;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{

    private double salarioBase;
 // marioootee
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {

        // Llamada explícita al constructor de la superclase EmpleadoPorComision
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);


        if(salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");

        this.salarioBase = salarioBase;
    }


    public void setSalarioBase(double salarioBase){

        if(salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    @Override
    public double obtenerMontoPago(){
        return getSalarioBase() + super.obtenerMontoPago();
    }


    @Override
    public String toString() {
        return "EmpleadoBaseMasComision: "+ super.toString() + " ----- Sueldo Base: " + getSalarioBase();
    }



}
