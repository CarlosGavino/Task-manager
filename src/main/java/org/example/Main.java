package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestorTareas gestor = new GestorTareas();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Gestor de Tareas ===");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    String nameTask = scanner.nextLine();
                    System.out.print("Descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    gestor.addTask(nameTask, descripcion);
                    break;
                case 2:
                    gestor.listTask();
                    break;
                case 3:
                    System.out.print("Índice de la tarea a completar: ");
                    int indiceCompletar = scanner.nextInt();
                    gestor.checTaskComplet(indiceCompletar);
                    break;
                case 4:
                    System.out.print("Índice de la tarea a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    gestor.deteleTask(indiceEliminar);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}