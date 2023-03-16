package practica2.ReproductorDVD;

public class Pelicula implements Reproducible {
    
    private int time;

    public Pelicula(int tiempoInicial){
        time  = tiempoInicial;
    }

    public void reproduceMultimedia(int time){
        this.time +=time;
    }
    
}
