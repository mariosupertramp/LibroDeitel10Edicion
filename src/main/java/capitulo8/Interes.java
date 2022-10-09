// Uso de Bigdecimal para calculos precisos como en un sistema financiero y uso de numberFormat
package capitulo8;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interes {

    public static void main(String[] args) {

        // Monto inicial antes d elos intereses
        BigDecimal principal = BigDecimal.valueOf(100000.0);
        BigDecimal tasa = BigDecimal.valueOf(0.055); // Tasa de interés

        System.out.println("-----Anio" + " ------Monto del depósito");


        // Calcula el monto en deposito para cada uno de 10 años
        for (int anio = 1; anio <= 10 ; ++anio){

            BigDecimal monto = BigDecimal.ONE.multiply(tasa.add(BigDecimal.ONE).pow(anio));
            System.out.println(anio + "*****" + NumberFormat.getCurrencyInstance().format(monto));
        }
        }

    }

