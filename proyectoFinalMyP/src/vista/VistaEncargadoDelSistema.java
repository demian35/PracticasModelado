/**
*
*@author Jose Demian Jimenez Salgado
*@since Junio 9 del 2023, UNAM.
**@version v1.0
*/


package vista;
import java.util.InputMismatchException;
import controlador.*;
import java.util.Scanner;

//Clase principal para operar el sistema
 public class VistaEncargadoDelSistema {

    //Metodo main 
    public static void main(String[] args) {
        FabricaControler fabrica = FabricaControler.getInstance();//instancia del singleton FabricaControler
        //Creamos las maquinas de la fabrica
        IMaquina maquina1 = new MaquinaProductora1Controler();
        IMaquina maquina2 = new MaquinaProductora2Controler();
        IMaquina maquina3 = new MaquinaProductora3Controler();
        MaquinaEnsambladora maquinaEnsambladora = new MaquinaEnsambladora();

        //agregamos las maquinas
        fabrica.agregarMaquina(maquina1);
        fabrica.agregarMaquina(maquina2);
        fabrica.agregarMaquina(maquina3);
        fabrica.agregarMaquina(maquinaEnsambladora);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        int opcionSubMenu = 0;

        do {
            System.out.print("\u001B[32m");

            System.out.println("----- Menú de Control de Fábrica -----");
            System.out.println("1. Programar ejecuciones");
            System.out.println("2. Iniciar ejecuciones");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");

            System.out.print("\n Seleccione una opción: ");
            System.out.println("\u001B[0m");

            try {
                opcion = scanner.nextInt();
                 if (opcion < 1 || opcion > 4) {
                    throw new InputMismatchException();//exepcion para que el usuario no meta datos incorrectos
                 }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero o una opcion del 1 al 4");
                scanner.nextLine(); // Limpiar el buffer del escáner
                opcion = 0; // Establecer opción a 0 para repetir el bucle
            }

            switch (opcion) {

                case 1:
                    opcionSubMenu = 0; // Reiniciar el submenú antes de ingresar al bucle

                    while (opcionSubMenu != 4) {
                        System.out.print("\u001B[33m");
                        System.out.println("----- Programar Ejecuciones -----");
                        System.out.println("Seleccione una máquina:");
                        System.out.println("1. Máquina 1");
                        System.out.println("2. Máquina 2");
                        System.out.println("3. Máquina 3");
                        System.out.println("4. Máquina Ensambladora");
                        System.out.println("5. Volver al menú");
                        System.out.print("Ingrese el número de la máquina: ");
                        System.out.println("\u001B[0m");

                        try {
                            int opcionMaquina = scanner.nextInt();
                            if(opcionMaquina<1 || opcionMaquina>5){
                                 throw new InputMismatchException();//excepcion para que el usuario no meta datos incorrectos
                            }

                            //switch para programar las ejecuciones de las maquinas (Command)
                            switch (opcionMaquina) {
                                case 1:
                                    fabrica.programarEjecucion(maquina1);
                                    break;
                                case 2:
                                    fabrica.programarEjecucion(maquina2);
                                    break;
                                case 3:
                                    fabrica.programarEjecucion(maquina3);
                                    break;
                                case 4:
                                    fabrica.programarEjecucion(maquinaEnsambladora);
                                    break;
                                default:
                                    System.out.println("Volviendo al menú principal. o alguna opcion del 1 al 5 ");
                                    opcionSubMenu = 4; // Establecer opcionSubMenu a 4 para salir del bucle
                                    break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Debes ingresar un número entero.");
                            scanner.nextLine(); // Limpiar el buffer del escáner
                        }
                    }
                    break;
                case 2:
                    fabrica.iniciarEjecuciones(); //Caso para iniciar las ejecuciones de las maquinas programadas(Command)
                    break;

                case 3:
                    fabrica.mostrarInventario();//mostramos el inventario en pantalla
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }

} 
