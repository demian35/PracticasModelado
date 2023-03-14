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
            case "Comida_Lista":
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




}
