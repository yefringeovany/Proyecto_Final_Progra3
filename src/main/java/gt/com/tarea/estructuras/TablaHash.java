package gt.com.tarea.estructuras;

import java.util.LinkedList;

public class TablaHash {

    private LinkedList<Pair>[] tabla;
    private int capacidad;
    private int tamaño;

    public TablaHash(int capacidad) {
        this.capacidad = capacidad;
        this.tabla = new LinkedList[capacidad];
        this.tamaño = 0;
    }

    public void agregar(Object clave, Object valor) {
        int indice = hash(clave);
        if (tabla[indice] == null) {
            tabla[indice] = new LinkedList<>();
        }
        for (Pair pair : tabla[indice]) {
            if (pair.clave.equals(clave)) {
                pair.valor = valor;
                return;
            }
        }
        tabla[indice].add(new Pair(clave, valor));
        tamaño++;
    }

    public void eliminar(Object clave) {
        int indice = hash(clave);
        if (tabla[indice] != null) {
            tabla[indice].removeIf(pair -> pair.clave.equals(clave));
            tamaño--;
        }
    }

    public Object obtener(Object clave) {
        int indice = hash(clave);
        if (tabla[indice] != null) {
            for (Pair pair : tabla[indice]) {
                if (pair.clave.equals(clave)) {
                    return pair.valor;
                }
            }
        }
        return null;
    }

    public boolean buscar(Object clave) {
        int indice = hash(clave);
        if (tabla[indice] != null) {
            for (Pair pair : tabla[indice]) {
                if (pair.clave.equals(clave)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    private int hash(Object clave) {
        return Math.abs(clave.hashCode() % capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public LinkedList<Pair> getLista(int indice) {
        return tabla[indice];
    }

    public class Pair {

        public Object clave;
        public Object valor;

        Pair(Object clave, Object valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }
}
