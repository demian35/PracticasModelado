package practica2.ReproductorDVD;

public class InterfazReproductorDVD {
    private ReproductorDVD reproductor;

    public InterfazReproductorDVD(){
        this.reproductor=reproductor;
    }

    public boolean inserteDisco(Reproducible archivo){
       return reproductor.insertaDisco(archivo,"Inserta disco");
    }

    public boolean expulsaDisco(Reproducible archivo){
        return reproductor.insertaDisco(archivo, "Expulsa");
    }

    public boolean dalePlay(){
        return reproductor.estadoReproduccion("reproduciendo");
    }

    public boolean dalePause(){
       return reproductor.estadoReproduccion("pausa");
    }
}
