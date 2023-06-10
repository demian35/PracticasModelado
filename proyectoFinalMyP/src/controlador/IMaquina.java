/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/


package controlador;


// Clase abstracta para las máquinas productoras
public abstract class IMaquina {
    //La maquina lleva como atributo su nombre
    protected String nombre;

    //Constructor de IMaquina
    //Recibe como parametro su nombre @param String nombre
    public IMaquina(String nombre) {
        this.nombre = nombre;
        
    }

    //metodo get que nos regresa el nombre
    public String getNombre() {
        return nombre;
    }

    //metodo abstracto que enciende la maquina
    public abstract void encender();
    
    //metodo abstracto que produce las piezas
    public abstract void producirPiezas();

    //metodo que apaga la maquina
    public void apagar() {
        System.out.println("Apagando " + nombre + "...");
    }
}