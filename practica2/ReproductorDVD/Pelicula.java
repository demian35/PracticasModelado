package practica2.ReproductorDVD;

public class Pelicula implements Reproducible {
    
    private String archivoMultimedia;

    public Pelicula(String archivoReproducible){
        archivoMultimedia  = archivoReproducible;
    }

    public void reproduceMultimedia(String archivoMultimedia){
        this.archivoMultimedia =archivoMultimedia;
    }
    
}
