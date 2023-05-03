package com.practica.collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

@SpringBootApplication
public class EjemplosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemplosApplication.class, args);
		System.out.println("");
		System.out.println("Corriendo OK");
		System.out.println("");

		//1. Crear ArrayList de num enteros y mostrar por pantalla la suma de todos ellos
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(5);
		numeros.add(20);
		numeros.add(10);

		int suma = 0;
		for (int numero : numeros){
			suma += numero;
		}

		System.out.println("1. La suma es: " + suma);

		//2. Crear ArrayList de cadena de caracteres y mostrar por pantalla la longitud de la cadena más larga
		ArrayList<String> caracteres = new ArrayList<>();

		caracteres.add("Anastacita");
		caracteres.add("Teté");
		caracteres.add("Francisco");

		int longitud = 0;
		String caracterMasLargo = "cero";

		for (int i = 0; i < caracteres.size(); i++){
			if (caracteres.get(i).length() > longitud){
				longitud = caracteres.get(i).length();
				caracterMasLargo = caracteres.get(i);
			}
		}

		System.out.println("2. El caracter más largo es " + caracterMasLargo + ", con " + longitud + " caracteres");


		//3. Crear HashMap con parejas de valores de tipo String (clave) e Integer (valor)
		//y mostrar por pantalla el valor correspondiente a una clave determinada

		HashMap<String, Integer> mapahash = new HashMap<>();
		mapahash.put("Uno", 1);
		mapahash.put("Dos", 2);
		mapahash.put("Tres", 3);

		String clave = "Dos";
		Integer valor = mapahash.get(clave);

		System.out.println("3. Valor de la clave " + clave + ": " + valor);

		//4. Crear HasSet de num enteros y mostrar por pantalla el num más grande
		//NO SE PUEDEN REPETIR NUMEROS
		//COMO HACERLO CON EL FOR NORMAL??
		HashSet<Integer> mapaset = new HashSet<>();
		mapaset.add(56);
		mapaset.add(89);
		mapaset.add(856);

		int longitudMapa = 0;

		for (int numero : mapaset) {
			if (numero > longitudMapa){
				longitudMapa = numero;
			}
		}
		System.out.println("4. El número más grande es: " + longitudMapa);

		//5. Crear una Pila Stack de num enteros y mostrar por pantalla si está vacía o no
		Stack<Integer> pila = new Stack<>();

		pila.push(45);
		pila.push(89);
		pila.push(1);

		if (pila.empty() == true){
			System.out.println("5. La pila está vacía");
		} else {
			System.out.println("5. La pila no está vacía");
		}

		//6.Crear un HasSet de cadena de caracteres y mostrar por pantalla las cedenas que empiezan
		//por una letra determinada
		HashSet<String> mapasetcadenas = new HashSet<>();

		mapasetcadenas.add("Hola");
		mapasetcadenas.add("Mundo");
		mapasetcadenas.add("Hernán");


		char letra = 'H';
		String palabrita = "";
		for (String cadena : mapasetcadenas){
			if (cadena.charAt(0) == letra){
				palabrita = cadena;
				System.out.println("6. La/s palabra/s que empieza/n con " + letra + " es/son: " + palabrita);
			}
		}


		//7. Crear una pila Stack de cadenas de caracteres el orden de la pila pero en orden inverso
		Stack<String> pilacara = new Stack<>();

		pilacara.push("Uno");
		pilacara.push("Dos");
		pilacara.push("Tres");

		System.out.println("7. Pila invertida:");
		for (int i = pilacara.size()-1; i >= 0; i--){
			System.out.println(pilacara.get(i));
		}

		System.out.println("Invertida de otro modo: ");
		while (!pilacara.empty()){
			System.out.println(pilacara.pop());
		}


		System.out.println("¿La pila tiene items?" + pilacara.empty());

		pilacara.push("Cuatro");
		pilacara.push("Cinco");
		pilacara.push("Seis");

		String eliminar6 = pilacara.pop();
		String eliminar5 = pilacara.pop();
		String eliminar4 = pilacara.pop();

		System.out.println("HOLITAS - Nueva pila invertida y eliminada: " + eliminar6 + " " + eliminar5 + " " + eliminar4);

	}

}
