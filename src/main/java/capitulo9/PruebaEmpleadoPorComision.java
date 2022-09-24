package capitulo9;

public class PruebaEmpleadoPorComision {

    public static void main(String[] args) {

 EmpleadoPorComision empleado = new EmpleadoPorComision("Mario","Hernandez", "222-22-2222", 10000, .06);

        System.out.println("El primer nombre es:" + empleado.getPrimerNombre());
        System.out.println("El apellido paterno es: "+ empleado.getApellidoPaterno());
        System.out.println("el numero de SS es: "+ empleado.getNumeroSeguroSocial());
        System.out.println("Las ventas brutas son: " + empleado.getVentasBrutas());
        System.out.println("La tarifa de comision es:" + empleado.getTarifaComision());


        System.out.println("--------------------------------------------------------------------");

        empleado.setVentasBrutas(500);
        empleado.setTarifacomision(.1);


        System.out.println("Información actualizada del empleado , obtenida por toString" + empleado);


    }




}
