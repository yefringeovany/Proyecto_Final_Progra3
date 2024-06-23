package gt.com.tarea.estructuras;

public class Cola {

    private Nodo frente;
    private Nodo finalCola;

    public Cola() {
        this.frente = null;
        this.finalCola = null;
    }

    public void encolar(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            frente = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
        }
        finalCola = nuevoNodo;
    }

    public Object desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        Object dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            finalCola = null;
        }
        return dato;
    }

    public Object verFrente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public boolean buscar(Object dato) {
        Nodo actual = frente;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public int tamano() {
        int contador = 0;
        Nodo actual = frente;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    private class Nodo {

        Object dato;
        Nodo siguiente;

        Nodo(Object dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
}
