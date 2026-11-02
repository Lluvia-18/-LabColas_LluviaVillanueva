package colas;

// Ejercicios de refuerzo: cola usando dos pilas.
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha:30 de octubre de 2026



import java.util.ArrayDeque;
import java.util.Deque;

public class ColaConDosPilas<T> {
    private Deque<T> pilaEntrada = new ArrayDeque<>();
    private Deque<T> pilaSalida = new ArrayDeque<>();

    // Método encolar: O(1)
    public void encolar(T valor) {
        pilaEntrada.push(valor);
    }

    // Método desencolar: O(n) en el peor caso, pero O(1) amortizado
    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }

        // Si la pila de salida está vacía, pasamos todo de la de entrada a la de salida
        if (pilaSalida.isEmpty()) {
            while (!pilaEntrada.isEmpty()) {
                pilaSalida.push(pilaEntrada.pop());
            }
        }

        return pilaSalida.pop();
    }

    // Método frente: O(n) en el peor caso
    public T frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }

        if (pilaSalida.isEmpty()) {
            while (!pilaEntrada.isEmpty()) {
                pilaSalida.push(pilaEntrada.pop());
            }
        }

        return pilaSalida.peek();
    }

    // Método para saber si está vacía
    public boolean estaVacia() {
        return pilaEntrada.isEmpty() && pilaSalida.isEmpty();
    }

    // Método para obtener el tamaño total
    public int tamanio() {
        return pilaEntrada.size() + pilaSalida.size();
    }
}