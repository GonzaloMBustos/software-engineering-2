package inge2.dataflow;

public class MapSumaUno {

    // Suma uno a todos los elementos de un array.
    //
     // necesitamos que nos pasen un arreglo valido (no nulo y no de largo infinito)
    // necesitamos limitar a los valores del array para que sumarle uno no nos haga overflow
    // tambien queremos asegurar que nos de el mismo arreglo pero con cada elemento + 1
    //@ requires arr != null;
    //@ requires arr.length < Integer.MAX_VALUE;
    //@ requires \forall int i; 0 <= i < arr.length; Integer.MIN_VALUE <= arr[i] < Integer.MAX_VALUE;
    //@ ensures \forall int j; 0 <= j < arr.length; arr[j] == (\old(arr[j]) + 1);
    public static void mapSumaUno(int[] arr) {

        //@ maintaining arr.length < Integer.MAX_VALUE;
        //@ maintaining 0 <= i <= arr.length;
        //@ maintaining \forall int j; i <= j < arr.length; arr[j] == \old(arr[j]);
        //@ maintaining \forall int j; 0 <= j < i; arr[j] == (\old(arr[j]) + 1);
        //@ decreases arr.length -i;
        //@ loop_writes arr[*], i;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
}