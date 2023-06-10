/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/
package modelo;

// Clase que representa una FF para la maquina 1
public class PiezaFF extends Pieza {

     //constructor de la pieza FF recibe como parametro el nombre @param String Nombre
    public PiezaFF() {
        super("PiezaFF");
    }

     //metodo sobrecargado de la clase Pieza 
    //mostramos los detalles de la pieza FF
    @Override
    public void mostrarDetalles() {
        System.out.println("Pieza: " + nombre + ", Longitud: 3, Ancho: 7");
    }
    
}
