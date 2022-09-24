// Programa Java para demostrar el funcionamiento de la clase Scanner en Java
import java.util.Scanner;

public class Entradatexto
{
    public static void main(String args[])
    {
        // Usando Scanner para obtener información del usuarieeo
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("Usted ingresó la cadena: "+s);

        int a = in.nextInt();
        System.out.println("Usted ingresó un entero: "+a);

        float b = in.nextFloat();
        System.out.println("Usted ingresó un float: "+b);
    }
}