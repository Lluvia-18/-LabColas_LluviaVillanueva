package colas;


// Ejercicios de refuerzo: Cola para recorrer un árbol binario por niveles (BFS).
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha:30 de octubre de 2026


import java.util.LinkedList;
import java.util.Queue;

// Clase auxiliar para representar cada nodo del árbol binario
class NodoArbol<T> {
    T valor;
    NodoArbol<T> izquierdo;
    NodoArbol<T> derecho;

    public NodoArbol(T valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

public class ArbolBFS {

    // Método para recorrer el árbol por niveles (BFS) usando una Cola
    public static <T> void recorrerPorNiveles(NodoArbol<T> raiz) {
        if (raiz == null) {
            return;
        }

        // Usamos una cola estándar de Java para almacenar los nodos por visitar
        Queue<NodoArbol<T>> cola = new LinkedList<>();
        cola.offer(raiz);

        while (!cola.isEmpty()) {
            // Sacamos el nodo del frente de la cola y lo imprimimos
            NodoArbol<T> actual = cola.poll();
            System.out.print(actual.valor + " ");

            // Si el nodo tiene hijo izquierdo, lo metemos a la cola
            if (actual.izquierdo != null) {
                cola.offer(actual.izquierdo);
            }

            // Si el nodo tiene hijo derecho, lo metemos a la cola
            if (actual.derecho != null) {
                cola.offer(actual.derecho);
            }
        }
        System.out.println();
    }
}