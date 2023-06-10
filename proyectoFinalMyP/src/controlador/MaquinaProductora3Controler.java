/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/

package controlador;
import modelo.*;

// Implementación de la Máquina productora 3 extiende de IMaquina
public class MaquinaProductora3Controler extends IMaquina {

     //constructor de la Maquina 3
    public MaquinaProductora3Controler() {
        super("Máquina 3");
    }

    //Metodo sobrecargado de la clase Imaquina
    //enciende la maquina
    @Override
    public void encender() {
        System.out.println("Encendiendo Máquina 3...");
    }

    //Metodo sobrecargado de la clase Imaquina
    //Produce Piezas
    @Override
    public void producirPiezas() {
        // Lógica de producción de piezas de la Máquina 3
        PiezaAZ piezaAZ = new PiezaAZ();
        FabricaControler.getInstance().agregarPiezaAlmacen(piezaAZ);

        PiezaF2 piezaF2 = new PiezaF2();
        FabricaControler.getInstance().agregarPiezaAlmacen(piezaF2);

        Pieza3B pieza3B = new Pieza3B();
        FabricaControler.getInstance().agregarPiezaAlmacen(pieza3B);
    }
}