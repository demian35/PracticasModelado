/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/

package modelo;

//Clase que representa un almacen para las piezas ensambladas
public class AlmacenEnsamblaje extends Almacen {

    //metodo sobrecargado de la clase padre Almacen el cual nos permitira mostrar el 
    //inventario de las piezas ensambladas
    @Override
    public void mostrarInventario(){
        System.out.println("Invetario de piezas sueltas:");

        for (Pieza pieza : piezas){
            System.out.println(pieza);
            
        }
        
    }
    
}
