package producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        GestorProductos gestor = new GestorProductos();
        int opcion;

        do {
            System.out.println("\n V: =====> Sistema de gestion de Productos <===== :V");
            System.out.println("\n======================     ===================");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Actualizar precio de un producto");
            System.out.println("4. Eliminar un producto");
            System.out.println("5. Salir");
            System.out.println("\n=======================    ====================");
            System.out.print("Seleccione una opción: ");

            opcion = s.nextInt();

            switch (opcion) {

                case 1 -> { // CREAR
                    System.out.print("Ingrese ID: ");
                    int id = s.nextInt();

                    s.nextLine(); // Limpiar buffer de entrada

                    System.out.print("Ingrese nombre: ");
                    String nombre = s.nextLine();

                    System.out.print("Ingrese precio: ");
                    double precio = s.nextDouble();

                    Producto producto = new Producto(id, nombre, precio);
                    gestor.agregarProducto(producto);

                    System.out.println("Producto agregado correctamente.");
                }

                case 2 -> { // LEER
                    if (gestor.estaVacio()) {
                        System.out.println("No hay productos registrados actualmente en el sistema.");
                    } else {
                        gestor.mostrarProductos();
                    }
                }

                case 3 -> { // ACTUALIZAR
                    if (gestor.estaVacio()) {
                        System.out.println("No hay productos registrados para actualizar.");
                    } else {
                        System.out.print("Ingrese el ID del producto: ");
                        int idActualizar = s.nextInt();

                        System.out.print("Ingrese el nuevo precio: ");
                        double nuevoPrecio = s.nextDouble();

                        boolean actualizado = gestor.actualizarProducto(idActualizar, nuevoPrecio);

                        if (actualizado) {
                            System.out.println("Producto actualizado correctamente.");
                        } else {
                            System.out.println("El producto con ID " + idActualizar + " no existe.");
                        }
                    }
                }

                case 4 -> { // ELIMINAR
                    if (gestor.estaVacio()) {
                        System.out.println("No hay productos registrados para eliminar.");
                    } else {
                        System.out.print("Ingrese el ID del producto a eliminar: ");
                        int idEliminar = s.nextInt();

                        boolean eliminado = gestor.eliminarProducto(idEliminar);

                        if (eliminado) {
                            System.out.println("Producto eliminado correctamente.");
                        } else {
                            System.out.println("El producto con ID " + idEliminar + " no existe.");
                        }
                    }
                }

                case 5 -> System.out.println("Programa finalizado.");

                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        s.close();
    }
}   
    
