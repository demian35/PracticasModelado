package practica3;

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
            return mochilaRecursivo(W, peso, ben, n);
        }else{
            return maximo(ben[n-1]+mochilaRecursivo(W-peso[n-1],peso,ben,n-1), mochilaRecursivo(W, peso, ben, n));
        }    
    }
}
