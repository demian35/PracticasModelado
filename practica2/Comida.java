package practica2;
public class Comida implements Preparable {

    private float temp;

    public Comida(float temperaturaInicial){
        temp=temperaturaInicial;
    }

    @Override
    public void preparaAlimento(float temp) {
        this.temp += temp;
    }


}
