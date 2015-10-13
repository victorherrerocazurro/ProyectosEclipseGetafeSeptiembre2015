package com.ejemplo.colecciones;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lanzador {

	public static void main(String[] args) {

		// Explicacion de Genericos

		Dao<Integer, String> dao = new Dao<Integer, String>();

		dao.insertar(1);

		Integer consultar = dao.consultar("");

		// Mapas

		HashMap<Integer, String> map = new HashMap<>();

		map.put(12, "");
		String string = map.get(12);

		Collection<String> values = map.values();

		// Ordenacion (Comparable y Comparator)

		Set<Persona> treeSet = new TreeSet<>(new ComparatorPersonaInverso());

		// Colecciones

		List<String> listado = new LinkedList<>();

		listado.add("primero");
		listado.add("segundo");
		listado.add("tercero");
		listado.add("cuarto");

		String elementoEnPosicionCero = listado.get(0);

		Iterator<String> iterator = listado.iterator();

		while (iterator.hasNext()) {
			String item = iterator.next();
		}

		for (String item : listado) {

		}

		// Busqueda Binaria con List
		
		Collections.sort(listado);//Obtendriamos que la lista ordeanda, estara ordenada en orden alfabetico

		int posicion = Collections.binarySearch(listado, "cuarto");
		
		Collections.shuffle(listado);
		
	}

}
