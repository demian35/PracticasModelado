/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/

package modelo;

// Clase que representa una pieza ensamblada
public class PiezaEnsamblada extends Pieza {
    private Pieza pieza1;
    private Pieza pieza2;

    //Constructor de la pieza ensamblada
    //recibe las dos piezas a ensamblar como parametro
    //@param Pieza pieza 1 @param Pieza pieza2
    public PiezaEnsamblada(Pieza pieza1, Pieza pieza2) {
        super(pieza1.nombre + pieza2.nombre);
        this.pieza1 = pieza1;
        this.pieza2 = pieza2;
    }
     //metodo sobrecargado de la clase Pieza 
    //mostramos los detalles de la pieza ya ensamblada
    @Override
    public void mostrarDetalles() {
        System.out.println("Pieza ensamblada: " + nombre);
        System.out.print("Piezas originales: ");
        pieza1.mostrarDetalles();
        pieza2.mostrarDetalles();
        System.out.println();
    }
}
