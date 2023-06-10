/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/


package modelo;

// Implementaciones de las piezas para la Máquina 3
public class PiezaAZ extends Pieza {

        //constructor de la pieza AZ recibe como parametro el nombre @param String Nombre
    public PiezaAZ() {
        super("PiezaAZ");
    }

     //metodo sobrecargado de la clase Pieza 
    //mostramos los detalles de la pieza AZ
    @Override
    public void mostrarDetalles() {
        System.out.println("Pieza: " + nombre + ", Capacidad: 5");
    }
}
