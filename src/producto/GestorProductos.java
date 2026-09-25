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
        return null;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        } 
    }
    
    public boolean actualizarProducto(int id, double nuevoPrecio) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                productos.get(i).setPrecio(nuevoPrecio);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarProducto(int id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                productos.remove(i);
                return true;
            }
        }
        return false;
    }
}
