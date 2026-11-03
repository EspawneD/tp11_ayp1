import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();
        Tarea tarea1 = new Tarea("Hacer la cama", false, "3/11");
        Tarea tarea2 = new Tarea("Estudiar", false, "4/11");
        Tarea tarea3 = new Tarea("Ir al gym", false, "5/11");
        tareas.add(tarea1);
        tareas.add(tarea2);
        tareas.add(tarea3);
        mostrarTareasPendientes(tareas);
        tareas.get(1).setFinalizada(true);
        removerTareas(tareas);
        mostrarTareasPendientes(tareas);

    }

    public static void mostrarTareasPendientes(List<Tarea> tareas){
        System.out.println("Tareas pendientes: ");
        int contador = 0;
        for(Tarea tarea : tareas){ //Muestra tareas pendientes, preguntando si NO estan finalizadas
            if (!tarea.isFinalizada()){
                System.out.println(tarea.getNombre());
                contador++;
            }
        }
        System.out.printf("Quedan %d tareas pendientes.%n", contador);
    }

    public static void removerTareas(List<Tarea> tareas){
        for(int i = tareas.size() - 1; i >= 0; i--){ //Se recorre inverso para evitar cambios del tamaño de lista
            if (tareas.get(i).isFinalizada()){
                tareas.remove(i);
            }
        }
    }
}