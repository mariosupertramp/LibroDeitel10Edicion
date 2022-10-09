package capitulo8;

public class PruebaTiempo {


    public static void main(String[] args) {

        Tiempo1 tiempo = new Tiempo1();

        mostrarTiempo("Despues de crear el objeto tiempo", tiempo);
        System.out.println();

        tiempo.establecerTiempo(13,27,6);
        mostrarTiempo("Despues de establecer tiempo:", tiempo);
        System.out.println();

        try{
            tiempo.establecerTiempo(99,99,99);
        } catch (IllegalArgumentException e)

        {
            System.out.printf("Excepcion: %s%n%n", e.getMessage());
        }

        mostrarTiempo("Despues de llamar a establecerTiempo con valores invalidos", tiempo);

       }

    private static void mostrarTiempo(String encabezado, Tiempo1 t)
    {
        System.out.printf("%s%nTiempo universal: %s%nTiempo estandar: %s%n", encabezado, t.aStringUniversal(), t.toString());
    }





}
