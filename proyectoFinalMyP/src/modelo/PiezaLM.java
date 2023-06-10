/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/
package modelo;

// Clase que representa una pieza LM para la maquina 2
public class PiezaLM extends Pieza {

     //constructor de la pieza LM recibe como parametro el nombre @param String Nombre
    public PiezaLM() {
        super("PiezaLM");
    }

     //metodo sobrecargado de la clase Pieza 
    //mostramos los detalles de la pieza LM
    @Override
    public void mostrarDetalles() {
        System.out.println("Pieza: " + nombre + ", Longitud: 3, Diámetro: 1.1");
    }
}
