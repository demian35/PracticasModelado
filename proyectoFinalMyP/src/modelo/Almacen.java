/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/

package modelo;
import java.util.ArrayList;
import java.util.List;

//Clase abstracta para representar un almacen
public abstract class Almacen{
    //Atributos lista de las piezas a almacenar
    protected List<Pieza> piezas = new ArrayList<>();
    
    //metodo para agregar una pieza al almacen
    public void agregarPieza(Pieza pieza){
        piezas.add(pieza);
        
    }

    //metodo para eliminar piezas del almacen
    public void eliminaPieza(Pieza pieza){
        piezas.remove(pieza);

    }

    //metodo abstracto para representar piezas disponibles
    public abstract void mostrarInventario();
}

