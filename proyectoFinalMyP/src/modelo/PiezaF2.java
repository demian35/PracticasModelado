/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/
package modelo;

// Clase que representa una pieza F2 para la maquina 3
public class PiezaF2 extends Pieza {

     //constructor de la pieza F2 recibe como parametro el nombre @param String Nombre
    public PiezaF2() {
        super("PiezaF2");
    }

     //metodo sobrecargado de la clase Pieza 
    //mostramos los detalles de la pieza F2
    @Override
    public void mostrarDetalles() {
        System.out.println("Pieza: " + nombre + ", Capacidad: 7");
    }
}
