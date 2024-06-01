package gt.com.tarea.estructuras;

public class Lista {

    private Nodo primero;

    public Lista() {
        this.primero = null;
    }

    public void agregarInicio(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primero;
            primero = nuevoNodo;
        }
    }

    public void agregarFinal(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            Nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void eliminar(Object dato) {
        if (primero == null) {
            return;
        }
        if (primero.dato.equals(dato)) {
            primero = primero.siguiente;
            return;
        }
        Nodo anterior = null;
        Nodo actual = primero;
        while (actual != null && !actual.dato.equals(dato)) {
            anterior = actual;
            actual = actual.siguiente;
        }
        if (actual != null) {
            anterior.siguiente = actual.siguiente;
        }
    }

    public int tamano() {
        int contador = 0;
        Nodo actual = primero;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public Object obtener(int posicion) {
        if (posicion < 0) {
            throw new IllegalArgumentException("La posición no puede ser negativa");
        }
        Nodo actual = primero;
        int contador = 0;
        while (actual != null && contador < posicion) {
            actual = actual.siguiente;
            contador++;
        }
        if (actual != null) {
            return actual.dato;
        } else {
            throw new IndexOutOfBoundsException("La posición está fuera del rango de la lista");
        }
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
