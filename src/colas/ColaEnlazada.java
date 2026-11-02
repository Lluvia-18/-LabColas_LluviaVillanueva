package colas;


// Clase ColaEnlazada 
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha:30 de octubre de 2026

 

public class ColaEnlazada<T> {

    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamanio;

    public boolean estaVacia() {
        return frente == null;
    }

    public int tamanio() {
        return tamanio;
    }

    public void encolar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (estaVacia()) {
            frente = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamanio++;
    }

    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null; // la cola quedó vacía
        }
        tamanio--;
        return valor;
    }

    public T frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }


//EjercicioRefuerzo: se agrega un metodo imprimirCola()

public void imprimirCola() {
    Nodo actual = frente;

    while (actual != null) {
        System.out.println(actual.dato);
        actual = actual.siguiente;
    }
}

// EjercicioRefuerzo: se agrega un método vaciar()
public void vaciar() {
    frente = null;
    fin = null;
    tamanio = 0;
}


// EjercicioRefuerzo: invertir la cola usando una pila
public void invertir() {
    java.util.Deque<T> pila = new java.util.ArrayDeque<>();
    
    //Pasamos todos los elementos de la cola a la pila
    while (!estaVacia()) {
        pila.push(desencolar());
    }
    
    //Regresamos los elementos de la pila a la cola (quedarán invertidos)
    while (!pila.isEmpty()) {
        encolar(pila.pop());
    }
}


}