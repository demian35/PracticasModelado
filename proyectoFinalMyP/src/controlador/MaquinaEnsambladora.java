/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/


package controlador;


// Implementación de la Máquina Ensambladora extiende de IMaquina
public class MaquinaEnsambladora extends IMaquina {
    //constructor de la MAquina ensambladora
    public MaquinaEnsambladora() {
        super("Máquina Ensambladora");
    }

    //Metodo sobrecargado de la clase Imaquina
    //enciende la maquina
    @Override
    public void encender() {
        System.out.println("Encendiendo Máquina Ensambladora...");
    }

    //Metodo sobrecargado de la clase Imaquina
    //Ensambla un par de piezas
    @Override
    public void producirPiezas() {
        // Lógica de ensamblaje de piezas
        FabricaControler fabrica = FabricaControler.getInstance();
        fabrica.ensamblarPiezas();
    }
}

