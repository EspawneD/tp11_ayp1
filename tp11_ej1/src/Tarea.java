public class Tarea {
    private String nombre;
    private boolean finalizada;
    private String fecha;

    public Tarea(String nombre, boolean finalizada, String fecha) {
        this.nombre = nombre;
        this.finalizada = finalizada;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean estado) {
        this.finalizada = estado;
    }

}