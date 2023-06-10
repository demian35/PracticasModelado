/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/

package modelo;
// Implementaciones de las piezas para la Máquina 3
public class Pieza3B extends Pieza {

    //constructor de la pieza 3B recibe como parametro el nombre @param String Nombre
    public Pieza3B() {
        super("Pieza3B");
    }
     //metodo sobrecargado de la clase Pieza 
    //mostramos los detalles de la pieza 3B
    @Override
    public void mostrarDetalles() {
        System.out.println("Pieza: " + nombre + ", Capacidad: 10");
    }
}
