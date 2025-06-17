package inge2.dataflow;

public class Absoluto {

    // Calcula el valor absoluto de un número entero.
    // Si el número es negativo, devuelve el opuesto.
    // Necesitamos que el valor que se pueda ingresar por parametro cumpla con la especificacion de los enteros
    // por lo tanto restringiendose a ser mayor al valor minimo posible, y menor al valor maximo posible
    // y que el resultado del valorAbsoluto realmente devuelva los posibles valores del valor absoluto en relacion
    // al parametro ingresado
    //@ requires n > Integer.MIN_VALUE;
    //@ requires n < Integer.MAX_VALUE;
    //@ ensures \result >= 0;
    //@ ensures \result == -n || \result == n;
    public static int valorAbsoluto(int n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }
}