package capitulo9;

// prueba de que se procesan objetos de Factura y Empleado mediante polimorfismo
public class PruebaInterfazPorPagar {


    public static void main(String[] args) {

        PorPagar[] objetosPorPagar = new PorPagar[4];

        objetosPorPagar[0] = new Factura("01234","Asiento", 2,375.00);
        objetosPorPagar[1] = new Factura("56789","Llanta", 4,79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("May","Vega","111-1111-11", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Mayrita","Beristain","888-8888-88", 1200.00);


        System.out.println("*************** Factura y empleados procesados de forma polimórfica *************************");

        for (PorPagar porPagarActual : objetosPorPagar){

            System.out.println("---" + porPagarActual.toString() + " -Pago vencido: " + porPagarActual.obtenerMontoPago() );

        }


    }





}
