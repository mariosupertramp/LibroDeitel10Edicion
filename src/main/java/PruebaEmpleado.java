public class PruebaEmpleado {

    public static void main(String[] args) {

        Fecha fnacimiento = new Fecha(7,24,1994);
        Fecha fcontratacion = new Fecha(3,12,1998);

        Empleado empleado1 = new Empleado("Mario", "Hernandez", fnacimiento, fcontratacion);

        //System.out.println(empleado1);


        Fecha fnacimiento2 = new Fecha(9,9,1999);
        Fecha fcontratacion2 = new Fecha(3,3,1982);

        Empleado empleado2 = new Empleado("Niza","Aguilar", fnacimiento2, fcontratacion2);


        System.out.println("Ahora voy a imprimir el empleado nizapa" + empleado2 + "**********************");



    }



}
