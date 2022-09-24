package capitulo9;

public class PruebaPolimorfismo {


    public static void main(String[] args) {

        // Asigna la referencia a la superclase a una variable de la superclase
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Paloma","Aguilar","111-111-11111",1000, .06);

        // Asigna la referencia a la subclase a una variable de la subclase
        EmpleadoBaseMasComision empleadoBaseMasComision2 = new EmpleadoBaseMasComision("Azita","baby","8888-888-88", 5000, .04, 300);


        // Invoca a toString en un objeto de la superclase, usando una variable de la superclase
        System.out.println( empleadoPorComision.toString());

        // Invoca a toString en un objeto de la subclase, usando una variable de la subclase
        System.out.println(empleadoBaseMasComision2.toString());


        // Invoca a toString en un objeto de la subclase, usando una variable de la superclase
        EmpleadoPorComision empleadoPorComisionDos = empleadoBaseMasComision2;

        System.out.println(empleadoPorComisionDos.toString());


    }



}
