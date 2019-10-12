package com.alumnos.app.projectMavenAlumnos;

import java.util.ArrayList;

//∫import java.util.ArrayList;

public class Alumnos {
 String nombre;
 
 //constructor 
 public Alumnos(String nombre) {
	 this.nombre = nombre;
 }


 public static void listaAlumnos() {
     Alumnos Karen = new Alumnos("Karen");
	 Alumnos Monica = new Alumnos("Monica");
	 Alumnos Sandra = new Alumnos("Sandra");
	 Alumnos Abi = new Alumnos("Abi");
	 Alumnos Ulises = new Alumnos("Ulises");
	 Alumnos JL = new Alumnos("JL");
	 Alumnos Samuel = new Alumnos("Samuel");
	 ArrayList<Alumnos> alumnos= new ArrayList<Alumnos>();
	 alumnos.add(Karen);
	 alumnos.add(Monica);
	 alumnos.add(Sandra);
	 alumnos.add(Abi);
	 alumnos.add(Ulises);
	 alumnos.add(JL);
	 alumnos.add(Samuel);
	 
	 Mascotas Perro = new Mascotas("Perro policia");
	 Mascotas Gato = new Mascotas("Gato");
	 Mascotas Pez = new Mascotas("Pez");
	 Mascotas Uron = new Mascotas("Uron");
	 Mascotas hamster = new Mascotas("hamster");
	 Mascotas cuyo = new Mascotas("cuyo");
	 Mascotas perico = new Mascotas("Perico");
	 
	 ArrayList<Mascotas> mascotas= new ArrayList<Mascotas>();
	 mascotas.add(Perro);
	 mascotas.add(Gato);
	 mascotas.add(Pez);
	 mascotas.add(Uron);
	 mascotas.add(hamster);
	 mascotas.add(cuyo);
	 mascotas.add(perico);
	 
     
	
	 
	 for (int i=0; i< alumnos.size(); i++) {

			 System.out.println(alumnos.get(i).nombre + " tiene un " + mascotas.get(i).mascota); 
	 }
}
}

