/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/
package modelo;

// Clase que representa una pieza MK para la maquina 2
public class PiezaMK extends Pieza {

     //constructor de la pieza MK recibe como parametro el nombre @param String Nombre
    public PiezaMK() {
        super("PiezaMK");
    }

     //metodo sobrecargado de la clase Pieza 
    //mostramos los detalles de la pieza MK
    @Override
    public void mostrarDetalles() {
        System.out.println("Pieza: " + nombre + ", Longitud: 3, Diámetro: 1.2");
    }
}
