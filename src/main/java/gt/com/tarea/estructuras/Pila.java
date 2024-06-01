package gt.com.tarea.estructuras;

public class Pila {

    private Nodo inicio;
    private Nodo fin;

    public Pila() {
        this.inicio = null;
        this.fin = null;
    }

    public void push(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    public Object pop() {
    if (inicio == null) {
        throw new IllegalStateException("La pila está vacía");
    }
    Nodo actual = inicio;
    Nodo anterior = null;
    // Iteramos hasta llegar al último nodo de la pila
    while (actual.siguiente != null) {
        anterior = actual;
        actual = actual.siguiente;
    }
    // Si hay más de un elemento en la pila
    if (anterior != null) {
        anterior.siguiente = null; // Eliminamos la referencia al último nodo
        fin = anterior; // Actualizamos el fin de la pila
    } else {
        // Si solo hay un elemento en la pila
        inicio = null;
        fin = null;
    }
    return actual.dato;
}

    public boolean buscar(Object dato) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void eliminar(Object dato) {
        if (inicio == null) {
            return;
        }
        if (inicio.dato.equals(dato)) {
            inicio = inicio.siguiente;
            if (inicio == null) {
                fin = null;
            }
            return;
        }
        Nodo anterior = null;
        Nodo actual = inicio;
        while (actual != null && !actual.dato.equals(dato)) {
            anterior = actual;
            actual = actual.siguiente;
        }
        if (actual != null) {
            anterior.siguiente = actual.siguiente;
            if (anterior.siguiente == null) {
                fin = anterior;
            }
        }
    }

    public Object peek() {
        if (inicio == null) {
            throw new IllegalStateException("La pila está vacía");
        }
        return inicio.dato;
    }

    public boolean estaVacia() {
        return inicio == null;
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
