import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private final String nombre;
    private List<Double> notas;

    public Alumno(String nombre){
        this.nombre = nombre;
        this.notas = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularPromedio(){
        double suma = 0;
        for(double nota : notas){
            suma += nota;
        }
        suma /= notas.size();
        return suma;
    }
}
