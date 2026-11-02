package colas;


// Main Colas
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 30 de octubre de 2026


import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entorno listo");

        //Parte 1: ColaArreglosCircular
        System.out.println("\n--- ColaArreglos ---");
        ColaArreglo cola = new ColaArreglo(3);
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        System.out.println("Sale: " + cola.desencolar()); // 10
        cola.encolar(40); // reutiliza la posición 0
        System.out.println("Frente: " + cola.frente()); // 20
        System.out.println("Tamaño: " + cola.tamanio()); // 3
        System.out.println("¿Llena? " + cola.estaLlena()); // true

        //Parte 2: ColaNodosEnlazados
        System.out.println("\n--- ColaEnlazada ---");
        ColaEnlazada<String> nombres = new ColaEnlazada<>();
        nombres.encolar("Ana");
        nombres.encolar("Luis");
        nombres.encolar("María");
        System.out.println(nombres.desencolar()); // Ana
        System.out.println(nombres.frente()); // Luis
        System.out.println(nombres.tamanio()); // 2

        // Parte 3.1 y 3.2: Queue con LinkedList y ArrayDeque 
        System.out.println("\n--- Queue ---");
        Queue<String> colaQueue = new LinkedList<>(); // O puedes usar ArrayDeque
        colaQueue.offer("Ana");
        colaQueue.offer("Luis");
        colaQueue.offer("María");
        System.out.println(colaQueue.peek()); // Ana (no la elimina)
        System.out.println(colaQueue.poll()); // Ana (la elimina)
        System.out.println(colaQueue.size()); // 2
        System.out.println(colaQueue); // [Luis, María]

        //Parte 3.3: Cola de Prioridad
        System.out.println("\n--- ColaPrioridad(Queue) ---");
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq.poll()); // 10 (sale primero el menor)
        System.out.println(pq.poll()); // 20
        System.out.println(pq.poll()); // 30  


        // Ejercicio de refuerzo: imprimirCola
        System.out.println("\n--- EjercicioRefuerzo: imprimirCola ---");
        ColaEnlazada<String> colaRefuerzo = new ColaEnlazada<>();
        colaRefuerzo.encolar("Cliente 1");
        colaRefuerzo.encolar("Cliente 2");
        colaRefuerzo.encolar("Cliente 3");

        System.out.println("Contenido actual de la cola:");
        colaRefuerzo.imprimirCola();

        // Verificamos que la cola no se destruyó y aún conserva su tamaño
        System.out.println("Tamaño tras imprimir: " + colaRefuerzo.tamanio()); // Debe ser 3



        //Ejercicio de refuerzo: vaciar 
        System.out.println("\n--- EjercicioRefuerzo: vaciar ---");
        ColaEnlazada<String> colaVaciar = new ColaEnlazada<>();
        colaVaciar.encolar("A");
        colaVaciar.encolar("B");
        System.out.println("Tamaño antes de vaciar: " + colaVaciar.tamanio()); // 2

        colaVaciar.vaciar();
        System.out.println("¿Está vacía después de vaciar?: " + colaVaciar.estaVacia()); // true
        System.out.println("Tamaño después de vaciar: " + colaVaciar.tamanio()); // 0


        //Ejercicio de refuerzo: invertir cola 
        System.out.println("\n--- Ejercicio Refuerzo: Invertir Cola ---");
        ColaEnlazada<String> colaInv = new ColaEnlazada<>();
        colaInv.encolar("Primero");
        colaInv.encolar("Segundo");
        colaInv.encolar("Tercero");

        System.out.print("Original: ");
        colaInv.imprimirCola();

        colaInv.invertir();

        System.out.print("Invertida: ");
        colaInv.imprimirCola();



       //Ejercicio de refuerzo: Cola usando dos pilas 
       System.out.println("\n--- Ejercicio Refuerzo: Cola con Dos Pilas ---");
       ColaConDosPilas<String> colaPilas = new ColaConDosPilas<>();
       colaPilas.encolar("Ana");
       colaPilas.encolar("Luis");
       colaPilas.encolar("Maria");

       System.out.println("Atendiendo a:" + colaPilas.desencolar()); // Debe salir "Primero (Pila)"
       System.out.println("Siguiente en la cola: " + colaPilas.frente()); // Debe ser "Segundo (Pila)"
       System.out.println("Tamaño restante: " + colaPilas.tamanio()); // Debe ser 2



       //Ejercicio de Refuerzo: Árbol Binario por Niveles (BFS) 
       System.out.println("\n--- Ejercicio Refuerzo: Recorrido BFS ---");
       NodoArbol<Integer> raiz = new NodoArbol<>(1);
       raiz.izquierdo = new NodoArbol<>(2);
       raiz.derecho = new NodoArbol<>(3);
       raiz.izquierdo.izquierdo = new NodoArbol<>(4);
       raiz.izquierdo.derecho = new NodoArbol<>(5);

       System.out.print("Orden del recorrido BFS: ");
       ArbolBFS.recorrerPorNiveles(raiz); // Debe imprimir: 1  2  3  4  5

    }
}



