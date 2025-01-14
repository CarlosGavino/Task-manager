package org.example;

import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> tareas;

    public  GestorTareas(){
        tareas = new ArrayList<>();
    }

    // methods

    public void addTask(String nameTask, String description){
        Tarea newTask = new Tarea(nameTask, description);
        tareas.add(newTask);
        System.out.println("Tarea agregada con éxito");
    }

    public void listTask(){
        if (tareas.isEmpty()){
            System.out.println("No hay tareas registradas");
        } else {
            for (int i = 0; i < tareas.size(); i ++){
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }

    public void checTaskComplet(int idx){
        if (idx >= 1 && idx <= tareas.size()){
            tareas.get(idx - 1).setComplete();
            System.out.println("Tarea marcada como completada");
        } else {
            System.out.println("Indice inválido");
        }
    }

    public void deteleTask(int idx){
        if (idx >= 1 && idx <= tareas.size()){
            tareas.remove(idx - 1);
            System.out.println("Tarea eliminada con exito");
        } else{
            System.out.println("Indice inválido");
        }

    }
}
