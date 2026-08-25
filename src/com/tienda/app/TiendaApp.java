package com.tienda.app;

import com.tienda.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class TiendaApp {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("P001", "Laptop", 15000.00, 10));
        productos.add(new Producto("P002", "Mouse", 350.00, 25));
        productos.add(new Producto("P003", "Teclado", 800.00, 15));

        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }
    }
}