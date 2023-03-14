package practica2;

public class InterfazEstufa {
    private Estufa estufa;

    public InterfazEstufa(Estufa estufa){
        this.estufa=estufa;
    }

    public boolean calientaAlimento(Preparable comida){
        return estufa.actualizaParrillas(comida, "Prepara");
        
    }

    public boolean quitaAlimento(Preparable comida){
        return estufa.actualizaParrillas(comida,"Comida Lista" );
    }

    public boolean prendeBrasa(){
        return estufa.estadoEstufa("Braza encendida");
    }

    public boolean apagaBraza(){
        return estufa.estadoEstufa("Braza apagada");
    }

}
