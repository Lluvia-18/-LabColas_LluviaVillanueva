
package colas;

// Clase Banco
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha:30 de octubre de 2026


import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        ColaEnlazada<String> fila = new ColaEnlazada<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Banco ---");
            System.out.println("1. Llega un cliente");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Ver quién sigue");
            System.out.println("4. Ver cantidad de clientes en espera");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

//se pide el nombre y este se encola
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();

                    fila.encolar(nombre);
                    System.out.println("Cliente agregado a la fila");
                    break;

//se desencola y valida q no este vacia 
                case 2:
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes esperando");
                    } else {
                        System.out.println("Se atiende a: " + fila.desencolar());
                    }
                    break;

//muestra el frente y valida q no este vacia
                case 3:
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("Siguiente cliente: " + fila.frente());
                    }
                    break;

//muestra el tamaño
                case 4:
                    System.out.println("Clientes en espera: " + fila.tamanio());
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
