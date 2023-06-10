/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/
package modelo;

// Clase que representa una pieza PK para la maquina 2
public class PiezaPK extends Pieza {

     //constructor de la pieza PK recibe como parametro el nombre @param String Nombre
    public PiezaPK() {
        super("PiezaPK");
    }

     //metodo sobrecargado de la clase Pieza 
    //mostramos los detalles de la pieza PK
    @Override
    public void mostrarDetalles() {
        System.out.println("Pieza: " + nombre + ", Longitud: 3, Diámetro: 1.5");
    }
}
