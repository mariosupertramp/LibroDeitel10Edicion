package capitulo9;

public class PruebaSistemaNomina {


    public static void main(String[] args) {

EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("mario","hernandez","111-1111-11",800.00);
EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("pamola","Aguilar", "222-22222-222",16.75, 40);
EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Azita","Baby","333-333-333",10000,.06);
EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Nichapa","Yañez","444-4444-44",5000, .04, 300);

        System.out.println("++++++++++++ Empleados procesados por separado: ++++++++++++");

        System.out.println("Empleado Asalariado: " + empleadoAsalariado + "---Ingresos: "+ empleadoAsalariado.obtenerMontoPago());
        System.out.println("Empleado Por Horas: " + empleadoPorHoras + "---Ingresos: "+ empleadoPorHoras.obtenerMontoPago());
        System.out.println("Empleado Por Comisión: " + empleadoPorComision + "---Ingresos: "+ empleadoPorComision.obtenerMontoPago());
        System.out.println("Empleado Base Mas Comisión: " + empleadoBaseMasComision + "---Ingresos: "+ empleadoBaseMasComision.obtenerMontoPago());

        System.out.println("************************************************************************");
        System.out.println("************************************************************************");

        //Ahora creo un array de empleados de cuatro elementos

        Empleado[] empleados = new Empleado[4];

        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("++++++++++++ Empleados procesados de forma polimórfica: ++++++++++++");


        for(Empleado empleadoActual: empleados){

            System.out.println(empleadoActual);

            if(empleadoActual instanceof EmpleadoBaseMasComision){
            //Conversión descendente de la referencia de Empleado a una referencia de EmpleadoBaseMasComision
                    EmpleadoBaseMasComision empleaducho = (EmpleadoBaseMasComision) empleadoActual;
                    empleaducho.setSalarioBase(1.10 * empleaducho.getSalarioBase());
                    System.out.println("El nuevo salario base con el 10% de aumento es: "+ empleaducho.getSalarioBase());
            }

                System.out.println("Ingresos: "+ empleadoActual.obtenerMontoPago());
        }

         //Obtenemos el nombre del tipo de cada objeto en el arreglo de empleados

            for(int j = 0; j < empleados.length; j++){
                    System.out.println("El empleado"+ j +" es un: " + empleados[j].getClass().getName());
            }

    }


}
