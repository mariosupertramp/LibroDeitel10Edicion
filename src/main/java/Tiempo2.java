public class Tiempo2 {

    private int hora;
    private int minuto;
    private int segundo;

    // Constructor sin argumentos
    public Tiempo2(){
        this(0,0,0); // Mando a traer el constructor de 3 argumentos
     }

    //Constructor se suministra solo 1 argumento de hora
    public Tiempo2(int hora){
         this(hora, 0, 0);
        }

    //Constructor se suministra solo 2 argumentos de hora y minuto
    public Tiempo2(int hora, int minuto){
        this(hora, minuto,0);
    }


    //Constructor con 3 argumentos
     public Tiempo2(int hora, int minuto, int segundo){

         if(hora < 0 || hora >= 24){
             throw new IllegalArgumentException("HORA FUERA DE RANGO");
         }

         if(minuto < 0 || minuto >= 60){
             throw new IllegalArgumentException("MINUTO FUERA DE RANGO");
         }

         if(segundo < 0 || segundo >= 60 ){
             throw new IllegalArgumentException("SEGUNDO FUERA DE RANGO");
         }

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

     }


     //Constructor de tiempo2 que recibe otro objeto tiempo2
    public Tiempo2(Tiempo2 tiempo){

        this( tiempo.getHora(), tiempo.getMinuto(), tiempo.getSegundo() ); // invoco l constructor de 3 elementos

    }



     public void establecerTiempo(int hora, int minuto, int segundo){

         if(hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 || segundo < 0 || segundo >= 60 ){
             throw new IllegalArgumentException("FUERA DE RANGO");
         }

         this.hora = hora;
         this.minuto = minuto;
         this.segundo = segundo;
     }


     public void establecerHora(int hora){

         if(hora < 0 || hora >= 24){
             throw new IllegalArgumentException("FUERA DE RANGO LA HORA");
         }

         this.hora = hora;
     }


    public void establecerMinuto(int minuto){

        if(minuto < 0 || minuto >= 60){
            throw new IllegalArgumentException("FUERA DE RANGO EL MINUTO");
        }

        this.minuto = minuto;
    }


    public void establecerSegundo(int segundo){

        if(segundo < 0 || segundo >= 60){
            throw new IllegalArgumentException("FUERA DE RANGO EL SEGUNDO");
        }

        this.segundo = segundo;
    }



     // metodos get

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // convierte a String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal()
    {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

    // convierte a String en formato de hora estándar (H:MM:SS AM o PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s",
        ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12), getMinuto(), getSegundo(), (getHora() < 12 ? "AM" : "PM"));
    }




}
