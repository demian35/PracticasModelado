package practica2.ReproductorDVD;

public class InterfazReproductorDVD {
    private ReproductorDVD reproductor;

    public InterfazReproductorDVD(){
        this.reproductor=reproductor;
    }

    public void inserteDisco(Reproducible archivo){
        reproductor.insertaDisco(archivo,"Inserta disco");
    }

    public void expulsaDisco(Reproducible archivo){
        reproductor.insertaDisco(archivo, "Expulsa");
    }

    public void dalePlay(){
        reproductor.estadoReproduccion("reproduciendo");
    }

    public void dalePause(){
        reproductor.estadoReproduccion("pausa");
    }
}
