import java.util.ArrayList;

public class Estufa {
    

    private ArrayList<Preparable> alimentos;
    private boolean brazaPrendida;

    public Estufa(){
        alimentos= new ArrayList<>();
    }

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
