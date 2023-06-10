/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/


package controlador;
import modelo.*;

// Implementación de la Máquina productora 2 extiende de IMaquina
public class MaquinaProductora2Controler extends IMaquina {

    //constructor de la Maquina 2
    public MaquinaProductora2Controler() {
        super("Máquina 2");
    }

    //Metodo sobrecargado de la clase Imaquina
    //enciende la maquina
    @Override
    public void encender() {
        System.out.println("Encendiendo Máquina 2...");
    }

    //Metodo sobrecargado de la clase Imaquina
    //Produce Piezas
    @Override
    public void producirPiezas() {
        // Lógica de producción de piezas de la Máquina 2
        PiezaLM piezaLM = new PiezaLM();
        FabricaControler.getInstance().agregarPiezaAlmacen(piezaLM);

        PiezaMK piezaMK = new PiezaMK();
        FabricaControler.getInstance().agregarPiezaAlmacen(piezaMK);

        PiezaPK piezaPK = new PiezaPK();
        FabricaControler.getInstance().agregarPiezaAlmacen(piezaPK);
    }
}