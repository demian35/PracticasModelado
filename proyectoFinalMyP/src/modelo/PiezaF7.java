/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/
package modelo;

// Clase que representa una pieza f7 para la maquina 1
public class PiezaF7 extends Pieza{

     //constructor de la pieza F7 recibe como parametro el nombre @param String Nombre
    public PiezaF7() {
        super("PiezaF7");
    }

     //metodo sobrecargado de la clase Pieza 
    //mostramos los detalles de la pieza F7
    @Override
    public void mostrarDetalles() {
        System.out.println("Pieza: " + nombre + ", Longitud: 2, Ancho: 6");
    }
    
}
