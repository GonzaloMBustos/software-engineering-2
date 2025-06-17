package inge2.dataflow;

public class BusquedaLineal {

    // Busca un elemento en un arreglo de enteros.
    //
    //@ requires arr != null;
    //@ ensures \result <==> (\exists int i; 0 <= i < arr.length; arr[i] == elem);
    public static boolean busquedaLineal(int elem, int[] arr) {
        boolean result = false;
        // el ciclo deberia unicamente modificar result e i, manteniendo el valor de i entre 0 y el largo
        // del array y devolviendo true unicamente si el elemento existe en el arreglo
        //@ loop_writes result, i;
        //@ maintaining 0 <= i <= arr.length;
        //@ maintaining result <==> (\exists int j; 0 <= j < i; arr[j] == elem);
        //@ decreases arr.length -i;
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                //@ assert arr[i] == elem;
                result = true;
                //@ assert result == true;
            }
        }

        return result;
    }
}