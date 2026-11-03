import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> carrito = new HashMap<>();
        List<String> productosRepetidos = new ArrayList<>();
        agregarProducto(carrito, "Salchichas", 4);
        agregarProducto(carrito, "Banana", 2);
        agregarProducto(carrito, "Banana",1);
        agregarProducto(carrito, "Zanahoria", 1);
        agregarProducto(carrito, "Huevos", 6);
        contarRepetidos(carrito, productosRepetidos);

        System.out.printf("Cantidad de items: %d%n", contarItems(carrito));
        System.out.printf("Productos con más de 2: %s%n", productosRepetidos);

    }

    public static void contarRepetidos(Map<String, Integer> carrito, List<String> productosRepetidos){
        for(String producto : carrito.keySet()){
        //Armo una lista con productos que su cantidad es mayor a 2
            if(carrito.get(producto) > 2){
                productosRepetidos.add(producto);
            }
        }
    }

    public static void agregarProducto(Map<String, Integer> carro, String nombreProducto, int cantidad){
            if(carro.containsKey(nombreProducto)){
                int cantActual = carro.get(nombreProducto);
                carro.put(nombreProducto, cantActual + cantidad);
            } else {
                carro.put(nombreProducto, cantidad);
            }
    }

    public static int contarItems(Map<String, Integer> carro){
        int total = 0;
        for (String producto : carro.keySet()){
            total += carro.get(producto);
        }
        return total;
    }
}