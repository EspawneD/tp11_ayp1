import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    //El primer intento fue con una clase alumno, sin embargo requeria
    //mayor complejidad, pero lo dejo para una futura prueba
    public static void main(String[] args) {
        Map<String, List<Double>> mapaAlumnos = new HashMap<>();
        //trabajo relacionando a un alumno con una coleccion de notas
    }

    public static void agregarNota(Map<String, List<Double>> mapaAlumnos, String nombreAlumno, double nota){
        if(mapaAlumnos.containsKey(nombreAlumno)){
            mapaAlumnos.get(nombreAlumno).add(nota);
        } else {
            List<Double> notasNuevoAlumno = new ArrayList<>();
            notasNuevoAlumno.add(nota);
            mapaAlumnos.put(nombreAlumno, notasNuevoAlumno);
        }
    }

    public static double calcularPromedio(List<Double> notas){
        //if (notas.isEmpty()){return 0;} esto puede servir como validacion si todavia no tiene notas el alumno
        double suma = 0;
        for(double nota : notas){
            suma += nota;
        }
        suma /= notas.size();
        return suma;
    }

    public static void listarAprobados(Map<String, List<Double>> mapaAlumnos){
        for(String alumno : mapaAlumnos.keySet()){
            List<Double> notas = mapaAlumnos.get(alumno);
            double promedio = calcularPromedio(notas);
            if( promedio >= 6){
                System.out.printf("Alumno aprobado: %s%nPromedio: %.2f%n", alumno, promedio);
            }
        }
    }
}