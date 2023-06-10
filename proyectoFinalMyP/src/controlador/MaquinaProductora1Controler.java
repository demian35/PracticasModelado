/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/


package controlador;
import modelo.*;

// Implementación de la Máquina productora 1 extiende de IMaquina
public class MaquinaProductora1Controler extends IMaquina {

      //constructor de la Maquina 1
    public MaquinaProductora1Controler() {
        super("Máquina 1");
    }

    //Metodo sobrecargado de la clase Imaquina
    //enciende la maquina
    @Override
    public void encender() {
        System.out.println("Encendiendo Máquina 1...");
    }

    //Metodo sobrecargado de la clase Imaquina
    //Produce Piezas
    @Override
    public void producirPiezas() {
        // Lógica de producción de piezas de la Máquina 1
        PiezaA3 piezaA3 = new PiezaA3();
        FabricaControler.getInstance().agregarPiezaAlmacen(piezaA3);
        
        PiezaF7 piezaF7= new PiezaF7();
        FabricaControler.getInstance().agregarPiezaAlmacen(piezaF7);
        
        PiezaFF piezaFF = new PiezaFF();
        FabricaControler.getInstance().agregarPiezaAlmacen(piezaFF);

    }
}