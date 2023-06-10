
<a name="readme-top"></a>


![Status badge](https://img.shields.io/badge/status-TERMINADO%20-green?style=for-the-badge)


<div align="center">
  <img src="https://user-images.githubusercontent.com/79823316/220245622-4cd1cc0b-521c-4252-8e39-1d2b0d9c2389.png" alt="Logo" width="80" height="80">
</div>

____

# Desarrollado por:

* Jose Demian Jimenez Salgado - [Gitlab](https://gitlab.com/demian035) - [Github](https://github.com/demian35) - 314291707 - josedemian@ciencias.unam.mx


_____

# Descripcion del proyecto
## Introduccion
La fabrica contiene por el momento tres maquinas que producen piezas de distintos tipos y medidas y una cuarta
maquina encargada de ensamblar las piezas generadas por las maquinas anteriores. Inicialmente estas maquinas están
apagadas.
Hay un encargado del sistema que debe poder iniciar el proceso de fabricación de las maquinas desde el programa.
En la fabrica solo puede funcionar una maquina a la vez, pero el encargado del sistema debe poder programar
múltiples ejecuciones de cualquiera de las 4 maquinas en cola para iniciar una al acabar la anterior.
Por el momento cada una de las maquinas productoras puede producir tres tipos distintos de piezas pero se
espera que esto pueda cambiar en un futuro.
Cada pieza producida debe ir a un almacén desde el cual puede ser tomada por la maquina ensambladora.
La maquina ensambladora puede unir cualquier par de piezas, posteriormente debe enviarla a un almacén
separado. En caso de que no haya suficientes piezas en el almacén para ensamblar, la maquina ensambladora debe
enviar un mensaje indicando que faltan piezas y no hacer nada mas.
El encargado del sistema debe poder ver en pantalla, ya sea por interfaz gráfica o por consola, un inventario de
las piezas de ambos almacenes.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Objetivo del proyecto
El objetivo del proyecto es diseñar y programar el sistema de control de una fabrica

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Requerimientos

Para el desarrollo del proyecto deberán utilizar por lo menos dos de los patrones de diseño vistos en las exposiciones a su elección, además deberán utilizar el patrón arquitectónico Modelo-Vista-Controlador.
En cuanto a lenguaje de programacion, deben limitarse a lenguajes orientados a objetos.



<p align="right">(<a href="#readme-top">back to top</a>)</p>

____
# Sobre la implementación 

## Diagrama de casos de uso
![Casos de uso](https://cdn.discordapp.com/attachments/973431470813224990/1116630560773779456/diagramaCasosdeusoproyecto.png)

archivo diagramaCasosdeusoproyecto.png


## Descripcion de casos de uso

Encender y apagar maquina: Aqui el encargado sera capaz de encender y apagar las maquinas con las que desee trabajar

Ver inventarios: En encargado sera capaz de ver lo que hay en cada inventario o almacen en este caso son dos almacenes el de las piezas y el de la piezas ensambladas

Crear pieza: El encargado por medio de la maquina 1,2 y 3 podra fabricar distintos tipos de piezas y asi mandarlas a un almacen para piezas

Ensamblar piezas: El encargado por medio de la maquina ensambladora podra ensamblar las piezas previamenente fabricadas por las maquinas 1,2 y 3 para asi mandarlas al almacen de piezas terminadas

Programa maquina: El encargado sera capaz de programar cada ejecucion de las maquinas para que se lleve a cabo la fabricacion de las piezas


## Patrones de diseño 
Para esta implementacion dos utilizaron cuatro patrones de diseño en este caso se uso el mvc para el control del sistema,  el patron singleton que es el patron que nos va a permitir instanciar solo una vez el controlador de la fabrica que es la clase FabricaControler y por ultimo el patron de diseño Command el cual se usa tambien en el controlador FabricaControler para poder manejar la cola de ejecuciones colaEjecuciones y asi ejecutar una maquina a una, aqui el invoker vendria siendo el FabricaControler y los comandos concretos vendrian siendo las maquinas.

## Diagrama de secuencia

Diagrama de secuencia Singleton
![Singleton](https://cdn.discordapp.com/attachments/973431470813224990/1116881653181194241/SingetonDiagramaSecuencia.png)

archivo SingletonDiagramaSecuencia.png

Diagrama de secuencia Command
![Command](https://cdn.discordapp.com/attachments/973431470813224990/1116900917351026758/SequenceCommand.png)
archivo SequenceCommand.png



## Diagramas de clases de sus patrones.
Diagrama Singleton
![Singleton](https://cdn.discordapp.com/attachments/973431470813224990/1116901603849539625/singletonclases.png)
archivo singletonclases.png

Diagrama Command
![Command](https://cdn.discordapp.com/attachments/973431470813224990/1116902022734692372/ClasesCommand.png)
archivo ClasesCommand.png

Diagrma MVC Proyecto
![mvc](https://cdn.discordapp.com/attachments/973431470813224990/1116930294159773726/ClasesMVC.png)
archivo ClasesMVC.png

## Árbol de Carpetas

``` 
───proyectoFinalMyP
   │   ClasesCommand.png
   │   diagramaCasosdeusoproyecto.png
   │   README.md
   │   SequenceCommand.png
   │   SingetonDiagramaSecuencia.png
   │   singletonclases.png
   │
   └───src
       ├───controlador
       │       FabricaControler.java
       │       IMaquina.java
       │       MaquinaEnsambladora.java
       │       MaquinaProductora1Controler.java
       │       MaquinaProductora2Controler.java
       │       MaquinaProductora3Controler.java
       │
       ├───modelo
       │       Almacen.java
       │       AlmacenEnsamblaje.java
       │       AlmacenPiezas.java
       │       Pieza.java
       │       Pieza2.java
       │       Pieza3.java
       │       Pieza3B.java
       │       PiezaA3.java
       │       PiezaAZ.java
       │       PiezaEnsamblada.java
       │       PiezaF2.java
       │       PiezaF7.java
       │       PiezaFF.java
       │       PiezaLM.java
       │       PiezaMK.java
       │       PiezaPK.java
       │
       └───vista
               VistaEncargadoDelSistema.java

```

_____
# Instancias usadas en el proyecto
## Lenguajes de Programación usado:
* ![Java](https://img.shields.io/badge/java-17-orange?style=for-the-badge&logo=java) 

## Editor de codigo usado:

* ![VsCode](https://img.shields.io/badge/VSCode-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white)


## Sistema Operativos usados:

* ![win11](https://img.shields.io/badge/Windows_11-0078d4?style=for-the-badge&logo=windows-11&logoColor=white)

* ![win10](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)

* ![ubuntu](https://img.shields.io/badge/Ubuntu-E95420?style=for-the-badge&logo=ubuntu&logoColor=white)


<p align="right">(<a href="#readme-top">back to top</a>)</p>

______

# Como Comenzar
Para usar el programa descargas el zip del proyecto ya descargado lo descomprimes, despues te tienes que colocar en el directorio src, ya ahi compilamos el proyecto con el  comando:

javac modelo/* .java controlador/* .java vista/*.java  

![terminal](https://cdn.discordapp.com/attachments/973431470813224990/1116911681445040179/comandocompilarproyecto.png)

Y para correrlo usamos el comando:

java vista/VisraEncargadoDelSistema

![terminal1](https://cdn.discordapp.com/attachments/973431470813224990/1116913429832290374/comandoejecucionproyecto.png)


En la ejecucion tendremos cuatro opciones programar ejecuciones, Iniciar ejecuciones,Mostrar inventario y salir.

![interfaz](https://cdn.discordapp.com/attachments/973431470813224990/1116913801569247343/interfazprincipal.png)

Para programar las maquinas hay que seleccionar la opcion 1 ya seleccionada esta opcion nos mostrara todas 
maquinas que tenemos y podemos preparar para ejecucion.

![interfazMaquinas](https://cdn.discordapp.com/attachments/973431470813224990/1116914166599528448/VistaProgramacionMaquinas.png)

Ya seleccionadas las maquinas regresamos al menu principal y para proceder con la ejecucion de las maquinas
seleccionamos la opcion 2, si previamente tambien programamos la ejecucion de la maquina ensambladora 
al ejecutar las maquinas nos dejara seleccionar las piezas en el inventario que queremos ensamblar
con la maquina ensambladora, y solo seleccionamos el par de piezas del inventario que queremos ensamblar.

![vistaEjecucionMAquinas](https://cdn.discordapp.com/attachments/973431470813224990/1116915175342223511/ejecucionMaquinas.png)

![ejemploEnsamblado](https://cdn.discordapp.com/attachments/973431470813224990/1116915816449970277/ejecucionEnsamblado.png)

Por ultimo para ver la pieza que ensamblamos seleccionamos la opcion 3 para ver el inventario y ahi estaran
los inventarios de las piezas no ensambladas y las que ya se ensamblaron.

![Inventarios](https://cdn.discordapp.com/attachments/973431470813224990/1116922035751366728/inventarios.png)


Y para cerrar el programa basta seleccionar la opcion 4 salir.









<p align="right">(<a href="#readme-top">back to top</a>)</p>



