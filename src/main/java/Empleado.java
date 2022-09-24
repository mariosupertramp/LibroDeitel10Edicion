public class Empleado {

    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;



    // Constructor para inicializar nombre, fecha de nacimiento y fecha de contratación
    public Empleado(String nombre, String apellido, Fecha fechaDeNacimiento,Fecha fechaDeContratacion){

        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaDeContratacion;
        this.fechaNacimiento = fechaDeNacimiento;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaContratacion=" + fechaContratacion +
                '}';
    }




}
