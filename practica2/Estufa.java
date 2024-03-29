package practica2;

import java.util.ArrayList;

public class Estufa {
    

    private ArrayList<Preparable> alimentos;
    private boolean brazaPrendida;

    public Estufa(){
        alimentos= new ArrayList<>();
    }

    //Metodo que coloca los alimentos a calentar en la estufa y que los retira 
    //recibimos como parametro un alimento preparable y una string que indica si un alimento esta en preparacion
    //o ya esta listo
    public boolean actualizaParrillas(Preparable comida , String enPreparacion){
        switch(enPreparacion){
            case "Prepara":
                alimentos.add(comida);
                break;
            case "Comida Lista":
                if(alimentos.contains(comida)){
                    int index =alimentos.indexOf(comida);
                    if(index != -1){
                        alimentos.remove(index);
                        return true;
                    }
                }
                break;
        }
        return false;

    }

    //metodo que asigna temperatura a cada parrilla de la estufa
    public void calientaComida(){
        for(Preparable preparable: alimentos){
            preparable.preparaAlimento(90);
        }
    }

    //metodo que consultara si la estifa este encendida o apagada
    public boolean estadoEstufa(String estado){
        switch(estado){
            case("Braza encendida"):
                if(brazaPrendida){
                    return false;
                }else{
                    brazaPrendida=true;
                    return true;
                }
            case("Braza apagada"):
                if(brazaPrendida){
                    brazaPrendida=false;
                    return true;
                }else{
                    return false;
                }
        }
        return false;
    }
}
