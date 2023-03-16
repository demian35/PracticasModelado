package practica2.ReproductorDVD;

import java.util.ArrayList;

public class ReproductorDVD {
    
    private ArrayList<Reproducible> bandejadisc;
    private boolean play;
    private boolean pause;

    public ReproductorDVD(){
        bandejadisc= new ArrayList<>();
    }

    //metodo que inserta o espulsa los discos del reproductor
    public boolean insertaDisco(Reproducible disco ,String discoActual ){
        switch(discoActual){
            case("Inserta disco"):
                bandejadisc.add(disco);
            break;
            case("Expulsa"):
                if(bandejadisc.contains(discoActual)){
                    int index=bandejadisc.indexOf(discoActual);
                    if(index != -1){
                        bandejadisc.remove(index);
                        return true;
                    }
                }
            break;
        }
        return false;
    }

    //metodo que reproduce un disco
    public void reproduceDisco(){
        for(Reproducible reproducible: bandejadisc){
            reproducible.reproduceMultimedia("Reproduciendo disco");
        }
    }

    public boolean estadoReproduccion(String estado){
        switch(estado){
            case("reproduciendo"):
            if(play){
                return false;
            }else{
                play=true;
                return true;
            }
            case("pausa"):
                if(pause){
                    pause=false;
                    return true;
                }else{
                    play=false;
                    return false;
                }
        }
        return false;
    }
}
