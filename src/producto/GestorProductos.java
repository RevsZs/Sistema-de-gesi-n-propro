package producto;

import java.util.ArrayList;
import java.util.List;

public class GestorProductos {
    
    private List<Producto> productos = new ArrayList<>();
    
    public boolean estaVacio() {
        return productos.isEmpty();
    }

    public Producto buscarPorId(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
       
