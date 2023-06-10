/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/


package modelo;
//Clase que representa un almacen para las piezas sin ensamblar heredamos de Almacen
public class AlmacenPiezas extends Almacen {
    
    //metodo sobrecargado de la clase Almacen el cual nos permitira mostrar el inventario de piezas sin ensamblar
    @Override
    public void mostrarInventario(){
        System.out.println("Invetario de piezas sueltas:");

        for (Pieza pieza : piezas){
            System.out.println(pieza);
            
        }
        
    }
    
}
