package practica3;

import java.util.Scanner;

public class Mochila {
    
    /*
     * Funcion que calcula el maxino de dos numeros recibiendo como parametros los numeros a comparar
     * 
     */
    public static int maximo(int a,int b){
        if(a>b){
            return a;
        }
        return a;
    }

    //funcion recursiva del problema de la mochila
    /*
     * recibimos como parametros
     * @param int W la capacidad total de la mochika
     * @param int peso[] un arreglo en donde guardaermos los pesos
     * @param int ben[] arreglo donde se almacenara el beneficio/costo de u objeto
     * @param int n iteraciones donde iremos metiendo objetos a la mochila
     */
    public static int mochilaRecursivo(int W  ,int peso[] ,int ben[],int n){
        //caso base
        if(W==0 || n==0){
            return 0;
        }    
        /*
         * paso recursivo , si el peso del iesimo elemento de la mochila
         * es mayor a la capacidad de la mochila mandamos a llamar recursivamente a la funcion
         * caso contrario regresamos el maximo iesimo elemento 
         * 
         */
        if(peso[n-1]>W){
            return mochilaRecursivo(W, peso, ben, n-1);
        }else{
            return maximo(ben[n-1]+mochilaRecursivo(W-peso[n-1],peso,ben,n-1), mochilaRecursivo(W, peso, ben, n-1));
        }    
    }

    /*
     * Funcion usando programacion dinamica para implementacion de problema de la mochila
     * recibimos como parametros
     * @param int W la capacidad total de la mochila
     * @param int peso[] un arreglo en donde guardaermos los pesos
     * @param int ben[] arreglo donde se almacenara el beneficio/costo de u objeto
     * @param int n iteraciones donde iremos metiendo objetos a la mochila
     */
    public static int MochilaDinamic(int W  ,int peso[] ,int ben[],int n){
        int i;
        int j;
        int K[][]=new int[n+1][W+1];


        /*
         * creamos el arreglo y haremos las iteraciones para ir metiendo los objetos a la mochila
         */
        for(i=0;i<=n;i++){
            for(j=0;j<=W;j++){
                if(i==0 || n==0){
                    K[i][j]=0;
                }else if(peso[i-1]<=j){
                    K[i][j]=maximo(ben[i-1]+K[i-1][j-peso[i-1]], K[i-1][j]);
                }else{
                    K[i][j]=K[i-1][j];
                }
            }
        }
        return K[n][W];
    }

    /*
     * Metodo main para ejecutar el codigo
     */
    public static void main(String[] args) {

        int opcion;
        int tamaniobeneficio;
        int tamaniopesos;
        int W;
        Scanner sc= new Scanner(System.in);
        System.out.println("indique que version del problema de la mochila desea usar 1) recursivo y 2) dinamico");
        opcion=sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("introduzca cuantos elementos desea meter (tamaño del arreglo)");
                tamaniobeneficio=sc.nextInt();
                int beneficio[]=new int[tamaniobeneficio];
                System.out.println("Ingrese los valores de los valores de beneficio de los objetos de la mochila");
                for(int i=0; i<beneficio.length;i++){
                    beneficio[i]=sc.nextInt();
                }
                System.out.println("introduzca cuantos elementos desea meter (tamaño del arreglo)");
                tamaniopesos=sc.nextInt();
                int pesos[]= new int[tamaniopesos];
                System.out.println("Ingrese los valores de los pesos de los objetos de la mochila");
                for(int i=0; i<beneficio.length;i++){
                    pesos[i]=sc.nextInt();
                }
                System.out.println("Ingrese el valor de la capacidad de la mochila");
                W=sc.nextInt();
                int n=beneficio.length;
                System.out.println(mochilaRecursivo(W,pesos,beneficio,n));
                break;
            
            case 2:
                System.out.println("introduzca cuantos elementos desea meter (tamaño del arreglo)");
                tamaniobeneficio=sc.nextInt();
                int beneficio2[]=new int[tamaniobeneficio];
                System.out.println("Ingrese los valores de los valores de beneficio de los objetos de la mochila");
                for(int i=0; i<beneficio2.length;i++){
                    beneficio2[i]=sc.nextInt();
                }
                System.out.println("introduzca cuantos elementos desea meter (tamaño del arreglo)");
                tamaniopesos=sc.nextInt();
                int pesos2[]= new int[tamaniopesos];
                System.out.println("Ingrese los valores de los pesos de los objetos de la mochila");
                for(int i=0; i<beneficio2.length;i++){
                    pesos2[i]=sc.nextInt();
                }
                System.out.println("Ingrese el valor de la capacidad de la mochila");
                W=sc.nextInt();
                int m=beneficio2.length;
                System.out.println(MochilaDinamic(W,pesos2,beneficio2,m));
                break;
        }
        
    }
}
