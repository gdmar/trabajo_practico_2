package ar.edu.unju.fi.ejercicio7.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ar.edu.unju.fi.ejercicio5.model.Producto;
import ar.edu.unju.fi.ejercicio5.model.Producto.categoria;

abstract

public class Deposito {

	public static List<Producto> productos = new ArrayList<>();
	public static List<Producto> productosIncrementados = new ArrayList<>();

	/**
	 * Este método muestra descripcion en mayusculas.
	 *
	 */
	public static void mostrarNombre() {
		Function<Producto, Producto> function = (p) -> {
			p.setDescripcion(p.getDescripcion().toUpperCase());
			return p;
		};
		productos = productos.stream().map(function).collect(Collectors.toList());
		productos.forEach(t-> System.out.println(t));
	}

	/**
	 * Este método ordena de manera desendente por precio.
	 *
	 */
	public static void ordenarProductoPorPrecio() {
		Comparator<Producto> comparador = Comparator.comparing(Producto::getPrecioUnitario).reversed();
		Collections.sort(productos, comparador);
		productos.forEach(p -> System.out.println(p));
	}

	/**
	 * Este método muestra los productos de la categoria ELECTOHOGAR.
	 *
	 */
	public static void mostrarCategoria() {
		Predicate<Producto> predicate = p -> (p.isEstado() == true && categoria.ELECTROHOGAR == p.getCat());
		productos = productos.stream().filter(predicate).collect(Collectors.toList());
		productos.forEach(t -> System.out.println(t));
	}

	/**
	 * Este método incrementa el precio de los productos.
	 *
	 */
	public static void incremetoDePrecio() {
		Function<Producto, Producto> funcion = (prod) -> {
			float incremento = prod.getPrecioUnitario() + (prod.getPrecioUnitario() * 0.2f);
			prod.setPrecioUnitario(incremento);
			return prod;
		};
		productosIncrementados = productos.stream().map(funcion).collect(Collectors.toList());
		productosIncrementados.forEach(System.out::println);
	}

	/**
	 * Este método muestra todos los productos NO disponibles usando Predicate y
	 * filter.
	 *
	 */
	public static void filtrarProducto() {
		Predicate<Producto> filter = n -> n.isEstado() == false;
		productos = productos.stream().filter(filter).collect(Collectors.toList());
		productos.forEach(t -> System.out.println(t));

	}

	/**
	 * Este método muestra todos los productos disponibles usando Consumer.
	 *
	 */
	public static void mostrarProducto() {
		Consumer<Producto> consumer = p -> {
			if (p.isEstado() == true) {
				System.out.println(p);
			}
		};
		productos.forEach(consumer);

	}

	public static void precarga() {
		ar.edu.unju.fi.ejercicio5.main.Deposito.precargaProductos();
		productos = ar.edu.unju.fi.ejercicio5.main.Deposito.productos;
	}

}
