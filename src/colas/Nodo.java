package colas;

// Clase Nodo
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha:30 de octubre de 2026

//Se crea una clase con el nodo interno
//Se pone como dato la letra T para que pueda entrar cualquier tipo de dato sin necesidad de limitar este 



public class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}