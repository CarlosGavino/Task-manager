package org.example;

public class Tarea {

    private String nameTarea;
    private String description;
    private boolean complete;

    public Tarea(String nameTarea, String description){
        this.nameTarea = nameTarea;
        this.description = description;
        this.complete = false;

    }

    public String getNameTarea() {
        return nameTarea;
    }

    public void setNameTarea(String nameTarea) {
        this.nameTarea = nameTarea;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete() {
        this.complete = true;
    }

    @Override
    public String toString(){
        return "Tarea: " + nameTarea +
                " | Descripción: " + description +
                " | Completada: " + (complete ? "Sí" : "No");
    }


}
