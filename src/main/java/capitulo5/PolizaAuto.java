package capitulo5;

public class PolizaAuto {

    private int numeroCuenta;
    private String marcaYModelo;
    private String estado;

    //Constructor
    PolizaAuto(int numeroCuenta, String marcaYModelo, String estado){
        this.numeroCuenta = numeroCuenta;
        this.marcaYModelo = marcaYModelo;
        this.estado = estado;
    }

    //  **** getters y setters *****

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getMarcaYModelo() {
        return marcaYModelo;
    }

    public void setMarcaYModelo(String marcaYModelo) {
        this.marcaYModelo = marcaYModelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // *************************

    // Método predicado que devuelve si el estado tiene seguro sin culpa
    public boolean esEstadoSinCulpa(){

        boolean estadoSinCulpa;

        switch (getEstado()){
            case "MA": case "NY": case "PA": case "NJ":
             estadoSinCulpa = true;
             break;

            default:
                estadoSinCulpa = false;
                break;
        }
        return estadoSinCulpa;
    }

}
