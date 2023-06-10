/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/


package modelo;

/**
 * La clase pieza representa una pieza con distintos atributos como clave, longitud y ancho
 */
// Clase abstracta que representa una pieza
public abstract class Pieza {
    //La pieza lleva como atributo su nombre
    public String nombre;

    //Constructor de la pieza el cual recibe como parametro @param String Nombre
    public Pieza(String nombre) {
        this.nombre = nombre;
    }

    //metodo abstracto para mostras los detalles de la pieza
    public abstract void mostrarDetalles();

}