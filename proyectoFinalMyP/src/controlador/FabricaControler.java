/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/



package controlador;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import modelo.*;

// Clase principal que controla la fábrica y programa las ejecuciones en cola
public class FabricaControler {
    //Atributos de la clase Fabrica Controler
    private static FabricaControler instance; //Instancia de la fabrica controller (Singleton)
    private List<IMaquina> maquinas; //Lista de maquinas 
    private Queue<IMaquina> colaEjecuciones; //Cola de ejecuciones de las maquinas (Command invoker)
    private List<Pieza> almacenPiezas; //Lista para crear el almacen de las piezas sin ensamblar
    private List<Pieza> almacenEnsamblados; //Lista para crear el almacen de las piezas ensambladas

    //Constructor de nuestra Fabrica Controller
    private FabricaControler() {
        maquinas = new ArrayList<>();
        colaEjecuciones = new LinkedList<>();
        almacenPiezas = new ArrayList<>();
        almacenEnsamblados = new ArrayList<>();
    }

    //metodo del singleton para crear la instancia de FabricaController
    //regresamos la instancia
    public static FabricaControler getInstance() {
        if (instance == null) {
            instance = new FabricaControler();
        }
        return instance;
    }

    //Metodo para agregar maquinas a la lista
    public void agregarMaquina(IMaquina maquina) {
        maquinas.add(maquina);
    }

    //metodo para programar las ejecuciones de cada maquina(Command)
    public void programarEjecucion(IMaquina maquina) {
        colaEjecuciones.add(maquina);
    }
    //metodo que inicializa las ejecuciones en la cola(Command)
    public void iniciarEjecuciones() {
        while (!colaEjecuciones.isEmpty()) {
            IMaquina maquina = colaEjecuciones.poll();
            if (maquina != null) {
                maquina.encender();
                maquina.producirPiezas();
                maquina.apagar();
            }
        }
    }

    //metodo que nos muestra las piezas que estan en el inventario ensambladas y no ensambladas
    public void mostrarInventario() {
        System.out.println("Inventario de piezas:");
        for (Pieza pieza : almacenPiezas) {
            pieza.mostrarDetalles();
        }
        System.out.println();

        System.out.println("Inventario de ensamblados:");
        for (Pieza pieza : almacenEnsamblados) {
            pieza.mostrarDetalles();
        }
    }

    //metodo que agrega piezas sin ensamblar al inventario
    //recibimos como parametro una pieza @param Pieza pieza
    public void agregarPiezaAlmacen(Pieza pieza) {
        almacenPiezas.add(pieza);
    }

    //metodo que agrega piezas ensambladas al inventario
    //recibimos como parametro una pieza @param Pieza pieza
    public void agregarPiezaEnsamblado(Pieza pieza) {
        almacenEnsamblados.add(pieza);
    }

    //metodo que verifica si hay suficientes piezas para el ensamblaje
    public boolean verificarPiezasSuficientes() {
        return almacenPiezas.size() >= 2;
    }

    //metodo que ensambla las piezas
    //Usamos un scanner para que el encargado pueda elegir del inventario que
    //piezas quiere ensamblar
    public void ensamblarPiezas() {
        if (verificarPiezasSuficientes()) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Piezas disponibles para ensamblar:");
            for (int i = 0; i < almacenPiezas.size(); i++) {
                System.out.println((i + 1) + ". " + almacenPiezas.get(i).nombre);
            }

            System.out.print("Seleccione la primera pieza a ensamblar: ");
            int opcionPieza1 = scanner.nextInt();
            Pieza pieza1 = almacenPiezas.remove(opcionPieza1 - 1);

            System.out.println("Piezas disponibles para ensamblar:");
            for (int i = 0; i < almacenPiezas.size(); i++) {
                System.out.println((i + 1) + ". " + almacenPiezas.get(i).nombre);
            }

            System.out.print("Seleccione la segunda pieza a ensamblar: ");
            int opcionPieza2 = scanner.nextInt();
            Pieza pieza2 = almacenPiezas.remove(opcionPieza2 - 1);

            PiezaEnsamblada piezaEnsamblada = new PiezaEnsamblada(pieza1, pieza2);
            agregarPiezaEnsamblado(piezaEnsamblada);
        } else {
            System.out.println("Faltan piezas para el ensamblado");
        }
    }
}