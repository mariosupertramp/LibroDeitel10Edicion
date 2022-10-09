package capitulo5;

public class PruebaPolizaAuto {

    public static void main(String[] args) {

        PolizaAuto poliza1 = new PolizaAuto(1111,"ToyotaCamri","MA");
        PolizaAuto poliza2 = new PolizaAuto(2222,"MercedezBenz","VER");

        // muestra en pantalla si cada poliza está en un estado sin culpa
        polizaEnEstadoSinCulpa(poliza1);
        System.out.println("===================================================");
        System.out.println("===================================================");
        polizaEnEstadoSinCulpa(poliza2);

    }

    // Método que muestra en pantalla si una PolizaAuto
    // se encuentra en un estado con seguro de auto sin culpa

    public static void polizaEnEstadoSinCulpa(PolizaAuto poliza){

        System.out.println("La poliza de auto:");
        System.out.println("Cuenta:" + poliza.getNumeroCuenta());
        System.out.println("Marca y Modelo:" + poliza.getMarcaYModelo());
        System.out.println("Estado:"+ poliza.getEstado());

        if(poliza.esEstadoSinCulpa()){
            System.out.println(poliza.getEstado() + "---SI Es un estado sin culpa");
        }else{
            System.out.println(poliza.getEstado() + "---NO Es un estado sin culpa");
        }
    }

    

}
