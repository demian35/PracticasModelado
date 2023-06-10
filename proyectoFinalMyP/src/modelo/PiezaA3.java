/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/


package modelo;

// Implementaciones de las piezas para la Máquina 1
public class PiezaA3 extends Pieza {

    //constructor de la pieza A3 recibe como parametro el nombre @param String Nombre
    public PiezaA3() {
        super("PiezaA3");
    }
    //metodo sobrecargado de la clase Pieza 
    //mostramos los detalles de la pieza A3
    @Override
    public void mostrarDetalles() {
        System.out.println("Pieza: " + nombre + ", Longitud: 5, Ancho: 3");
    }
}
