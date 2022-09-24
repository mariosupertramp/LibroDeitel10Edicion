package capitulo9;

public abstract class Empleado implements PorPagar {

    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial){

        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }


    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "primerNombre='" + getPrimerNombre() + '\'' +
                ", apellidoPaterno='" + getApellidoPaterno() + '\'' +
                ", numeroSeguroSocial='" + getNumeroSeguroSocial() + '\'' +
                '}';
    }


    // **** comenté esto después de que esta clase implementara la interfaz Porpagar
     //Aquí no hay implementación, es abstracto
    //public abstract double ingresos();


}
