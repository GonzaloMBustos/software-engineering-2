package at.dataflow.zeroanalysis;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/**
 * This class represents a mapping of ZeroAbstractValues (BOTTOM, -, 0, +,  or TOP) to variable names.
 */
public class ZeroAbstractState {

    /**
     * This map contains the mapping of variable names to ZeroAbstractValues.
     */
    private final HashMap<String, ZeroAbstractValue> map;

    public ZeroAbstractState() {
        this.map = new HashMap<>();
    }

    /**
     * This method checks if the given variable has a value in the state.
     * @param variable the variable name.
     * @return true if the variable has a value, false otherwise.
     */
    public Boolean hasValue(String variable) {
        return this.map.containsKey(variable);
    }

    /**
     * This method returns the value of the given variable.
     * @param variable the variable name.
     * @return the value of the variable.
     */
    public ZeroAbstractValue getValue(String variable) {
        return this.map.get(variable);
    }

    /**
     * This method sets the value of the given variable.
     * @param variable the variable name.
     * @param value the value of the variable.
     */
    public void setValue(String variable, ZeroAbstractValue value) {
        if (value != null) {
            this.map.put(variable, value);
        }
    }

    /**
     * This method returns the defined variables in this mapping.
     * @return the defined variables in this mapping.
     */
    public Set<String> getDefinedVariables() {
        return this.map.keySet();
    }

    /**
     * This method returns the union of this state with another state.
     * Recall: state: Var -> {BOTTOM, -, 0, +, TOP}
     * @param another the other state.
     * @return the union of this state with another state.
     */
    public ZeroAbstractState union(ZeroAbstractState another) {
        // Implementamos la unión de dos estados, usando el hecho de que ambos son HashMaps iterables.
        // Para esto, iteramos sobre ambos HashMaps y agregamos los valores a un nuevo HashMap, usando el metodo merge de ZeroAbstractValue.
        // Utilizando la misma logica que en el metodo de union de ZeroAbstractValue, si nos encontramos en una situacion donde tenemos que reflejar el estado analizado
        // de las distintas variables del programa, y en los dos distintos estados tenemos distintos valores para la misma variable, tenemos que poder usar la 
        // definicion de union provista para poder definir el nuevo estado general.
        // De esta manera, aquellas variables que ambos estados compartan, deberan ser unificadas, y aquellas que no, simplemente se agregan al nuevo estado.
        ZeroAbstractState result = new ZeroAbstractState();
        map.forEach( (key, value) -> {
            result.map.put(key, value);
        });
        another.map.forEach( (key, value) -> {
            if (!result.map.containsKey(key)) {
                result.map.put(key, value);
            } else {
                result.map.put(key, value.merge(map.get(key)));
            }
        });
        return result;
    }

    /**
     * Clears the State.
     */
    public void clear() {
        this.map.clear();
    }

    /**
     * Copies the values of another state into this state.
     * @param another the other state.
     */
    /**
     * Copies the values of another set into this set.
     * @param another the other set.
     */
    public void copy(ZeroAbstractState another) {
        this.map.putAll(another.map);
    }


    @Override
    public String toString() {
        return "ZeroAbstractState{" + this.map + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ZeroAbstractState)) return false;
        ZeroAbstractState that = (ZeroAbstractState) o;
        return Objects.equals(this.map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.map);
    }
}
