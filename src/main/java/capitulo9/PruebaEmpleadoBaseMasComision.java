package capitulo9;

public class PruebaEmpleadoBaseMasComision {


    public static void main(String[] args) {


        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Bob", "Lewis", "333-333-33333", 5000, .04, 300);

        System.out.println("El primer nombre es:" + empleado.getPrimerNombre());
        System.out.println("El apellido paterno es: "+ empleado.getApellidoPaterno());
        System.out.println("el numero de SS es: "+ empleado.getNumeroSeguroSocial());
        System.out.println("Las ventas brutas son: " + empleado.getVentasBrutas());
        System.out.println("La tarifa de comision es:" + empleado.getTarifaComision());
        System.out.println("El salario base es: " + empleado.getSalarioBase());


        System.out.println("********************************************************************");

        empleado.setSalarioBase(1000);

        System.out.println("Información actualizada del empleado , obtenida por toString" + empleado);


    }





}
